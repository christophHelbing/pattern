package batching.impl

import batching.BatchExecutable
import batching.BatchProcess
import batching.job.Job
import batching.job.SimpleJob

@BatchExecutable(batchProcessName = "StringToStringJob")
class StringToStringJob : BatchProcess {
    override fun getJobs(): List<Job> = listOf(
        SimpleJob(
            reader = StringReader(),
            processor = StringProcessor(),
            writer = StringWriter(),
        )
    )
}