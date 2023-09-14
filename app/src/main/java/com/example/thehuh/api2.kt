package com.example.thehuh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class api2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api2)
    }


    /*verride fun onBackPressed() {
        super.onBackPressed()

        intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        this.startActivity(intent)
    }*/
}