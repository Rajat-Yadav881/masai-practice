class vehicle{
    constructor(type,regNumber){
        this.type = type;
        this.regNumber = regNumber
    }
}
class car extends vehicle{
    constructor(type,regNumber){
        super(type,regNumber)
    }
}
class bus extends vehicle{
    constructor(type,regNumber){
        super(type,regNumber)
    }
}
class pickup extends vehicle{
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
        this.type = type
        this.#isBooked = false;

    }
    get _isBooked(){
        return this.#isBooked
    }

    set _isBooked(bool){
        this.#isBooked = bool;
    }
}

class parkingFloor{
    constructor(floorNumber,maxFloor){
        this.floorNumber = floorNumber;
        this.parkingSpots = [];
        for(let i=0;i<maxFloor;i++){
            if(i===0){
                this.parkingSpots.push(new slot(0,"car"))
            }else if(i===1){
                this.parkingSpots.push(new slot(1,"truck"))
            }else if(i===2){
                this.parkingSpots.push(new slot(2,"pickup"))
            }else{
                this.parkingSpots.push(new slot(3,"bike"))
            } 
        }
    }
}

class parkingLot{
    constructor(nummOfFloor){
        this.nummOfFloor = nummOfFloor;
        this.floors = [];
        for(let i=0;i<nummOfFloor;i++){
            this.floors.push(new parkingFloor(i,4))
        }
    }

    findSlot(type){
        for(let i=0;i<this.nummOfFloor;i++){
            for(let slot of this.floors[i].parkingSpots){
                if(slot.type === type && slot._isBooked === false){
                    return {floornumber:i,found_slot:slot};
                }
                
            }
        }
    }

    parkVechicle(vehicle){
        let slot = this.findSlot(vehicle.type);
        console.log("slot:",slot)

         slot.found_slot._isBooked = true
    }
}

// class ticket{
//     constructor(){

//     }
// }


let pl = new parkingLot(4)
let c1 = new car("car","Mhiefher")
let c2 = new car("car2","MHdf23")

pl.parkVehicle(c1)
pl.parkVehicle(c2)