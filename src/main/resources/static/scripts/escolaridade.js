function resgatarEscolaridade(){
    $(document).ready( function(){
        
        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/escolaridade",
            async: false, 
            success: function(data) { 
                console.log(data)
                for (var i = 0; i < document.getElementById('listEscolaridade').options.length; i++) {
                    if (document.getElementById('listEscolaridade').options[i].value == data.id) {
                        document.getElementById('listEscolaridade')[i].selected = true;
                    }
                }   
            }
        }); 
        

    });
}

resgatarEscolaridade();