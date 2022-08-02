package com.example.toastmaster

import android.content.Context
import android.widget.Toast

object ToastManager {
    fun createSimpleToast(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, duration).show()
    }
}