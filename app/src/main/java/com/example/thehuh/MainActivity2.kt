package com.example.thehuh

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.button2)
        val btn2 = findViewById<Button>(R.id.button3)
        val imb = findViewById<ImageButton>(R.id.imageButton)
        val sound: MediaPlayer = MediaPlayer.create(this, R.raw.jerma2)

        btn.setOnClickListener(){
            intent = Intent(this, api::class.java)
           // intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            this.startActivity(intent)


        }

        btn2.setOnClickListener(){
            intent = Intent(this, api2::class.java)
            //intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            this.startActivity(intent)
        }

        imb.setOnClickListener(){
            sound.start()
        }
    }

   /* override fun onBackPressed() {
        super.onBackPressed()
        intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        this.startActivity(intent)
    } */
}