package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/ricky268"))
            startActivity(i)
        })
        btn_Instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/pemikir.keras/"))
            startActivity(i)
        })
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.skrillex)
        btn_Play.setOnClickListener {
            MediaPlayer?.start()
        }
        btn_Pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        btn_Stop.setOnClickListener {
            MediaPlayer?.stop()
        }

    }
}
