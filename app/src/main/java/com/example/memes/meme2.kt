package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class meme2 : AppCompatActivity() {
    lateinit var btThree:Button
    lateinit var bttwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        btThree=findViewById<Button>(R.id.btThree)
        bttwo=findViewById<Button>(R.id.bttwo)

        btThree.setOnClickListener { val intent=Intent(this,meme3Activity::class.java)
        startActivity(intent)
        }
        bttwo.setOnClickListener { val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}