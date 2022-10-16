let flodData = JSON.parse(localStorage.getItem("bloom"))||[]
class assignment{
    constructor(a,b,c){
        this.subject = a;
        this.topic = b;
        this.date = c;
    }
    checker(topic){
        let isValid = false;
        isValid = this.topicCheck(topic)

        if(isValid){
            this.topic = topic
            alert("added!!")
            flodData.push(this)
            localStorage.setItem("bloom",JSON.stringify(flodData))
        }else{
            alert("failed")

        }
    }
    topicCheck(topic){
        let value = topic.includes("@!#$%^&*()_")?false:true

        return value;
    }
}

function setData(e){
    e.preventDefault()
    let form = document.getElementById("init")
    let subject = form.sub.value;
    let topic = form.top.value;
    let date = form.date.value;

    let user1 = new assignment(subject,topic,date)
    user1.checker(topic)
    

    let x = document.querySelectorAll("input")
    x.forEach((el)=>{
        el.value = null;
    })
}