package com.example.mobileapplicationwithgeminientegration

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileapplicationwithgeminientegration.ui.chatui.ChatScreen
import com.example.mobileapplicationwithgeminientegration.ui.compareimage.CompareImageScreen
import com.example.mobileapplicationwithgeminientegration.ui.loadphoto.LoadPhotoScreen
import com.example.mobileapplicationwithgeminientegration.ui.theme.MobileApplicationWithGeminiEntegrationTheme





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileApplicationWithGeminiEntegrationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //ChatScreen(modifier = Modifier.fillMaxSize().padding(innerPadding))
                     LoadPhotoScreen(modifier = Modifier.fillMaxSize().padding(innerPadding))
                    //CompareImageScreen(modifier = Modifier.fillMaxSize().padding(innerPadding))
                }
            }
        }
    }
}