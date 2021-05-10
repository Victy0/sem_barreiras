function entrar(){

    var login = {};
    login.email = document.getElementById('email').value;
    
    $.ajax({
        type: 'POST', 
        contentType: "application/json; charset=utf-8",
        url: "/empresa/login",
        async:false,
        data: JSON.stringify(login),
        success: function(data) { 
            if(data.sucesso){
                document.getElementById('id01').style.display='block';
                document.getElementById('mensagens').innerHTML = data.mensagem;
            }else{
                console.log(data)
                document.getElementById('erro').innerHTML = data.mensagem;
            }
        }
    }); 

}
function verificaCodigo(){

    var login = {};
    login.email = document.getElementById('email').value;
    login.codigo= document.getElementById("codigo").value;
    
    $.ajax({
        type: 'POST', 
        contentType: "application/json; charset=utf-8",
        url: "/empresa/login-confirma",
        async:false,
        data: JSON.stringify(login),
        success: function(data) { 
            if(data.sucesso){
                $.ajax({
                    type: 'POST', 
                    contentType: "application/json; charset=utf-8",
                    url: "/empresa/session",
                    async:false,
                    success: function(data) { 
                        localStorage.setItem("on", data);
                        window.location.replace("/");
                    }
                }); 
            }else{
                document.getElementById('erroPopup').innerHTML = data.mensagem;
            }
        }
    }); 

}
