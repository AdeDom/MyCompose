package com.adedom.mycompose.ui.components

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.adedom.mycompose.domain.models.DramaModel
import com.adedom.mycompose.ui.theme.MyComposeTheme
import compose.foundation.layout.Column
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun DramaCardComponent(
    modifier: Modifier = Modifier,
    dramaModel: DramaModel,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(topEnd = 16.dp, bottomStart = 16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    ) {
        Column {
            KamelImage(
                resource = asyncPainterResource(data = dramaModel.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.aspectRatio(16 / 9f),
            )
            Column(
                modifier = Modifier.padding(8.dp),
            ) {
                Text(
                    text = dramaModel.title,
                    style = MaterialTheme.typography.titleLarge,
                )
                Text(
                    text = dramaModel.description,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview
@Composable
fun DramaCardComponentPreview() {
    MyComposeTheme {
        DramaCardComponent(
            dramaModel = DramaModel(
                description = "description",
                id = 123,
                image = "image",
                title = "title",
            ),
        )
    }
}
