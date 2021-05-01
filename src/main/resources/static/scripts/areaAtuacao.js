function resgatarArea(){
    $(document).ready( function(){
        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/area",
            async: false, 
            success: function(data) { 
                console.log(data)
                for (var i = 0; i < document.getElementById('listArea').options.length; i++) {
                    if (document.getElementById('listArea').options[i].value == data.id) {
                        document.getElementById('listArea')[i].selected = true;
                    }
                }   
            }
        }); 
        

    });
}

resgatarArea();