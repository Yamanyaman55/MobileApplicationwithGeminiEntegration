package com.example.mobileapplicationwithgeminientegration.ui.viewmodel

import android.util.Log
import androidx.activity.result.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobileapplicationwithgeminientegration.ui.model.ChatItem
import com.example.mobileapplicationwithgeminientegration.ui.model.ChatType
import com.google.ai.client.generativeai.Chat
import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.launch


class ChatUIViewModel : ViewModel() {

    val generativeModel = GenerativeModel(
        modelName = "gemini-2.0-flash", //gemini vision da olabilir.
        apiKey = "AIzaSyBAOkbF8OPRukXZoS3mm_PGwryH2xBV0os"
    )

    init {
        startChat()
    }

    var aiChat: Chat? = null

    private fun startChat() {
        aiChat = generativeModel.startChat()
    }

    val chatList = mutableStateListOf<ChatItem>()

    var message by mutableStateOf("")
        private set

    fun onMessageChanged(text: String) {
        message = text
    }

    fun addMessage() {
        chatList.add(
            ChatItem(
                message,
                if (chatList.size.mod(2) == 0) ChatType.AI else ChatType.USER
            )
        )
        message = ""
    }


    fun testGeminiConnection() {
        viewModelScope.launch {
            try {
                val response = generativeModel.generateContent("Bana bir şaka anlat")
                Log.i("ChatViewModel", "Test Response: ${response.text}")
            } catch (e: Exception) {
                Log.e("ChatViewModel", "Test Connection Error: ${e.message}", e)
            }
        }
    }
}