$(document).ready( function(){
    $.getJSON("/vaga", {}, function(data) { 

        for(var i =0; i < data.totalElements; i++){
            var vaga = data.content[i];
    
            var body = document.getElementById('corpo');
            var div = document.createElement('div'); //create a div
            var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;
            div.innerHTML = createMyElement(vaga.resumo, local, vaga.empresa.nome);   
            div.id = vaga.id;
            console.log(div);                         //add an id
            body.appendChild(div);                 //append to the doc.body
            body.insertBefore(div, body.firstChild) //OR insert it
        }
    }); 

});


function createMyElement(vagaNome, local, empresa){
    return [
        '<div class="row">', 
            '<div class="col-2">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
                '<h3 class="tituloVaga">', vagaNome,'</h3>',
                '<p class="textoLocalVaga">', local,'</p>',
                '<p class="textoEmpresaVaga">', empresa,'</p>',
            '</div>',
            '<div class="col-1">',
                '<img src="../img/Vector2.png" class="vectorVaga1">',
                '<br>',
                '<img src="../img/Vector.png" class="vectorVaga2 mt-4">',
            '</div>',
            '<hr>'
        ].join('\n');
 }
