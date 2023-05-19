package com.example.common

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {

    fun showToast(msg: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, msg, length).show()
    }
}