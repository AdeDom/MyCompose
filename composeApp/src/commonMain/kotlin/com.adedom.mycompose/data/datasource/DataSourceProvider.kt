package com.adedom.mycompose.data.datasource

import com.adedom.mycompose.data.datasource.remote.engine.AppHttpClientEngine
import com.adedom.mycompose.utils.JsonUtil
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json

class DataSourceProvider(
    private val appHttpClientEngine: AppHttpClientEngine,
) {

    fun getBaseUrl(): String = "https://run.mocky.io/"

    fun getHttpClient(): HttpClient = HttpClient(appHttpClientEngine.getEngine()) {
        install(ContentNegotiation) {
            json(JsonUtil.getJson())
        }
    }
}
