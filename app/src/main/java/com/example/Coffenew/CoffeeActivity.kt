package com.example.Coffenew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.last_application.R
import com.example.last_application.databinding.ActivityCoffeeBinding

class CoffeeActivity : AppCompatActivity() {
    private var binding :ActivityCoffeeBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityCoffeeBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding?.root)

        binding?.buttonstart?.setOnClickListener {
            onButtonClick()
        }

    }
    private fun onButtonClick (){
        val intent=Intent(this,
         CoffeeActivity2::class.java )
        startActivity(intent)
    }

    override fun onDestroy() {
        binding=null
        super.onDestroy()
    }

}