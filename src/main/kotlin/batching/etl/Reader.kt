package batching.etl

interface Reader<In> {
    fun read(): List<In>
}