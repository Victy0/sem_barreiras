$(document).ready( function(){
    $.getJSON("/curso", {}, function(data) { 
        console.log(data)
     });
});