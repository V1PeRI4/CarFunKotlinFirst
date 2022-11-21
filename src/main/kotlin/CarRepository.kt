import javax.swing.text.SimpleAttributeSet

class CarRepository {
    var carList = mutableListOf<CarDataClass>()

    fun findById(idFind: Int): CarDataClass? = carList.find { it.id == idFind }

    fun insert(id: Int, name: String) = carList.add(CarDataClass(id, name))

    fun update(car: CarDataClass, idFind: Int? = null, nameFind: String? = null) {
        if (idFind != null) {
            carList.find { it.id == idFind }?.name = car.name
            carList.find { it.id == idFind }?.id = car.id
        }
        if (nameFind != null) {
            carList.find { it.name == nameFind }?.id = car.id
            carList.find { it.name == nameFind }?.name = car.name
        }
    }


    fun delete(id: Int? = null, name: String? = null) {
        if (id != null) {
            if (carList.find { it.id == id } != null)
                carList.remove(carList.find { it.id == id })
            else println("Нет данных")}

        else if (name != null) {
            if (carList.find { it.name == name } != null)
                carList.remove(carList.find { it.name == name })
            else println("Нет данных")}

        else println("Ошибка")
    }
}

//(findByid(), insert(), update(), delete())