package com.example.last_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val cappucino=findViewById<ImageView>(R.id.cappucino)
        cappucino.setOnClickListener(
            View.OnClickListener {

                val intent= Intent(this,MainActivity3::class.java )
                startActivity(intent)
            }

        )



    }
}