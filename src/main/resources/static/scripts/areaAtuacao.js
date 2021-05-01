function resgatarArea(){
    $(document).ready( function(){
        $.ajax({
            type: 'GET', 
            contentType: "application/json; charset=utf-8",
            url: "/area",
            async: false, 
            success: function(data) { 
                for(var i = 0; i < data.totalElements; i++){
                    var area = data.content[i];
        
                    var opt = document.createElement("option");
                    opt.value= area.id;
                    opt.innerHTML = area.descricao; 
        
                    document.getElementById("listArea").appendChild(opt);
                }
            }
        }); 
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