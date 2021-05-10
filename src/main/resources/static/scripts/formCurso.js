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
                if(data.id){
                    document.getElementById("modal").click();
                }else{
                    document.getElementById("modal2").click();
                }
            },
            error: function() {
                document.getElementById("modal2").click();
            }
        });
    } else {
        $.ajax({
            type: 'PUT',
            contentType: "application/json; charset=utf-8",
            url: "/curso/alterar",
            data: JSON.stringify(curso),
            success: function (data) {
                if(data.id){
                    document.getElementById("modal").click();
                }else{
                    document.getElementById("modal2").click();
                }
            },
            error: function() {
                document.getElementById("modal2").click();
            }
        });
    }

}

function alterarPagina(){
    window.location.replace("/listar-curso");
}