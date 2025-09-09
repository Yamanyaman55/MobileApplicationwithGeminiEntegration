package com.example.mobileapplicationwithgeminientegration.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.mobileapplicationwithgeminientegration.ui.model.ChatItem
import com.example.mobileapplicationwithgeminientegration.ui.model.ChatType
import com.google.ai.client.generativeai.Chat
import com.google.ai.client.generativeai.GenerativeModel


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
}