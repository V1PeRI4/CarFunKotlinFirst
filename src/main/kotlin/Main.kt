fun main(args: Array<String>) {
    val car = CarRepository()
    car.insert(1, "LADA")
    println(car.findById(1).toString())

    car.update(CarDataClass(2, "BMW"), 1, null)
    println(car.findById(2).toString())

    car.update(CarDataClass(3, "AUDI"), null, "BMW")
    println(car.findById(3).toString())

    car.insert(123, "name")
    println(car.findById(123))
    car.delete(null, "name")
    println(car.findById(123))

}