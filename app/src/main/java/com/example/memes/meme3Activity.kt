package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme3Activity : AppCompatActivity() {
    lateinit var btfive:Button
    lateinit var btfour:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btfive=findViewById(R.id.btfive)
        btfour=findViewById(R.id.btfour)
        btfive.setOnClickListener { var intent=Intent(this,fouractivity::class.java)
        startActivity(intent)
        }
        btfour.setOnClickListener { var intent=Intent(this,meme2::class.java)
            startActivity(intent)
    }
}
}