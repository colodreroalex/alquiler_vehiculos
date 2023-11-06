package com.example.alquiler_vehiculos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.Car
import com.example.alquiler_vehiculos.R

class CarAdapter(val carList: List<Car>): RecyclerView.Adapter<CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return CarViewHolder(layoutInflater.inflate(R.layout.item_vehiculo, parent , false))
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val item = carList[position]
        holder.render(item)
    }
}