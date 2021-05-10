$(document).ready( function(){

    var loged= localStorage.getItem("on");
    var url = "/vaga";
    if(loged != null && loged != undefined){
        url = "/vaga?empresa=" + loged;
    }

    $.getJSON(url, {}, function(data) { 

        document.getElementById("background-loading").style.display = "flex";
        document.getElementById("loading").style.display = "flex";

        for(var i = 0; i < data.totalElements; i++){
            var vaga = data.content[i];
    
            var body = document.getElementById('corpo');
            var div = document.createElement('div'); 
            var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;
            div.innerHTML = createMyElement(vaga.id, vaga.resumo, local, vaga.empresa.nome, vaga.deficiencias);   
            div.id = vaga.id;                      
            body.appendChild(div);                 
            body.insertBefore(div, body.firstChild);
            var result = document.getElementById('textoResultado');
            result.innerHTML = data.totalElements + ' resultados';
        }

        document.getElementById("background-loading").style.display = "none";
        document.getElementById("loading").style.display = "none";
    }); 

    // popular filtros
    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/empresa", 
        success: function(data) { 
            var opt0 = document.createElement("option");
            opt0.value= 0;
            opt0.innerHTML = "Selecione uma opção";
            document.getElementById("listEmpresa").appendChild(opt0);
            for(var i = 0; i < data.totalElements; i++){
                var empresa = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= empresa.id;
                opt.innerHTML = empresa.nome; 
    
                document.getElementById("listEmpresa").appendChild(opt);
            }
        }
    }); 

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/estado", 
        success: function(data) { 
            var opt0 = document.createElement("option");
            opt0.value= 0;
            opt0.innerHTML = "Selecione uma opção";
            document.getElementById("listEstado").appendChild(opt0);
            for(var i = 0; i < data.totalElements; i++){
                var estado = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= estado.id;
                opt.innerHTML = estado.uf; 
    
                document.getElementById("listEstado").appendChild(opt);
            }
        }
    }); 

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/area", 
        success: function(data) { 
            var opt0 = document.createElement("option");
            opt0.value= 0;
            opt0.innerHTML = "Selecione uma opção";
            document.getElementById("listArea").appendChild(opt0);
            for(var i = 0; i < data.totalElements; i++){
                var area = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= area.id;
                opt.innerHTML = area.descricao; 
    
                document.getElementById("listArea").appendChild(opt);
            }
        }
    }); 

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/deficiencia", 
        success: function(data) { 
            var opt0 = document.createElement("option");
            opt0.value= 0;
            opt0.innerHTML = "Selecione uma opção";
            document.getElementById("listDeficiencia").appendChild(opt0);
            for(var i = 0; i < data.totalElements; i++){
                var deficiencia = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= deficiencia.id;
                opt.innerHTML = deficiencia.descricao; 
    
                document.getElementById("listDeficiencia").appendChild(opt);
            }
        }
    }); 

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/escolaridade",
        success: function(data) { 
            var opt0 = document.createElement("option");
            opt0.value= 0;
            opt0.innerHTML = "Selecione uma opção";
            document.getElementById("listEscolaridade").appendChild(opt0);
            for(var i = 0; i < data.totalElements; i++){
                var escolaridade = data.content[i];
    
                var opt = document.createElement("option");
                opt.value= escolaridade.id;
                opt.innerHTML = escolaridade.descricao; 
    
                document.getElementById("listEscolaridade").appendChild(opt);
            }
        }
    }); 
});

function createMyElement(vagaId, vagaNome, local, empresa, deficiencias){

    var loged= localStorage.getItem("on");
    var url = "/acessar-vaga?id=";
    if(loged != null && loged != undefined){
        url = "/cadastro-vaga?id=";
    }

    var complemento = "";
    for( var i =0; i < deficiencias.length; i++){
        if(complemento != ""){
            complemento = complemento + '<br>';
        }
        if(deficiencias[i].descricao == "auditiva" ){
            complemento = complemento + `<img src="../img/Vector2.png" class="vectorVaga1" onclick="falar('deficiencia auditiva', 't')">`;
        }
        if(deficiencias[i].descricao == "visual" ){
            complemento = complemento + `<img src="../img/Vector.png" class="vectorVaga2 mt-4" onclick="falar('deficiencia visual', 't')">`;
        }
    }

    return [
        '<div class="row">', 
            '<div class="col-2">',
                '<img src="../img/Rectangle.png" class="imgVaga">',
            '</div>',
            '<div class="col-9">',
            '<a href="' + url + vagaId + '">',
                `<h3 class="tituloVaga" id="vaga` + vagaId + `" onclick="falar('vaga` + vagaId+ `', 'i')">`, vagaNome,'</h3>',
            '</a>',
                `<p class="textoLocalVaga" id="local` + vagaId + `" onclick="falar('local` + vagaId+ `', 'i')">`, local,'</p>',
                `<p class="textoEmpresaVaga" id="empresa` + vagaId + `" onclick="falar('empresa` + vagaId+ `', 'i')">`, empresa,'</p>',
            '</div>',
            '<div class="col-1">' + complemento,
            '</div>',
        '</div>',
        '<hr>'
        ].join('\n');
 }

 function filtrar(origem, event){

    if(origem == "P" && (event.keyCode || event.which) != 13){
        return;
    }

    var filterParam = "";
    if (document.getElementById("pesquisar").value != ""){
        filterParam = filterParam + "&pesq=" + document.getElementById("pesquisar").value;
    }
    if (document.getElementById("listEmpresa").value != "0"){
        filterParam = filterParam + "&empresa=" + document.getElementById("listEmpresa").value;
    }
    if (document.getElementById("listEstado").value != "0"){
        filterParam = filterParam + "&estado=" + document.getElementById("listEstado").value;
    }
    if (document.getElementById("listArea").value != "0"){
        filterParam = filterParam + "&area=" + document.getElementById("listArea").value;
    }
    if (document.getElementById("listDeficiencia").value != "0"){
        filterParam = filterParam + "&deficiencia=" + document.getElementById("listDeficiencia").value;
    }
    if (document.getElementById("listEscolaridade").value != "0"){
        filterParam = filterParam + "&escolaridade=" + document.getElementById("listEscolaridade").value;
    }
    if(document.getElementById("remuneracao").value != ""){
        filterParam = filterParam + "&remuneracao=" + document.getElementById("remuneracao").value;
    }
    filterParam = filterParam.replace("&", "?");

    document.getElementById('corpo').innerHTML = "";

    document.getElementById("background-loading").style.display = "flex";
    document.getElementById("loading").style.display = "flex";

    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/vaga" + filterParam,
        async: false, 
        success: function(data) { 

            for(var i = 0; i < data.totalElements; i++){
                var vaga = data.content[i];
        
                var body = document.getElementById('corpo');
                var div = document.createElement('div'); 
                var local = vaga.empresa.cidade.nome + ' - ' + vaga.empresa.cidade.estado.uf;
                div.innerHTML = createMyElement(vaga.id, vaga.resumo, local, vaga.empresa.nome, vaga.deficiencias);   
                div.id = vaga.id;                      
                body.appendChild(div);                 
                body.insertBefore(div, body.firstChild);
                var result = document.getElementById('textoResultado');
                result.innerHTML = data.totalElements + ' resultados';
            }

            document.getElementById("background-loading").style.display = "none";
            document.getElementById("loading").style.display = "none";
        }
    });  
 }