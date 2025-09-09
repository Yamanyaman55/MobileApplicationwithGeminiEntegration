package com.example.mobileapplicationwithgeminientegration.ui.model

data class ChatItem(val message:String,val type: ChatType){

}

enum class ChatType{
    AI,
    USER
}
