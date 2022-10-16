//parking system
// vechicle
//parking splace//parking lot//parking floors//
//ticket

//parking lot-1
//parking floor-3//parking slots-3 -/floor
//parking slots-9

class vechicle{
    constructor(t,n){
        this.type = t;
        this.regNumber = n;
    }
    //inherit vechicle class 
}

class car extends vechicle{
    constructor(t,n){
        super(t,n);       
    }
}

class truck extends vechicle{
    constructor(t,n){
        super(t,n)
    }
}

class bike extends vechicle{
    constructor(t,n){
        super(t,n)
    }
}

class slot{
    #isBooked
    constructor(number,type){
        this.number = number;
        this.type = type;
        this.#isBooked = false;//we need to change based on booking
    }
    
    get _isBooked(){
        return this.#isBooked;
    }

    set _isBooked(bool){
        this.#isBooked = bool;       
    }

}

//each PF has 3 slots, we need 
class parkingFloor{
    constructor(floorNumber,maxInFloor){
        this.floorNumber = floorNumber;
        
        this.parkingSpots = [];
        for(let i=0;i<maxInFloor;i++){
            if(i===0){
                this.parkingSpots.push(new slot(i,"truck"))
            }else if(i===1){
                this.parkingSpots.push(new slot(i,"bike"))
            }else{
                this.parkingSpots.push(new slot(i,"car"))
            }
        }
    }
    //for loop is operation
    

}


class parkingLot{
    constructor(numOfFloors){
        this.numOfFloors = numOfFloors
        this.floors = [];
        for(let i=0;i<numOfFloors;i++){
            this.floors.push(new parkingFloor(i,numOfFloors))
        }
    }

    //we need to first check if slot is empty(isBooked=false)
    findSlot(type){
        for(let i=0;i<this.numOfFloors;i++){
            for(let slot of this.floor[i].parkingSpots){
                 if(slot.type === type && !slot._isBooked){
                    return {floorNumber:i,found_slot:slot}
                 }
            }
        }
    }
    parkVehicle(vechicle){
        let slot = this.findSlot(vechicle.type);

        slot.findSlot._isBooked = true;
        // issueTicket(vehicle,slot.floorNumber)
    }
    //issueTicket()
    //
}

function park(){
    let pl = new parkingLot(3);
    if(type === "car"){
        let c1 = new car(name,regNumber);
    }
    pl.parkVehicle(c1)
}
console.log(park())
// let pl = new parkingLot(3)
// console.log("pl:",pl)
// let c1 = new car("car","mh33");

// pl.parkVehicle(c1)

//how to connect LLD to frontend
//i worked on parking system
//input box -> type, reg no -> park button -> onclick -> park()