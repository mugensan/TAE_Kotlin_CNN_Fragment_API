package com.example.tae_kotlin_cnn_fragment_api.common

import android.content.Context
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun showToast(
    context: Context,
    text: String,
    duration: Int = Toast.LENGTH_SHORT
    /*functor: Toast.() -> Unit*/
) {
    val toast: Toast = Toast.makeText(context, text, duration)
    //toast.functor()
    toast.show()
}


class CallBackKt<T> : Callback<T> {

    var onResponse: ((Response<T>) -> Unit)? = null
    var onFailure: ((t: Throwable?) -> Unit)? = null

    override fun onFailure(call: Call<T>, t: Throwable) {
        onFailure?.invoke(t)

    }

    override fun onResponse(call: Call<T>, response: Response<T>) {
        onResponse?.invoke(response)

    }

}