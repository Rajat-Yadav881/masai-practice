let data = JSON.parse(localStorage.getItem("key"))

function depp(){
    if(data){
        window.location.href = "mm.html"
    }else{
        alert("some went wrong")
    }
}