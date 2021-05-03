$(document).ready( function(){

    var id = new URL(window.location.href).searchParams.get("id");
    history.replaceState(null, "", location.href.split("?")[0]);

    $.getJSON("/vaga/"+id, {}, function(data) { 
       
        var vaga = data;
        var body = document.getElementById('corpo');
        var div = document.createElement('div'); //create a div
        div.innerHTML = createMyElement(vaga);   
        div.id = vaga.id;                      //add an id
        body.appendChild(div);                 //append to the doc.body
        body.insertBefore(div, body.firstChild);
        preencherDadosListados(vaga);
        
    }); 

});

function createMyElement(vaga){
    var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;

    var complemento = "";
    for( var i =0; i < vaga.deficiencias.length; i++){
        if(complemento != ""){
            complemento = complemento + '<br>';
        }
        if( vaga.deficiencias[i].descricao == "auditiva" ){
            complemento = complemento + '<img src="../img/Vector2.png" class="vectorVaga1">';
        }
        if( vaga.deficiencias[i].descricao == "visual" ){
            complemento = complemento + '<img src="../img/Vector.png" class="vectorVaga2 mt-4">';
        }
    }
    
    return [
        '<div class="row">', 
            '<input type="hidden" id="idVaga" value="' +  vaga.id + '">',
            '<div class="col-2">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
                '<h3 class="tituloVaga">', vaga.resumo,'</h3>',
                '<p class="textoLocalVaga"> <b>Local: </b>', local,'</p>',
                '<p class="textoEmpresaVaga"> <b>Empresa: </b>', vaga.empresa.nome,'</p>',
                '<p class="textoEmpresaVaga"> <b>Nível: </b>', vaga.nivel,'</p>',
                '<p class="textoEmpresaVaga"> <b>Área de atuação: </b>', vaga.area.descricao,'</p>',
            '</div>',
            '<div class="col-1">' + complemento,
            '</div>',
        '</div>',
        `<div class="row mt-4 mb-3">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Descrição da vaga: </h2>',
                '<p class="textoLocalVaga">', vaga.resumo,'</p>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Deficiências: </h2>',
                '<ul>',
                    listaDeficiencias(vaga.deficiencias),
                '</ul>',
            '</div>',
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Faixa salarial: </h2>',
                '<p id="textRemuneracao"></p>',
            '</div>',
        '</div>',
        `<div class="row">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Requisitos necessários: </h2>',
                '<ul id="listRequisitosNecessarios">',
                '</ul>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Requisitos desejados: </h2>',
                '<ul id="listRequisitosDesejados">',
                '</ul>',
            '</div>',
        '</div>',
        `<div class="row">`,
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Escolaridade: </h2>',
                '<ul>',
                    '<li>',vaga.escolaridade.descricao,'</li>',
                '</ul>',
            '</div>',
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Jornada de Trabalho: </h2>',
                '<p id="textJornada"></p>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Benefícios: </h2>',
                '<ul>',
                    '<li>',vaga.beneficios,'</li>',
                '</ul>',
            '</div>',
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Faixa salarial: </h2>',
                '<p id="textRemuneracao"></p>',
            '</div>',
        '</div>',
        '<div class="row my-5 justify-content-end no-gutters">',
            '<div class="col-3">',
                '<img class="img-responsive" src="../img/img1.png" style="border-radius: 10px;">',
            '</div>',
            '<div class="col-3">',
                '<img class="img-responsive" src="../img/img2.png" style="border-radius: 10px;">',
            '</div>',
            '<div class="col-3">',
                '<img class="img-responsive" src="../img/img3.png" style="border-radius: 10px;">',
            '</div>',
            '<div class="col-3">',
                '<img class="img-responsive" src="../img/img4.png" style="border-radius: 10px;">',
            '</div>',
        '</div>',
        '<div class="row mb-5 mr-3 justify-content-end">',
            '<div class="col-5">',
                '<button class="btn btn-confirm" data-bs-toggle="modal" onclick="resgataCursos('+vaga.id+')" data-bs-target="#modalCursos">Ver cursos relacionados</button>',
            '</div>',
            '<div class="col-4">',
                '<button class="btn btn-outline-confirm" onclick="abre()">Candidatar-se a vaga</button>',
            '</div>',
        '</div>'
        ].join('\n');
 }

