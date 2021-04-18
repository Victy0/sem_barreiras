$(document).ready( function(){
    $.getJSON("/vaga", {}, function(data) { 
        console.log(data);
     });
});

