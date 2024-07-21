package com.adedom.mycompose.data.repositories.drama

import com.adedom.mycompose.data.datasource.remote.drama.DramaRemoteDataSource
import com.adedom.mycompose.domain.models.DramaModel
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DramaRepositoryImpl(
    private val dramaRemoteDataSource: DramaRemoteDataSource,
    private val ioDispatcher: CoroutineDispatcher,
) : DramaRepository {
    override suspend fun fetchDramas(): List<DramaModel> = withContext(ioDispatcher) {
        val response = dramaRemoteDataSource.fetchDramas()
        if (response.status == "success") {
            response.data
                ?.filterNotNull()
                ?.map {
                    DramaModel(
                        description = it.description.orEmpty(),
                        id = it.id,
                        image = it.image.orEmpty(),
                        title = it.title.orEmpty(),
                    )
                }
                ?.shuffled()
                ?: emptyList()
        } else {
            throw IOException("Api error!!!")
        }
    }
}
