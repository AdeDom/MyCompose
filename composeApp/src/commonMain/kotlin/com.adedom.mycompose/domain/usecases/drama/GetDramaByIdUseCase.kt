package com.adedom.mycompose.domain.usecases.drama

import com.adedom.mycompose.data.repositories.drama.DramaRepository
import com.adedom.mycompose.domain.models.DramaModel

class GetDramaByIdUseCase(
    private val dramaRepository: DramaRepository,
) {
    suspend fun execute(id: Int?): DramaModel? {
        if (id == null) {
            return null
        }

        return dramaRepository.fetchDramas().firstOrNull { it.id == id }
    }
}
