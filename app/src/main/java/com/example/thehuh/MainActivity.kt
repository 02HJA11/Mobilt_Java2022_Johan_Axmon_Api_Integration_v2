package com.example.thehuh


import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imv = findViewById<ImageView>(R.id.imageView3)
        val imb = findViewById<ImageButton>(R.id.imageButton2)

        Glide.with(this).load(R.drawable.butcher_music).into(imv)
        val btn = findViewById<Button>(R.id.button);

        val sound: MediaPlayer = MediaPlayer.create(this, R.raw.jerma)




        btn.setOnClickListener(){
            intent = Intent(this, MainActivity2::class.java)
           // intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            this.startActivity(intent)



        }

        imb.setOnClickListener(){
            sound.start();
        }



    }

    override fun onBackPressed() {

    }

}