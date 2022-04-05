package com.plandel.jetpackcompose001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plandel.jetpackcompose001.ui.theme.JetpackCompose001Theme
import com.plandel.jetpackcompose001.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose001Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Row(modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .background(Color.Gray),
                        horizontalArrangement = Arrangement.Start,
                    ){
                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        CustomItem(weight = 1f)
                    }
                }
            }
        }
    }
}


@Composable
fun RowScope.CustomItem(
    weight: Float,
    color: Color = MaterialTheme.colors.primary
){
    Surface(modifier = Modifier
        .width(50.dp)
        .height(50.dp)
        .weight(weight),
        color = color
    ) {}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose001Theme {
        Row(modifier = Modifier
            .fillMaxSize(),
               horizontalArrangement = Arrangement.Start,
               verticalAlignment = Alignment.CenterVertically
        ){
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)
        }
    }
}