package com.example.tae_kotlin_cnn_fragment_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tae_kotlin_cnn_fragment_api.common.showToast
import com.example.tae_kotlin_cnn_fragment_api.presenter.PresenterLogin
import com.example.tae_kotlin_cnn_fragment_api.view.homepage.HomePageActivity
import com.example.tae_kotlin_cnn_fragment_api.view.login.ViewInterfaceLogin
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,ViewInterfaceLogin{

    private lateinit var presenterLogin : PresenterLogin


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterLogin = PresenterLogin(this)

        btn_login.setOnClickListener{
            processLogin()
        }
    }

    /**##############################################################
     * LOGIN
    ##############################################################*/



    override fun onLoginSuccess() {

        intent = Intent(this,HomePageActivity::class.java)
        showToast(this,"You are logged in")
        startActivity(intent)
        //this

    }

    private fun processLogin(){
        val email = et_email.toString()
        val password = et_password.toString()
        presenterLogin.processLogin(email,password)
        onLoginSuccess()

    }


    override fun showError() {
        showToast(this,"Login failure")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenterLogin.onDestroy()
    }
}
