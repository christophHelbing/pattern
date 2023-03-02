package batching

import batching.job.Job

interface BatchProcess {
    fun getJobs(): List<Job>
}