package batching

import org.reflections.Reflections

object BatchRegistry {
    private val batchProcesses: Map<String, BatchProcess> = Reflections("batching.impl")
        .getTypesAnnotatedWith(BatchExecutable::class.java).associate {
            it.getAnnotation(BatchExecutable::class.java).batchProcessName to
                    it.getDeclaredConstructor()
                        .newInstance() as BatchProcess
        }

    fun getBatchProcesses(): List<BatchProcess> =
        batchProcesses.map { it.value }
}