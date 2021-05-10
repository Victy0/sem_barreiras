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

        document.getElementById("background-loading").style.display = "none";
        document.getElementById("loading").style.display = "none";
        
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
                `<h2 class="tituloVaga" id="vaga` + vaga.id + `" onclick="falar('vaga` + vaga.id + `', 'i')">`, vaga.resumo,'</h2>',
                `<p class="textoLocalVaga" onclick="falar('Local ` + local + `', 't')" > <b>Local: </b>`, local,'</p>',
                `<p class="textoEmpresaVaga" onclick="falar('Empresa ` + vaga.empresa.nome + `', 't')"> <b>Empresa: </b>`, vaga.empresa.nome,'</p>',
                `<p class="textoEmpresaVaga" onclick="falar('Nível ` + vaga.nivel + `', 't')"> <b>Nível: </b>`, vaga.nivel,'</p>',
                `<p class="textoEmpresaVaga" onclick="falar('Área  de atuação ` + vaga.area.descricao + `', 't')"> <b>Área de atuação: </b>`, vaga.area.descricao,'</p>',
            '</div>',
            '<div class="col-1">' + complemento,
            '</div>',
        '</div>',
        `<div class="row mt-4 mb-3">`,
            '<div class="col-12">',
                `<h2 class="tituloVaga" onclick="falar('Descrição da vaga ` + vaga.descricao + `', 't')"> Descrição da vaga: </h2>`,
                `<p class="textoLocalVaga" onclick="falar('Descrição da vaga ` + vaga.descricao + `', 't')">`, vaga.descricao,'</p>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-6">',
                `<h2 class="tituloVaga" onclick="falar('Deficiências', 't')"> Deficiências: </h2>`,
                '<ul>',
                    listaDeficiencias(vaga.deficiencias),
                '</ul>',
            '</div>',
            '<div class="col-6">',
                `<h2 class="tituloVaga" onclick="falar('Faixa salarial R$` + vaga.remuneracao + `', 't')"> Faixa salarial: </h2>`,
                `<p id="textRemuneracao" onclick="falar('Faixa salarial ` + vaga.remuneracao + `', 't')"></p>`,
            '</div>',
        '</div>',
        `<div class="row">`,
            '<div class="col-12">',
                `<h2 class="tituloVaga" onclick="falar('Requisitos necessários ` + vaga.requisitosNecessarios + `', 't')"> Requisitos necessários: </h2>`,
                '<ul id="listRequisitosNecessarios">',
                '</ul>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-12">',
                `<h2 class="tituloVaga" onclick="falar('Requisitos desejados ` + vaga.requisitosDesejados + `', 't')"> Requisitos desejados: </h2>`,
                '<ul id="listRequisitosDesejados">',
                '</ul>',
            '</div>',
        '</div>',
        `<div class="row">`,
            '<div class="col-6">',
                `<h2 class="tituloVaga" onclick="falar('Escolaridade` + vaga.escolaridade.descricao + `', 't')"> Escolaridade: </h2>`,
                '<ul>',
                    `<li onclick="falar('Escolaridade` + vaga.escolaridade.descricao + `', 't')">`,vaga.escolaridade.descricao,`</li>`,
                '</ul>',
            '</div>',
            '<div class="col-6">',
                `<h2 class="tituloVaga" onclick="falar('Jornada de trabalho ` + vaga.jornadaTrabalho + ` horas', 't')"> Jornada de Trabalho: </h2>`,
                `<p id="textJornada", 't')"></p>`,
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-6">',
                '<h2 class="tituloVaga"> Benefícios: </h2>',
                '<ul>',
                    `<li onclick="falar('Benefícios ` + vaga.beneficios + `', 't')">`,vaga.beneficios,'</li>',
                '</ul>',
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
            `<div class="col-5" onclick="falar('Ver cursos relacionados','t')">`,
                '<button class="btn btn-confirm" data-bs-toggle="modal" onclick="resgataCursos('+vaga.id+')" data-bs-target="#modalCursos">Ver cursos relacionados</button>',
            '</div>',
            `<div class="col-4" onclick="falar('Candidatar-se a vaga','t')">`,
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
            listItem.onclick = function falar(){
                if(document.getElementById("voz").value == "0"){
                    return;
                }
                responsiveVoice.speak( 'Requisitos necessários ' + vaga.requisitosNecessarios , "Brazilian Portuguese Female");
            }
            document.getElementById("listRequisitosNecessarios").appendChild(listItem);
        }
    }
    else{
        var requisito = vaga;
        var listItem = document.createElement("li");
        listItem.innerHTML = "Sem dados fornecidos.";
        listItem.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Requisitos necessários Sem dados fornecidos.', "Brazilian Portuguese Female");
        } 
        document.getElementById("listRequisitosNecessarios").appendChild(listItem);
    }
    if(vaga.requisitosDesejados != 'sem requisitos listados'){
        var req2 = vaga.requisitosDesejados.split(",")
        for(var i = 0; i < req2.length ; i++){
            var requisito = req2[i];
            
            var listItem = document.createElement("li");
            listItem.innerHTML = requisito; 
            listItem.onclick = function falar(){
                if(document.getElementById("voz").value == "0"){
                    return;
                }
                responsiveVoice.speak( 'Requisitos desejados ' + vaga.requisitosDesejados , "Brazilian Portuguese Female");
            }
            document.getElementById("listRequisitosDesejados").appendChild(listItem);
        }
    }
    else{
        var requisito = vaga;
        var listItem = document.createElement("li");
        listItem.innerHTML = "Sem dados fornecidos."; 
        listItem.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Requisitos desejados Sem dados fornecidos.', "Brazilian Portuguese Female");
        } 
        document.getElementById("listRequisitosDesejados").appendChild(listItem);
    }
    if(vaga.remuneracao){
        var texto = document.getElementById("textRemuneracao");
        texto.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Faixa salarial R$' + vaga.remuneracao , "Brazilian Portuguese Female");
        }
        texto.innerHTML = 'R$' + vaga.remuneracao;
    }
    else{
        var texto = document.getElementById("textRemuneracao");
        texto.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Remuneração Sem dados fornecidos.', "Brazilian Portuguese Female");
        } 
        texto.innerHTML = "Sem dados fornecidos.";
    }
    if(vaga.jornadaTrabalho){
        var texto = document.getElementById("textJornada");
        texto.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Jornada de trabalho' + vaga.jornadaTrabalho + ' horas', "Brazilian Portuguese Female");
        } 
        texto.innerHTML = vaga.jornadaTrabalho + ' h';
    }
    else{
        var texto = document.getElementById("textJornada");
        texto.onclick = function falar(){
            if(document.getElementById("voz").value == "0"){
                return;
            }
            responsiveVoice.speak( 'Jornada de trabalho Sem dados fornecidos.', "Brazilian Portuguese Female");
        } 
        texto.innerHTML = "Sem dados fornecidos.";
    }
}

function candidatarVaga(){

    document.getElementById("background-loading").style.display = "flex";
    document.getElementById("loading").style.display = "flex";

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

    document.getElementById("background-loading").style.display = "none";
    document.getElementById("loading").style.display = "none";
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
            `<div class="col-9" onclick="falar('` + curso.nome + `', 't')">`,
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
        li = li + `<li onclick="falar('` + deficiencias[i].descricao + `', 't')">` + deficiencias[i].descricao + '</li>';
    }
    return li;
}