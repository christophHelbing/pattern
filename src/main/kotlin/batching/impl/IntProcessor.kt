package batching.impl

import batching.etl.Processor

class IntProcessor : Processor<Int, String> {
    override fun process(value: Int): String {
        val squaredValue = value * value
        return "$value squared is $squaredValue"
    }
}