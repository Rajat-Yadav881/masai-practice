const url = "https://reqres.in/api/users?page=2";
    fetch(url)
        .then(function(res){
            return res.json();//collect()
        })
        .then(function(res){
            console.log(res);
            append(res.data);
        })
        .catch(function(err){
            console.log(err);
        });
    
    
    function append(data){
        let main = document.getElementById("main");
        data.forEach(function(el) {
            let image = document.createElement("img");
            image.src = el.image;
            let title = document.createElement("h1");
            title.innerText = el.title;
            let price = document.createElement("h3");
            price.innerText = el.price;
            let div = document.createElement("div");
            div.append(image,title,price);
            main.append(div);
        });
    }
