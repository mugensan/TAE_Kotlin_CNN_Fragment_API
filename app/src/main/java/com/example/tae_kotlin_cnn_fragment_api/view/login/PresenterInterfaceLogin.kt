package com.example.tae_kotlin_cnn_fragment_api.view.login

interface PresenterInterfaceLogin {

    fun processLogin(email:String,password:String)
    fun onDestroy()
}