package builder.model

abstract class Car {
    abstract val brand: String
    abstract val color: Color
    abstract val wheels: List<Wheel>
}

data class OffroadCar(
    override val brand: String,
    override val color: Color,
    override val wheels: List<Wheel>,
) : Car() {

}

data class RacingCar(
    override val brand: String,
    override val color: Color,
    override val wheels: List<Wheel>,
) : Car()

data class CityCar(
    override val brand: String,
    override val color: Color,
    override val wheels: List<Wheel>,
) : Car()
