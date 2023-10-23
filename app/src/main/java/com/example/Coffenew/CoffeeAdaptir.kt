package com.example.Coffenew

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.last_application.databinding.ItemCoffeeBinding


class CoffeeAdaptir(private val dataList: List<String>) :RecyclerView.Adapter<CoffeeAdaptir.CoffeViewHolder>(){

    class CoffeViewHolder(private val binding: ItemCoffeeBinding):ViewHolder(binding.root){
  fun bind(data:String){

  }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeViewHolder {
        val binding=ItemCoffeeBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return CoffeViewHolder((binding))
    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    override fun onBindViewHolder(holder: CoffeViewHolder, position: Int) {

        holder.bind(dataList[position])
    }
}