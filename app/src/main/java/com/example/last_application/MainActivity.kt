package com.example.last_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val GetStarted=findViewById<Button>(R.id.buttonstart)
        GetStarted.setOnClickListener(OnClickListener {

            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        })
    }
}