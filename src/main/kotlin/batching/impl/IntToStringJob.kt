package batching.impl

import batching.BatchExecutable
import batching.BatchProcess
import batching.job.Job
import batching.job.SimpleJob

@BatchExecutable(batchProcessName = "IntToStringJob")
class IntToStringJob : BatchProcess {
    override fun getJobs(): List<Job> = listOf(
        SimpleJob(
            reader = IntReader(),
            processor = IntProcessor(),
            writer = IntWriter(),
        )
    )
}