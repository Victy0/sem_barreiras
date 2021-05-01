
$(document).ready( function(){
    var loged= localStorage.getItem("on")
   if(loged){
    $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/escolaridade/",
        async: false, 
        success: function(data) { 
            data.content.forEach(insertEsc)
        }
    });
     $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/area/",
        async: false, 
        success: function(data) { 
            data.content.forEach(insertArea)
        }
    });
     $.ajax({
        type: 'GET', 
        contentType: "application/json; charset=utf-8",
        url: "/deficiencia",
        async: false, 
        success: function(data) { 
            data.content.forEach(insertDefi)
        }
    }); 
     var id = new URL(window.location.href).searchParams.get("id");
      history.replaceState(null, "", location.href.split("?")[0]);
     if(id){
        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/vaga/"+ id,
            async: false, 
            success: function(data) { 
                console.log(data)
                document.getElementById('id').value = data.id;
                 document.getElementById('resumo-vaga').value = data.resumo ;
                 document.getElementById('remunera').value = data.remuneracao;
                 document.getElementById('funcao').value   = data.funcao;
                 document.getElementById('nivel').value  = data.nivel ;
                 document.getElementById('desc-vaga').value = data.descricao ;
                 document.getElementById('requi-nece').value = data.requisitosNecessarios;
                 document.getElementById('requi-dese').value = data.requisitosDesejados ;
                 checkDissolve(data.beneficios)
                document.getElementById('jornada').value = data.jornadaTrabalho ;
                document.getElementById('durac-vaga').value = data.duracaoVaga ;
                for (var i = 0; i < document.getElementById('area').options.length; i++) {
                    if (document.getElementById('area').options[i].value == data.area.id) {
                     

                        document.getElementById('area')[i].selected = true;
                    }
                }
                for (var i = 0; i < document.getElementById('esc').options.length; i++) {
                    if (document.getElementById('esc').options[i].value == data.escolaridade.id) {
                        
                        document.getElementById('esc')[i].selected = true;
                    }
                }
                for (var i = 0; i < document.getElementById('defi').options.length; i++) {
                    if (document.getElementById('defi').options[i].value == data.deficiencias[0].id) {
                        
                        document.getElementById('defi')[i].selected = true;
                    }
                }
                 
               
                    
            }
        }); 
     }
    }else{
        window.location.replace("/login");
    }
});



function salvarVaga(){
    const urlParams = new URLSearchParams(window.location.search);
    const myParam = urlParams.get('id');
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
   vaga.id = document.getElementById("id").value;
    vaga.resumo = document.getElementById('resumo-vaga').value;
    vaga.remuneracao=  document.getElementById('remunera').value;
    vaga.funcao =document.getElementById('funcao').value;
    vaga.nivel =  document.getElementById('nivel').value;
    vaga.descricao =  document.getElementById('desc-vaga').value;
    vaga.requisitosNecessarios=  document.getElementById('requi-nece').value;
    vaga.requisitosDesejados = document.getElementById('requi-dese').value;
    vaga.beneficios = checkAppend();
    vaga.jornadaTrabalho =  document.getElementById('jornada').value;
    vaga.duracaoVaga =  document.getElementById('durac-vaga').value;
    vaga.empresa ={"id":1};
    vaga.area =  {"id":document.getElementById('area').value};
    vaga.escolaridade = {id: document.getElementById('esc').value};
    vaga.deficiencias =  [{"id":document.getElementById('defi').value}];
    console.log(vaga)
    if(vaga.id == ""){
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
    
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("esc").appendChild(node) ; 
  
}
function insertArea (index , item){
   
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("area").appendChild(node) ; 
  
}
function insertDefi (index , item){
    
    var node = document.createElement("option");
    node.value = index.id ;
    var textnode = document.createTextNode(index.descricao); 
    node.appendChild(textnode);
    document.getElementById("defi").appendChild(node) ; 
  
}

function checkAppend(){
    bene=[]
    for(i=1 ; i< 6;i++){
     
      if(document.getElementById("option"+i).checked ==true){
          
        bene.push(document.getElementById("option"+i).value);
        }

    }

    return bene.toString();
}

function checkDissolve(value){
    var array = value.split(",")
    for(i=0 ; i< 6;i++){
      if(array[i] =="Vale Transporte"){
        document.getElementById("option1").checked = true
      }
      if(array[i] =="Plano de Saúde"){
        document.getElementById("option2").checked = true
      }
      if(array[i] == "Vale Refeição"){
        document.getElementById("option3").checked = true
      }
      if(array[i] =="Plano Odontológico" ){
        document.getElementById("option4").checked = true
      }
      if(array[i] == "Vale Alimentação"){
        document.getElementById("option5").checked = true
      }
      if(array[i] == "Seguro de Vida"){
        document.getElementById("option6").checked = true
      }
    }

    
}