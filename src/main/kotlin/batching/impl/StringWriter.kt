package batching.impl

import batching.etl.Writer

class StringWriter : Writer<String> {
    override fun write(list: List<String>) {
        list.forEach(::println)
    }
}