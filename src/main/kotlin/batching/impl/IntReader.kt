package batching.impl

import batching.etl.Reader

class IntReader : Reader<Int> {
    override fun read(): List<Int> = listOf(
        1,
        2,
        3,
    )
}