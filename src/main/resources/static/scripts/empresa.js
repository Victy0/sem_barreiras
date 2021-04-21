$(document).ready( function(){
    $.getJSON("/estado", {}, function(data) { 

        for(var i = 0; i < data.totalElements; i++){
            var estado = data.content[i];

            var opt = document.createElement("option");
            opt.value= estado.id;
            opt.innerHTML = estado.uf; 

            document.getElementById("estado").appendChild(opt);
        }
    }); 

});

function popularCidade(){
    var selectEstado = document.getElementById('estado');
    estadoId = selectEstado.options[selectEstado.selectedIndex].value;
    document.getElementById('cidade').innerHTML = "";
    var opt0 = document.createElement("option");
    opt0.value= 0;
    opt0.innerHTML = "Selecione uma opção";
    document.getElementById("cidade").appendChild(opt0);

    $.getJSON("/cidade?estado=" + estadoId, {}, function(data) { 

        for(var i = 0; i < data.totalElements; i++){
            var cidade = data.content[i];

            var opt = document.createElement("option");
            opt.value= cidade.id;
            opt.innerHTML = cidade.nome; 

            document.getElementById("cidade").appendChild(opt);
        }
    }); 
}

function salvar(){
    var empresa = {};
    empresa.id = document.getElementById('id').value;
    empresa.nome = document.getElementById('nome').value;
    empresa.nomeFantasia = document.getElementById('nomeFantasia').value;
    empresa.cnpj = document.getElementById('cnpj').value;
    empresa.email = document.getElementById('email').value;
    empresa.telefone = document.getElementById('telefone').value;
    empresa.cidade = document.getElementById('cidade').options[document.getElementById('cidade').selectedIndex].value;
    empresa.endereco = document.getElementById('endereco').value;

    if(id == ""){
       
        $.ajax({
            type: 'POST', 
            contentType: "application/json; charset=utf-8",
            url: "/empresa", 
            data: JSON.stringify(empresa),
            success: function(data) { 
                console.log(data)
            }
        
        }); 
    }else{
        $.putJSON("/empresa/alterar", {empresa}, function(data) { 
            console.log(data)
        }); 
    }
}