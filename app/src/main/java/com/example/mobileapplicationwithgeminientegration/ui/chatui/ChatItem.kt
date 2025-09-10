package com.example.mobileapplicationwithgeminientegration.ui.chatui

data class ChatItem(val message:String,val type: ChatType){

}

enum class ChatType{
    AI,
    USER
}
