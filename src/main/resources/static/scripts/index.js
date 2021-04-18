$(document).ready( function(){
    $.getJSON("/vaga", {}, function(data) { 
        console.log(data);

        for(var i =0; i < data.totalElements; i++){
            var vaga = data.content[i];
    
            var div = document.createElement('div');
            div.id = vaga.id;
            div.innerHTML = vaga.resumo;
            document.getElementById("corpo").appendChild(div);
    
        }
    }); 

});

