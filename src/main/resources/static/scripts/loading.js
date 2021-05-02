export function loadingAnimation(param){
    if (!param){
        var loading = document.getElementById("background-loading");
        if(loading.style.display == 'block'){
            loading.style.display = 'none';
        }
        else{
            loading.style.display = 'block';
        }
    }
    else if(param == 'none' || param == 'block'){
        document.getElementById("background-loading").style.display = param;
    }
}
