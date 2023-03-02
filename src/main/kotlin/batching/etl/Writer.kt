package batching.etl

interface Writer<Out> {
    fun write(list: List<Out>)
}