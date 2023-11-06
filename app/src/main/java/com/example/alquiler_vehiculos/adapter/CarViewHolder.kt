package com.example.alquiler_vehiculos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Car
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class CarViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemVehiculoBinding.bind(view)

    fun render(carModel: Car){
        binding.tbModelo.text= carModel.modelo
        binding.tbCapacidad.text= carModel.capacidad
        binding.tbPlazas.text= carModel.plazas.toString()

        Glide.with(binding.carImg.context).load(carModel.photo).into(binding.carImg)
    }

}