package builder

import builder.model.CarType
import builder.model.Color
import builder.model.RacingWheel

fun main() {
    CarBuilder()
        .setType(CarType.OFFROAD)
        .setBrand("Audi")
        .setColor(Color.RED)
        .addWheel(RacingWheel(3))
        .addWheel(RacingWheel(3))
        .addWheel(RacingWheel(3))
        .addWheel(RacingWheel(3))
        .build()
}