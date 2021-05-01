$(document).ready( function(){

    var id = new URL(window.location.href).searchParams.get("id");
    history.replaceState(null, "", location.href.split("?")[0]);

    console.log(id);

    $.getJSON("/vaga/"+id, {}, function(data) { 

        var vaga = data;

        var body = document.getElementById('corpo');
        var div = document.createElement('div'); //create a div
        div.innerHTML = createMyElement(vaga);   
        div.id = vaga.id;                      //add an id
        body.appendChild(div);                 //append to the doc.body
        body.insertBefore(div, body.firstChild) //OR insert it
    }); 

});

function createMyElement(vaga){
    var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;
    for(var i = 0; i < vaga.requisitosDesejados; i++){
        var requisito = data.content[i];

        var requisito = document.createElement("li");
        requisito.value= escolaridade.id;
        requisito.innerHTML = escolaridade.descricao; 

        document.getElementById("listEscolaridade").appendChild(opt);
    }
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
        `<div class="row my-3">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Descrição da vaga: </h2>',
                '<p class="textoLocalVaga">', vaga.resumo,'</p>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Requisitos necessários: </h2>',
                '<ul>',
                    '<li>',vaga.requisitosNecessarios,'</li>',
                    '<li>Domínio em PHP, CSS, Java Script, React, Bancos de dados</li>',
                '</ul>',
            '</div>',
        '</div>', 
        `<div class="row">`,
            '<div class="col-12">',
                '<h2 class="tituloVaga"> Requisitos desejados: </h2>',
                '<ul>',
                    '<li>',vaga.requisitosDesejados,'</li>',
                    '<li>Domínio em PHP, CSS, Java Script, React, Bancos de dados</li>',
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
                '<ul>',
                    '<li>',vaga.jornadaTrabalho,'</li>',
                '</ul>',
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
                '<ul>',
                    '<li>',vaga.remuneracao,'</li>',
                '</ul>',
            '</div>',
        '</div>', 
        ].join('\n');
 }

