function salvarVaga(value){
    vaga={
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
    vaga.dataCriacao = Date();
    vaga.remuneracao=  document.getElementById('remunera').value;
    vaga.funcao =document.getElementById('funcao').value;
    vaga.nivel =  document.getElementById('nivel').value;
    vaga.descricao =  document.getElementById('desc-vaga').value;
    vaga.requisitosNecessarios=  document.getElementById('requi-nece').value;
    vaga.requisitosDesejados = document.getElementById('requi-dese').value;
    vaga.beneficios = "VT,VR";
    vaga.jornadaTrabalho =  document.getElementById('jornada').value;
    vaga.duracaoVaga =  document.getElementById('durac-vaga').value;
    vaga.empresa =  document.getElementById('empresa').value;
    vaga.area =  document.getElementById('area').value;
    vaga.escolaridade =  document.getElementById('esc').value;
    vaga.deficiencias =  document.getElementById('defi').value;
    if(vaga.id == ""){
        $.postJSON("/vaga", {vaga}, function(data) { 
            console.log(data)
        }); 
    }else{
        $.ajax({
            type: 'PUT', 
            contentType: "application/json; charset=utf-8",
            url: "/empresa/alterar", 
            data: JSON.stringify(vaga),
            success: function(data) { 
                console.log(data)
            }
        });
    }
    
}