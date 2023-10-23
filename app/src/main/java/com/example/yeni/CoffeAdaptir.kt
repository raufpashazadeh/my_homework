package com.example.yeni

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.last_application.databinding.ItemCoffeeBinding

class CoffeAdaptir(private val dataList:List<CoffeModel>):RecyclerView.Adapter<CoffeAdaptir.CoffeViewHolder>() {




    class CoffeViewHolder(private val binding: ItemCoffeeBinding):ViewHolder(binding.root){

      fun bind(data:CoffeModel) {
          //binding.cardView.cardElevation=data.cardView
          binding.imageView.setImageResource(data.icDroble)
          binding.coffeName.text=data.name
          binding.price.text= data.price.toString()
          binding.rating.setImageResource(icDroble = Int)
        binding.coffewith.text=data.with


      }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeViewHolder {
        var inflater=LayoutInflater.from(parent.context)
        val binding=ItemCoffeeBinding.inflate(inflater,parent,false)
        return CoffeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: CoffeViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

}

private fun Any.setImageResource(icDroble: Int.Companion) {

}




