$(document).ready(function () {
     
    if (ehEdicao()) {
        buscarCurso();
    }
    $.getJSON("/curso", {}, function (data) {

        document.getElementById("background-loading").style.display = "flex";
    document.getElementById("loading").style.display = "flex";

        for(var i =0; i < data.totalElements; i++){
            var curso = data.content[i];
            console.log(curso);
            var body = document.getElementById('corpo');
            var div = document.createElement('div'); 
            div.innerHTML = createMyElement(curso);   
            div.id = curso.id;                      
            body.appendChild(div);                 
            body.insertBefore(div, body.firstChild) 
        }

        document.getElementById("background-loading").style.display = "none";
    document.getElementById("loading").style.display = "none";
    
    });
});



function ehEdicao() {
    let path = window.location.pathname;
    console.log("PATH ATUAL: ", path);
    console.log("É EDIÇÃO: ", path.includes("editar-curso"));

    return path.includes("editar-curso");
}

function buscarCurso() {
    let id = new URL(window.location.href).searchParams.get("id");
    const urlToRedirect = window.location.protocol + "/cadastro-curso";

    if (id) {

        $.ajax({
            type: 'GET',
            contentType: "application/json; charset=utf-8",
            url: `/curso/${id}`,
            async: false,
            success: function (data) {

                document.getElementById('id-curso').value = data.id;
                document.getElementById('nome-curso').value = data.nome;
                document.getElementById('descricao-curso').value = data.descricao;
                document.getElementById('hiperlink-curso').value = data.hyperLink;
                document.getElementById('preco-curso').value = data.preco;
            },
            error: function () {
                window.location.replace(urlToRedirect);
            }
        });
    } else {
        window.location.replace(urlToRedirect);
    }
}


function createMyElement(curso){

    return [
        '<div class="row">', 
            '<div class="col-2">',
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

 function filtrar(){

    var filterParam = "";
    if(document.getElementById("precoMinimo").value != ""){
        filterParam = filterParam + "&precoMinimo=" + document.getElementById("precoMinimo").value;
    }
    filterParam = filterParam.replace("&", "?");

    document.getElementById('corpo').innerHTML = "";

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/curso" + filterParam,
        async: false, 
        success: function(data) { 

            document.getElementById("background-loading").style.display = "flex";
            document.getElementById("loading").style.display = "flex";
        
            for(var i =0; i < data.totalElements; i++){
                var curso = data.content[i];
                console.log(curso);
                var body = document.getElementById('corpo');
                var div = document.createElement('div'); 
                div.innerHTML = createMyElement(curso);   
                div.id = curso.id;                      
                body.appendChild(div);                 
                body.insertBefore(div, body.firstChild) 
            }
            var result = document.getElementById('textoResultado');
            result.innerHTML = data.totalElements + ' resultados';

            document.getElementById("background-loading").style.display = "none";
            document.getElementById("loading").style.display = "none";
        }

    });  
 }
