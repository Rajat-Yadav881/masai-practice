import { navSection } from "../components/navbar.js";

document.getElementById("navbar").innerHTML = navSection();

class ads{
    constructor(a,b,c,d,e){
        this.name = a;
        this.course = b;
        this.image = c;
        this.unit = d;
        this.batch = e;
    }
}
let Data = JSON.parse(localStorage.getItem("leap"))||[];

let getData = (e)=>{
    e.preventDefault();
    let form = document.getElementById("hash")
    let name = form.name.value;
    let course = form.course.value;
    let image = form.image.value;
    let unit = form.unit.value;
    let batch = form.batch.value;

    let p1 = new ads(name,course,image,unit,batch)
    Data.push(p1)
    localStorage.setItem("leap",JSON.stringify(Data))
}
window.getData = getData
let calc = ()=>{
    let obj={};
    for(let i=0;i<Data.length;i++){
        if(!obj[Data[i].batch]){
            obj[Data[i].batch] = 1;
        }else{
            obj[Data[i].batch]++;
        }
    }
    // let size = Object.keys(obj).length;
    let bag=[]
    for(let key in obj){
        
        let x = document.getElementById("aly_data").innerHTML = `FT-WEB${key}=> ${obj[key]}`;
        console.log(x)
        bag.push(x)
        

        document.getElementById("aly_data").innerText=bag
    }   
}
calc();


