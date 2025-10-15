package com.example.taskmateandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.taskmateandroidapp.ui.theme.TaskMateAndroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskMateAndroidAppTheme {
                //Launch the main TodoListScreen Composable
                TodoListScreen()
            }
        }
    }
}

