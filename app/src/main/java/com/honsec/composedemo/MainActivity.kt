package com.honsec.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Red, RoundedCornerShape(16.dp))
                    .padding(8.dp)
            ) {
                // layout_width layout_height
                AsyncImage(
                    model = "https://png.pngtree.com/png-clipart/20230108/original/pngtree-super-cute-cartoon-vector-bear-png-image_8887896.png",
                    contentDescription = "Coil Image",
                    Modifier.clip(CircleShape).size(128.dp)
                )
                Text(
                    "Wade",
                    Modifier
                        .padding(8.dp)
                        .background(Color.Green, )
                        .padding(8.dp),
                    fontSize = 16.sp,
                    color = Color.Blue
                )
            }
        }
    }
}