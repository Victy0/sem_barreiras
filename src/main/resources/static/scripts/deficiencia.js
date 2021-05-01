function resgatarDeficiencia(){
    $(document).ready( function(){
        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/deficiencia",
            async: false, 
            success: function(data) { 
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
            url: "/deficiencia",
            async: false, 
            success: function(data) { 
                console.log(data)
                for (var i = 0; i < document.getElementById('listDeficiencia').options.length; i++) {
                    if (document.getElementById('listDeficiencia').options[i].value == data.id) {
                        document.getElementById('listDeficiencia')[i].selected = true;
                    }
                }   
            }
        }); 
        

    });
}

resgatarDeficiencia();