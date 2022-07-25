


function searchParams(url,param){
    let u = new URL(url); //it seprate ?foo
    // let params = new URLSearchParams(u.search); //it seprate it futher
    let params = u.searchParams;//it seprate it futher same as line no-6
    let f = params.get(param);//it again seprate it
    return f
}

export default searchParams;
