package com.adedom.mycompose.data.datasource.remote.engine

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

class AppHttpClientEngineImpl : AppHttpClientEngine {

    override fun getEngine(): HttpClientEngine = Darwin.create()
}
