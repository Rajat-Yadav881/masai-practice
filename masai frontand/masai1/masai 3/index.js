// let array=[];
// function Submit(e){
//     e.preventDefault();

//     let form = document.getElementById("form");

//     let name = form.name.value
//     let price = form.price.value

//     let product = new prod(name,price);

//     array.push(product);
//     console.log(array)
// }
// function prod(Name,Price){   
//     this.name = Name;
//     this.price = Price;   
// }
let kit = {
    name:'kitchen',
    cookfood : function(order){
        console.log(`serving ${order} in ${this.name}`);
    },
};
kitchen.cookfood('maggie');



//create ecommerce products database by accepting values through a form