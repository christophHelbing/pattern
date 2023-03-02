package batching

fun main() {
    BatchRegistry.getBatchProcesses().forEach { batchProcess ->
        batchProcess
            .getJobs()
            .parallelStream()
            .forEach {
                it.execute()
            }
    }
}