let getData = async(page_number)=>{
    try{
        let res = await fetch(`http://localhost:3000/posts?_page=${page_number}&_limit=3`)

        let data = await res.json()

        // console.log("data:",data)
        
        appendData(data)
    }catch(err){
        console.log("err:",err)
    }    
};

getData();

// let arr = [1,2,3]
//de-structure
//array
//mimick
// let [a,b,c]=[1,2,3]

function appendData(data){
    let cont = document.getElementById("container")
    cont.innerHTML=null
    data.map(({title,author})=>{
        let p = document.createElement("h3")
        p.innerText = title
        let a = document.createElement("p")
        a.innerText = author
        let div = document.createElement("div")
        div.append(p,a)
        cont.append(div)
    })
}

let showbutton = (result,per_page)=>{

    //10 buttons....
    let buttons_div = document.getElementById("btn");
    // let result = 40;
    // let per_page = 3
    let buttons = Math.ceil(result/per_page);

    for(let i=1;i<=buttons;i++){
        let button = document.createElement("button");
        button.innerText = i;
        button.onclick = function(){
            getData(i);
        };
        buttons_div.append(button)
    }

};
showbutton(16,3);
// let pagination = (page_no)=>{

//     //show result based on page number clicked
//     //we need to know page number
//     console.log(page_no)

// }


