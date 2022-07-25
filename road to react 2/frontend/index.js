//save my data to masai database

//0. get the data
//1. object(because only me login or signup in single device)
//2. where to post(POST)

let Register=async()=>{

    let signup_data = {

        name:document.getElementById("name").value,
        email:document.getElementById("email").value,
        password:document.getElementById("password").value,
        username:document.getElementById("username").value,
        mobile:document.getElementById("mobile").value,
        description:document.getElementById("description").value
    };

    //who needs the data? - object format,

    //JSON format

    

    signup_data = JSON.stringify(signup_data)
    
    let signup_api_link = "https://masai-api-mocker.herokuapp.com/auth/register";

    //fetch
    //custom setting object

    //GET 0r POST

    let response = await fetch(signup_api_link,{

        method:"POST",//we are posting the data to the server
        
        body: signup_data,

        headers:{
            "Content-type":"application/json"
            //additional info to the server that the type of data it is json
        }

    });

    let data = await response.json();
    console.log("data:",data);

}
// let x;
let Login = async()=>{

    let login_data = {

        username:document.getElementById("login-username").value,
        password:document.getElementById("login-password").value
    }

    login_data = JSON.stringify(login_data);

    let login_api_link = `https://masai-api-mocker.herokuapp.com/auth/login`;

    let response = await fetch(login_api_link,{
        method:"POST",//custom setting object

        body:login_data,
        //why we need body because it contains the data which we have to dilever to the database

        headers:{
            "Content-type":"application/json",
        },
    });
    // let f = (dat.token)=>{
    //     return dat.token
    // }
    
    let dat = await response.json();
    // f(dat.token)
    console.log("dat:",dat);
    localStorage.setItem("keep",JSON.stringify(dat));
}
// console.log(x);


let profile = async()=>{
//error: false, token: '8d06349c27c515bdcadece7494586d6c'
    let deep = document.getElementById("inLogin").value;
    let profile_api_link = `https://masai-api-mocker.herokuapp.com/user/${deep}`;


    let frr = JSON.parse(localStorage.getItem("keep"));
    let token = frr.token
    let response = await fetch(profile_api_link,{
        method:"GET",
        headers:{
            "Authorization": `Bearer ${token}`
        },
    });

    let ddt = await response.json();
   
    console.log("ddt:",ddt);
}

