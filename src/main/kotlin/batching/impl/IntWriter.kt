package batching.impl

import batching.etl.Writer

class IntWriter : Writer<String> {
    override fun write(list: List<String>) {
        list.forEach(::println)
    }

}