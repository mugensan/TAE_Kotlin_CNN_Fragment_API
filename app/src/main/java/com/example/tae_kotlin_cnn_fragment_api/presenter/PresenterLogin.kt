package com.example.tae_kotlin_cnn_fragment_api.presenter

import com.example.tae_kotlin_cnn_fragment_api.MainActivity
import com.example.tae_kotlin_cnn_fragment_api.common.showToast
import com.example.tae_kotlin_cnn_fragment_api.model.loginmodel.LoginModel
import com.example.tae_kotlin_cnn_fragment_api.view.login.PresenterInterfaceLogin
import com.example.tae_kotlin_cnn_fragment_api.view.login.ViewInterfaceLogin

class PresenterLogin (_viewLogin: ViewInterfaceLogin?):
    PresenterInterfaceLogin {

    var viewLogin: ViewInterfaceLogin? = _viewLogin
    var loginModel = LoginModel()

    override fun processLogin(email: String,password:String){
        if(email.equals(loginModel.getEmail()) && password.equals(loginModel.getPassword())){
            viewLogin?.onLoginSuccess()

        }else{
            viewLogin?.showError()
        }
    }

    override fun onDestroy(){
        viewLogin = null
    }
}