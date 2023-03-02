package batching.impl

import batching.etl.Processor

class StringProcessor : Processor<String, String> {
    override fun process(value: String): String {
        return "$value processed"
    }
}