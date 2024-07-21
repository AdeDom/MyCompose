package com.adedom.mycompose.data.datasource.local.champ

import com.adedom.mycompose.data.models.sdui.ComposableData
import com.adedom.mycompose.utils.JsonUtil

class ChampLocalDataSourceImpl : ChampLocalDataSource {

    override fun getHome(): ComposableData {
        val json = """
            {
                "type":"Column",
                "content":[
                    {
                        "type":"Text",
                        "text":"Easy sdui"
                    },
                    {
                        "type":"KamelImage",
                        "data":"https://picsum.photos/300/300"
                    }
                ]
            }
        """.trimIndent()

        return JsonUtil.getJson().decodeFromString(json)
    }
}
