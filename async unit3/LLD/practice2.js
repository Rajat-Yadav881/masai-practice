class vehicle{
    constructor(type,regNumber){
        this.type = type;
        this.regNumber = regNumber;
    }
}

class car extends vehicle{
    constructor(type,regNumber){
        super(type,regNumber)
    }
}
class truck extends vehicle{
    constructor(type,regNumber){
        super(type,regNumber)   
    }
}
class bike extends vehicle{
    constructor(type,regNumber){
        super(type,regNumber)
    }
}

class slot{
    #isBooked
    constructor(number,type){
        this.number = number
        this.type = type;
        this.#isBooked = false;
    }
    get _isBooked(){ //getter
        return this.#isBooked
    }
    set _isBooked(bool){ //setter  we have a dedicated setter forevry single perimeter
        this.#isBooked = bool;
    }
}


class parkingFloor{
    constructor(floorNumber,maxfloor){
        this.floorNumber = floorNumber
        this.parkingSpots = [];
        for(let i=0;i<maxfloor;i++){
            if(i===0){
                this.parkingSpots.push(new slot(i,"truck"))
            }else if(i===1){
                this.parkingSpots.push(new slot(i,"bike"))
            }else{
                this.parkingSpots.push(new slot(i,"car"))
            }
        }
    }
}


class parkingLot{
    constructor(numOfFloor){
        this.numOfFloor = numOfFloor
        this.Floors = [];

        for(let i=0;i<numOfFloor;i++){
            this.Floors.push(new parkingFloor(i,3))
        }
    }

    findSlot(type){      
        for(let i=0;i<this.numOfFloor;i++){
            for(let slot of this.Floors[i].parkingSpots){
                if(slot.type === type && slot._isBooked === false){
                    return {floorNumber:i,found_slot:slot};
                }
            }
        }
    }

    parkVehicle(vehicle){
        let slot = this.findSlot(vehicle.type);
        console.log("slot:",slot)

        slot.found_slot._isBooked = true 
         //_isBooked is the setter
        // issueTicket(vehicle,slot.floorNumber,price_of_ticket) 
    }
}

class ticket{

    issueTicket(){
        
    }
}
let pl = new parkingLot(3);
let c3 = new car("car","MH348")

let x = new ticket("rajat")
console.log(x.issueTicket())
// console.log(x.issueTicket(pl.parkVehicle(c3)))

//input box
// function park(){
//     let c1;
//     let pl = new parkingLot(3)
//     if(type === "bike"){
//         c1 = new bike(name,regnumber)
//     }
//     pl.parkVehicle(c1)
// }

// let c1 = new car("car","MH98")
// let c2 = new car("car","MH98")

// pl.parkVehicle(c1);
// pl.parkVehicle(c2);
