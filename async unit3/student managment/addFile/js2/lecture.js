let lecData = JSON.parse(localStorage.getItem("bost"))||[]
class lecture{
    constructor(a,b){
        this.topic = a;
        this.date = b;
    }

    checker(topic){

        let isValid = false;
        isValid = this.topicCheck(topic)
        if(isValid===true)
        {
            alert("%c added!!","color:lime")
            lecData.push(this)
            localStorage.setItem("bost",JSON.stringify(lecData));
        }
    }
    topicCheck(topic){
        let value = topic.includes("!")?false:true

        return value;
    }
}

function setData(e){

    e.preventDefault()
    let form = document.getElementById("init");
    let topic = form.top.value;
    let date = form.date.value;

    let lec1 = new lecture(topic,date)

    lec1.checker(topic);

    let x = document.querySelectorAll("input")
    x.forEach((el)=>{
        el.value = null
    })

}

