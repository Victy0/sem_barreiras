$(document).ready( function(){
    var loged= localStorage.getItem("on");
    if(loged == null || loged == undefined){
        document.getElementById("recrutar").style.display = "none";
        document.getElementById("sair").style.display = "none";
        document.getElementById("empresaEdit").style.display = "none";
        document.getElementById("empresaLogin").style.display = "flex";
        document.getElementById("cadcurso").style.display = "none";
    }else{

        document.getElementById("curso").style.display = "none";
        document.getElementById("empresaEdit").style.display = "flex";
        document.getElementById("empresaLogin").style.display = "none";
    }
})

function logout(){
    $.ajax({
        type: 'POST', 
        contentType: "application/json; charset=utf-8",
        url: "/empresa/logout",
        success: function(data) { 
            console.log(data)
            if(data.sucesso){
                localStorage.removeItem("on");
                window.location.replace("/"); 
            }
        }
    }); 
}

function editEmpresa(){
    var loged= localStorage.getItem("on");
    if(loged != null || loged != undefined){
        window.location.replace("/cadastro-empresa?id=" + loged); 
    }
}