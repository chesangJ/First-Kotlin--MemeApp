package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fouractivity : AppCompatActivity() {
    lateinit var  btsix:Button
    lateinit var btseven:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fouractivity)

        btsix=findViewById<Button>(R.id.btsix)
        btsix.setOnClickListener { val intent=Intent(this,meme3Activity::class.java)
        startActivity(intent)

        }
        btseven=findViewById(R.id.btseven)
        btseven.setOnClickListener { val intent=Intent(this,five::class.java)
            startActivity(intent)

        }


    }
}