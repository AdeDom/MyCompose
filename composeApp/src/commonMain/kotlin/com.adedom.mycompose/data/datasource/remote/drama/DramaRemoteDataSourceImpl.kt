package com.adedom.mycompose.data.datasource.remote.drama

import com.adedom.mycompose.data.datasource.DataSourceProvider
import com.adedom.mycompose.data.models.drama.DramaResponse
import io.ktor.client.call.body
import io.ktor.client.request.get

class DramaRemoteDataSourceImpl(
    private val dataSourceProvider: DataSourceProvider,
) : DramaRemoteDataSource {
    /**
     * Dramas
     * drama_list.json
     */
    override suspend fun fetchDramas(): DramaResponse = dataSourceProvider.getHttpClient()
        .get("${dataSourceProvider.getBaseUrl()}v3/f12577ab-9ac7-4c16-b63a-8fb77f252b31")
        .body()
}