function preencherDadosListados(vaga){
    if(vaga.requisitosNecessarios != 'sem requisitos listados'){
        var req = vaga.requisitosNecessarios.split(",")
        for(var i = 0; i < req.length ; i++){
            var requisito = req[i];
           
            var listItem = document.createElement("li");
            listItem.innerHTML = requisito;
            document.getElementById("listRequisitosNecessarios").appendChild(listItem);
        }
    }
    else{
        var requisito = vaga;
        var listItem = document.createElement("li");
        listItem.innerHTML = "Sem dados fornecidos."; 
        document.getElementById("listRequisitosNecessarios").appendChild(listItem);
    }
    if(vaga.requisitosDesejados != 'sem requisitos listados'){
        var req2 = vaga.requisitosDesejados.split(",")
        for(var i = 0; i < req2.length ; i++){
            var requisito = req2[i];
            
            var listItem = document.createElement("li");
            listItem.innerHTML = requisito; 
            document.getElementById("listRequisitosDesejados").appendChild(listItem);
        }
    }
    else{
        var requisito = vaga;
        var listItem = document.createElement("li");
        listItem.innerHTML = "Sem dados fornecidos."; 
        document.getElementById("listRequisitosDesejados").appendChild(listItem);
    }
    if(vaga.remuneracao){
        var texto = document.getElementById("textRemuneracao");
        texto.innerHTML = vaga.remuneracao;
    }
    else{
        var texto = document.getElementById("textRemuneracao");
        texto.innerHTML = "Sem dados fornecidos.";
    }
    if(vaga.jornadaTrabalho){
        var texto = document.getElementById("textJornada");
        texto.innerHTML = vaga.jornadaTrabalho;
    }
    else{
        var texto = document.getElementById("textJornada");
        texto.innerHTML = "Sem dados fornecidos.";
    }
}

function candidatarVaga(){

    document.getElementById('id01').style.display='none';

    var idVaga = document.getElementById("idVaga").value;
    var dados = {};
    dados.nome = document.getElementById("nome").value;
    dados.email = document.getElementById("email").value;
    dados.telefone = document.getElementById("telefone").value;

    $.ajax({
        type: 'POST', 
        contentType: "application/json; charset=utf-8",
        url: "/vaga/candidatar/" + idVaga, 
        data: JSON.stringify(dados)
    });
}

function abre(){
    document.getElementById("id01").style.display="block";
}

function resgataCursos(id){
    $.getJSON("/vaga/"+id, {}, function(data) { 
        vaga = data;
        var body = document.getElementById('modal-body');
        body.innerHTML = '';
        for(var i =0; i < vaga.cursos.length; i++){
            var curso = vaga.cursos[i];           
            var div = document.createElement('div'); 
            div.innerHTML = createCurso(curso);   
            div.id = curso.id;                      
            body.appendChild(div);                 
            body.insertBefore(div, body.firstChild);
        }
        
    }); 
}

function createCurso(curso){
    return [
        '<div class="row">', 
            '<div class="col-3">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
                '<a href="' + curso.hyperLink + '">',
                    '<h3 class="tituloVaga">', curso.nome,'</h3>',
                    '<p class="textoLocalVaga">', curso.descricao,'</p>',
                    '<p class="textoEmpresaVaga">', curso.preco,'</p>',
                '</a>',
            '</div>',
        '</div>',
        '<hr>'
        ].join('\n');
 }

function listaDeficiencias(deficiencias){
    var li = "";
    for(var i=0; i<deficiencias.length; i++){
        li = li + '<li>' + deficiencias[i].descricao + '</li>';
    }
    return li;
}