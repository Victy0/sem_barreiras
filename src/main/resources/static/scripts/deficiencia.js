function resgatarDeficiencia(){
    $(document).ready( function(){
        
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