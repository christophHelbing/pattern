package builder.model

abstract class Wheel {
    abstract val airPressure: Int
}

data class OffroadWheel(
    override val airPressure: Int
) : Wheel()

data class RacingWheel(
    override val airPressure: Int
) : Wheel()

