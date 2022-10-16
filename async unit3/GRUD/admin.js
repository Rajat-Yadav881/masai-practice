async function getPost(){
     
    let id = document.getElementById("id").value;
    let title = document.getElementById("Title").value;
    let author = document.getElementById("Author").value;
    let send_this_data = {
        id:id,
        title:title,
        author:author,
    }


    //localstorage

    //append


    let url = `http://localhost:3000/posts`
    let res = await fetch(url,{
        method:"POST",
        body:JSON.stringify(send_this_data),
        //why we stringify? => json is a data transfer system

        headers:{
            "content-Type":"application/json",
        },
    });

    let data = await res.json()
    console.log("data:",data)

}

async function deletePost(){
    let id = document.getElementById("delete_id").value;

    let res = await fetch(`http://localhost:3000/posts/${id}`,{
        method:"DELETE",
        headers:{
            "content-Type":"application/json",
        },
    });

    let data = await res.json()
    console.log("data:",data);
}

async function updatePost(){
    let id = document.getElementById("update_id").value;

    let title = document.getElementById("update_title").value;

    let send_data = {
        title,
    };

    //we want to update title of any post

    let res = await fetch(`http://localhost:3000/posts/${id}`,{
        method:"PATCH",

        body: JSON.stringify(send_data) ,

        headers:{
            "content-Type":"application/json"
        }
        
    });
    let data = await res.json()
    console.log("data:",data)
}

async function replacePost(){
    let id = document.getElementById("replace_id").value;

    let title = document.getElementById("replace_title").value;

    let send_data = {
        title,
    };

    //we want to update title of any post

    let res = await fetch(`http://localhost:3000/posts/${id}`,{
        method:"PUT",

        body: JSON.stringify(send_data) ,

        headers:{
            "content-Type":"application/json"
        }
        
    });
    let data = await res.json()
    console.log("data:",data)
}

//CRUD=>create,read,update,delete