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
    console.log(vaga.beneficios, vaga.requisitoDesejados);
    
    return [
        '<div class="row">', 
            '<div class="col-2">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
                '<h3 class="tituloVaga">', vaga.resumo,'</h3>',
                '<p class="textoLocalVaga">', local,'</p>',
                '<p class="textoEmpresaVaga">', vaga.empresa.nome,'</p>',
                '<p class="textoEmpresaVaga">', vaga.nivel,'</p>',
                '<p class="textoEmpresaVaga">', vaga.area.descricao,'</p>',
            '</div>',
            '<div class="col-1">',
                '<img src="../img/Vector2.png" class="vectorVaga1">',
                '<br>',
                '<img src="../img/Vector.png" class="vectorVaga2 mt-4">',
            '</div>',
        '</div>',
        `<div class="row mt-4 mb-3">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Descrição da vaga: </h2>',
                '<p class="textoLocalVaga">', vaga.resumo,'</p>',
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
        `<div class="row">`,
            '<button class="btn btn" onclick="candidatarVaga()">Candidatar-se a vaga</button>' ,
        '</div>',
        
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
        console.log(vaga, listItem);
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
        console.log(vaga, listItem);
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