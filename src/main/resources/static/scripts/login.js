function entrar(){

    var login = {};
    login.email = document.getElementById('email').innerHTML;

    $.ajax({
        type: 'POST', 
        contentType: "application/json; charset=utf-8",
        url: "/empresa/login",
        data: JSON.stringify(login),
        success: function(data) { 
            if(data.sucesso){
                //abrir modal
            }else{
                document.getElementById('erro').innerHTML = data.mensagem;
            }
        }
    }); 

}