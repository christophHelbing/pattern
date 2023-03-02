package batching
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class BatchExecutable(val batchProcessName: String)
