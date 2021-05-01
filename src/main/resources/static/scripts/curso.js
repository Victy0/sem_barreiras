$(document).ready(function () {
    $.getJSON("/curso", {}, function (data) {
        console.log(data)
    });

    if (ehEdicao()) {
        buscarCurso();
    }
    $.getJSON("/curso", {}, function (data) {
        for(var i =0; i < data.totalElements; i++){
            var curso = data.content[i];
            console.log(curso);
            var body = document.getElementById('corpo');
            var div = document.createElement('div'); //create a div
            div.innerHTML = createMyElement(curso);   
            div.id = curso.id;                      //add an id
            body.appendChild(div);                 //append to the doc.body
            body.insertBefore(div, body.firstChild) //OR insert it
        }
    });
});

function salvarCurso() {
    let curso = {
        id: document.getElementById('id-curso').value,
        nome: document.getElementById('nome-curso').value,
        descricao: document.getElementById('descricao-curso').value,
        hyperLink: document.getElementById('hiperlink-curso').value,
        preco: document.getElementById('preco-curso').value,
    }

    console.log(curso)
    if (!curso.id) {
        $.ajax({
            type: 'POST',
            contentType: "application/json; charset=utf-8",
            url: "/curso",
            data: JSON.stringify(curso),
            success: function (data) {
                console.log(data)
            }
        });
    } else {
        $.ajax({
            type: 'PUT',
            contentType: "application/json; charset=utf-8",
            url: "/curso/alterar",
            data: JSON.stringify(curso),
            success: function (data) {
                console.log(data)
            }
        });
    }

}

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
                console.log("CURSO ENCONTRADO: ", data);

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
            '<div class="col-1">',
                '<img src="../img/Vector2.png" class="vectorVaga1">',
                '<br>',
                '<img src="../img/Vector.png" class="vectorVaga2 mt-4">',
            '</div>',
        '</div>',
        '<hr>'
        ].join('\n');
 }
