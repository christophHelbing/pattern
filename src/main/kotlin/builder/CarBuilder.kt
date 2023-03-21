package builder

import builder.model.*

class CarBuilder {
    lateinit var type: CarType
    lateinit var brand: String
    lateinit var color: Color
    val wheels: MutableList<Wheel> = mutableListOf()

    fun setType(type: CarType) = apply { this.type = type }

    fun setBrand(brand: String) = apply { this.brand = brand }

    fun setColor(color: Color) = apply { this.color = color }

    fun addWheel(wheel: Wheel) = apply { this.wheels.add(wheel) }

    fun build(): Car {
        return when(type) {
            CarType.OFFROAD -> OffroadCar(brand, color, wheels)
            CarType.RACING -> RacingCar(brand, color, wheels)
            CarType.CITY -> CityCar(brand, color, wheels)
        }
    }
}

