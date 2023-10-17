package com.example.compose_boxwithconstraints

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.compose_boxwithconstraints.navigation.SetupNavGraph
import com.example.compose_boxwithconstraints.ui.theme.ComposeBoxWithConstraintsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBoxWithConstraintsTheme {
                SetupNavGraph(navController = rememberNavController())
            }
        }
    }
}

