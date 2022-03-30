fun main(){
var cars = Car("SUV","chevrolet","maroon",5)
    cars.carry(10)
cars.identity("white","subaru","legacy")
println( cars.calculatingParkingFees(5))
var bus = Bus("Mitsubushi","Isuzu","Blue",20)
println(bus.maxTripFare(100.50))
    println(bus.calculatingParkingFees(3))
}

open class Car(var model:String,var make:String,var color:String,var capacity:Int) {

    fun carry(people: Int) {
        var x = people - capacity
        if (capacity >= people) {
            println("Carrying $people passengers")
        }
        else {
            println("Over capacity by $x people")

        }
    }
    fun identity(color: String,make: String,model: String){
println("I am $color $make $model")
    }

    open fun calculatingParkingFees(hours:Int):Int{
        var y = hours*20
        return y
    }
}


class Bus(model:String,make:String,color:String,capacity:Int): Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
    var y = fare*capacity
        return y
    }

    override fun calculatingParkingFees(hours: Int): Int {
       // return super.calculatingParkingFees(hours)
        var product = hours*capacity
        return product
    }


}


