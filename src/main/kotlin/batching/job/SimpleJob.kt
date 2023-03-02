package batching.job

import batching.etl.Processor
import batching.etl.Reader
import batching.etl.Writer

class SimpleJob<In, Out>(
    val reader: Reader<In>,
    val processor: Processor<In, Out>,
    val writer: Writer<Out>,
) : Job {
    override fun execute() {
        val extractedData = reader.read()
        extractedData.map { item ->
            processor.process(item)
        }.let { transformedData ->
            writer.write(transformedData)
        }
    }
}