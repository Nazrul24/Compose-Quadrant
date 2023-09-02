package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant();
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Column {
        Row {
            ComposableInfoCard(
                title = stringResource(id = R.string.text_title),
                description = stringResource(id = R.string.text_description),
                backgroundColor = colorResource(id = R.color.purple_1),
                modifier = Modifier.weight(1f)
            )

            ComposableInfoCard(
                title = stringResource(id = R.string.image_title),
                description = stringResource(id = R.string.image_description),
                backgroundColor = colorResource(id = R.color.purple_2),
                modifier = Modifier.weight(1f)
            )
        }

        Row {
            ComposableInfoCard(
                title = stringResource(id = R.string.row_title),
                description = stringResource(id = R.string.row_description),
                backgroundColor = colorResource(id = R.color.purple_3),
                modifier = Modifier.weight(1f)
            )

            ComposableInfoCard(
                title = stringResource(id = R.string.column_title),
                description = stringResource(id = R.string.Column_description),
                backgroundColor = colorResource(id = R.color.purple_4),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(16.dp)
        
    ) {
        Text(
            text = title
        )
        Text(
            text = description
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant();
    }
}