
$(document).ready( function(){
    $.getJSON("/escolaridade/", {}, function(data) { 
        data.content.forEach(insertEsc)
     });
     $.getJSON("/area/", {}, function(data) { 
        data.content.forEach(insertArea)
     });
     $.getJSON("/deficiencia/", {}, function(data) { 
        data.content.forEach(insertDefi)
     });
});



function salvarVaga(value){
    vaga={
            "id":"",
            "resumo": "",
            "dataCriacao": "",
            "remuneracao": "",
            "funcao": "",
            "nivel": "",
            "descricao": "",
            "requisitosNecessarios": "",
            "requisitosDesejados": "",
            "beneficios": "",
            "jornadaTrabalho": "",
            "duracaoVaga": "",
            "empresa": "",
            "area": "",
            "escolaridade": "",
            "cursos": [],
            "deficiencias": []
    }
    if(value== "1"){ vaga.id = document.getElementById('id').value;}
   
    vaga.resumo = document.getElementById('resumo-vaga').value;
    vaga.remuneracao=  document.getElementById('remunera').value;
    vaga.funcao =document.getElementById('funcao').value;
    vaga.nivel =  document.getElementById('nivel').value;
    vaga.descricao =  document.getElementById('desc-vaga').value;
    vaga.requisitosNecessarios=  document.getElementById('requi-nece').value;
    vaga.requisitosDesejados = document.getElementById('requi-dese').value;
    vaga.beneficios = "a";
    vaga.jornadaTrabalho =  document.getElementById('jornada').value;
    vaga.duracaoVaga =  document.getElementById('durac-vaga').value;
    vaga.empresa ={"id":document.getElementById('empresa').value};
    vaga.area =  {"id":document.getElementById('area').value};
    vaga.escolaridade = {id: document.getElementById('esc').value};
    vaga.deficiencias =  [{"id":document.getElementById('defi').value}];
    console.log(vaga)
    if(value == "0"){
        $.ajax({
            type: 'POST', 
            contentType: "application/json; charset=utf-8",
            url: "/vaga", 
            data: JSON.stringify(vaga),
            success: function(data) { 
                console.log(data)
            }
        });
    }else{
        $.ajax({
            type: 'PUT', 
            contentType: "application/json; charset=utf-8",
            url: "/vaga/alterar", 
            data: JSON.stringify(vaga),
            success: function(data) { 
                console.log(data)
            }
        });
    }
    
}

function insertEsc (index , item){
    console.log(index)
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("esc").appendChild(node) ; 
  
}
function insertArea (index , item){
    console.log(index)
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("area").appendChild(node) ; 
  
}
function insertDefi (index , item){
    console.log(index)
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("defi").appendChild(node) ; 
  
}

function checkAppend(){
    bene=[]
    for(i=1 ; i< 6;i++){
     document.getElementById("option"+i).value;
      if(document.getElementById("option"+i).checked ==true){
          bene.push(document.getElementById("option"+i).value)
        }

    }

    return bene.toString();
}