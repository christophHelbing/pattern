package batching.etl

interface Processor<In, Out> {
    fun process(value: In): Out
}