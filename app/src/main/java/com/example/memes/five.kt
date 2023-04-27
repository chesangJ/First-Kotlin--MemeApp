package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class five : AppCompatActivity() {
    lateinit var bteight:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        bteight=findViewById(R.id.bteight)
        bteight.setOnClickListener { val intent=Intent(this,fouractivity::class.java)
            startActivity(intent)

        }
    }
}