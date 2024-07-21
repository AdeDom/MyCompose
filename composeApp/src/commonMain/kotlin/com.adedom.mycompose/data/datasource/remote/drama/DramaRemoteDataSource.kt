package com.adedom.mycompose.data.datasource.remote.drama

import com.adedom.mycompose.data.models.drama.DramaResponse

interface DramaRemoteDataSource {
    suspend fun fetchDramas(): DramaResponse
}
