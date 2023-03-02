package batching.impl

import batching.etl.Reader

class StringReader : Reader<String> {
    override fun read(): List<String> = listOf(
        "String A",
        "String B",
        "String C",
    )
}