package com.example.yeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.last_application.databinding.ActivityCoffeRecBinding

class ListActivity : AppCompatActivity() {
    private var binding:ActivityCoffeRecBinding?=null
    private val adapter=CoffeAdaptir(createList())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCoffeRecBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
   binding?.recycler?.adapter=adapter
    }

    private fun createList()= listOf(
        CoffeModel(name = "Cappuccino", rating = 4.8, icDroble = Int, price =  4.53, with = "with Chocolate"),
        CoffeModel(name = "Latte", rating = 4.9, icDroble = Int, price = 3.90, with = "with Oat Milk"),
        CoffeModel(name = "Americano", rating = 4.5, icDroble = Int, price = 3.35, with = "with Oat Sugar"),
        CoffeModel(name = "IceLatte", rating = 4.0, icDroble = Int, price = 4.20, with = "with Oat Ice")
    )


    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}