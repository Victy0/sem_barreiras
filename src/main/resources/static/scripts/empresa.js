$(document).ready( function(){

    var id = new URL(window.location.href).searchParams.get("id");
    history.replaceState(null, "", location.href.split("?")[0]);

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/estado",
        async: false, 
        success: function(data) { 
            for(var i = 0; i < data.totalElements; i++){
                var estado = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= estado.id;
                opt.innerHTML = estado.uf; 
    
                document.getElementById("estado").appendChild(opt);
            }
        }
    });  

    if(id){

        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/empresa/"+ id,
            async: false, 
            success: function(data) { 
                console.log(data)

                document.getElementById('id').value = data.id;
                document.getElementById('nome').value = data.nome;
                document.getElementById('nomeFantasia').value = data.nomeFantasia;
                document.getElementById('cnpj').value = data.cnpj;
                document.getElementById('email').value = data.email;
                document.getElementById('endereco').value = data.endereco;
                document.getElementById('telefone').value = data.telefone;
                for (var i = 0; i < document.getElementById('estado').options.length; i++) {
                    if (document.getElementById('estado').options[i].value == data.cidade.estado.id) {
                        document.getElementById('estado')[i].selected = true;
                    }
                }

                popularCidade();
                  
                for (var i = 0; i < document.getElementById('cidade').options.length; i++) {
                    if (document.getElementById('cidade').options[i].value == data.cidade.id) {
                        document.getElementById('cidade')[i].selected = true;
                    }
                }     
            }
        }); 
    }

});

function popularCidade(){

    var selectEstado = document.getElementById('estado');
    estadoId = selectEstado.options[selectEstado.selectedIndex].value;
    document.getElementById('cidade').innerHTML = "";
    var opt0 = document.createElement("option");
    opt0.value= 0;
    opt0.innerHTML = "Selecione uma opção";
    document.getElementById("cidade").appendChild(opt0);

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/cidade?estado=" + estadoId,
        async: false, 
        success: function(data) { 
            for(var i = 0; i < data.totalElements; i++){
                var cidade = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= cidade.id;
                opt.innerHTML = cidade.nome; 
    
                document.getElementById("cidade").appendChild(opt);
            }   
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
    empresa.cidade = { id: document.getElementById('cidade').options[document.getElementById('cidade').selectedIndex].value };
    empresa.endereco = document.getElementById('endereco').value;

    if(empresa.id == ""){
        empresa.id = null;
        $.ajax({
            type: 'POST', 
            contentType: "application/json; charset=utf-8",
            url: "/empresa", 
            data: JSON.stringify(empresa),
            success: function(data) { 
                console.log(data)
                if(data.id){
                    document.getElementById("modal").click();
                    localStorage.setItem("p", "/login");
                }else{
                    document.getElementById("modal2").click();
                }
            },
            error: function() {
                document.getElementById("modal2").click();
            }
        
        });
    }else{
        $.ajax({
            type: 'PUT', 
            contentType: "application/json; charset=utf-8",
            url: "/empresa/alterar", 
            data: JSON.stringify(empresa),
            success: function(data) { 
                if(data.id){
                    document.getElementById("modal").click();
                    localStorage.setItem("p", "/listar-vaga");
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
    var url = localStorage.getItem("p");
    localStorage.removeItem("p");
    window.location.replace(url);
}