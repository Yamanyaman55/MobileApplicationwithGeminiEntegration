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
import com.example.mobileapplicationwithgeminientegration.ui.theme.MobileApplicationWithGeminiEntegrationTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileApplicationWithGeminiEntegrationTheme { // Kendi temanızı kullanın
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // BURAYA KENDİ ANA COMPOSABLE FONKSİYONUNUZU YAZIN
                    // Örneğin, eğer ChatScreen uygulamanızın ana ekranıysa:
                    ChatScreen()
                         // Varsayılan Greeting yerine kendi Composable'ınızı çağırın
                }
            }
        }
    }
}

// Android Studio'nun eklediği örnek