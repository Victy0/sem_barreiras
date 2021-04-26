$(document).ready( function(){
    $.getJSON("/vaga", {}, function(data) { 

        for(var i =0; i < data.totalElements; i++){
            var vaga = data.content[i];
    
            var body = document.getElementById('corpo');
            var div = document.createElement('div'); //create a div
            var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;
            div.innerHTML = createMyElement(vaga.resumo, local, vaga.empresa.nome);   
            div.id = vaga.id;                      //add an id
            body.appendChild(div);                 //append to the doc.body
            body.insertBefore(div, body.firstChild) //OR insert it
        }
    }); 

});

// function navbar(){
//     var div = document.createElement('div');
//     div.innerHTML =
//         '<header>',
//             '<nav class="navbar navbar-expand-lg navbar-light bg-light" style="margin: 0;">',
//                 '<div class="container">',
//                     '<a class="navbar-brand" href="#">',
//                         '<img src="../img/image 1.png" alt="" width="95" height="95">',
//                     '</a>',
//                     '<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">',
//                         '<span class="navbar-toggler-icon"></span>',
//                     '</button>',
//                     '<div class="collapse navbar-collapse" id="navbarSupportedContent">',
//                         '<ul class="navbar-nav me-auto mb-2 mb-lg-0 me-auto ms-auto">',
//                             '<li class="nav-item mx-4">',
//                                 '<a class="nav-link active" aria-current="page" href="#">VAGAS</a>',
//                             '</li>',
//                             '<li class="nav-item mx-4">',
//                                 '<a class="nav-link" href="#">RECRUTAR</a>',
//                             '</li>',
//                             '<li class="nav-item mx-4">',
//                                 '<a class="nav-link" href="#" tabindex="-1" aria-disabled="true">CURSOS</a>',
//                             '</li>',
//                             '<li class="nav-item mx-4">',
//                                 '<a class="nav-link" href="#" tabindex="-1" aria-disabled="true">PERFIL</a>',
//                             '</li>',
//                             '<li class="nav-item mx-4">',
//                                 '<a class="nav-link" href="#" tabindex="-1" aria-disabled="true">CONFIGURAÇÕES</a>',
//                             '</li>',
//                         '</ul>',
//                     '</div>',
//                 '</div>',
//             '</nav>',
//         '</header>';
//     document.body.appendChild(div);
// }

function createMyElement(vagaNome, local, empresa){
    return [
        '<div class="row">', 
            '<div class="col-2">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
                '<a href="../templates/acessarVaga.html">',
                    '<h3 class="tituloVaga">', vagaNome,'</h3>',
                    '<p class="textoLocalVaga">', local,'</p>',
                    '<p class="textoEmpresaVaga">', empresa,'</p>',
                '</a>',
            '</div>',
            '<div class="col-1">',
                '<img src="../img/Vector2.png" class="vectorVaga1">',
                '<br>',
                '<img src="../img/Vector.png" class="vectorVaga2 mt-4">',
            '</div>',
        '</div>',
        '<hr>'
        ].join('\n');
 }
