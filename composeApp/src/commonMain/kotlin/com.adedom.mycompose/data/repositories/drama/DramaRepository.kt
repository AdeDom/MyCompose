package com.adedom.mycompose.data.repositories.drama

import com.adedom.mycompose.domain.models.DramaModel

interface DramaRepository {
    suspend fun fetchDramas(): List<DramaModel>
}
