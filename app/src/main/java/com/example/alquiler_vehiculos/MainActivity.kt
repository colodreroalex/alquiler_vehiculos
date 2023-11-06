package com.example.alquiler_vehiculos

import android.content.DialogInterface
import android.nfc.cardemulation.CardEmulation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.adapter.CarAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)  // Busca el RecyclerView en el diseño por su ID
        recyclerView.layoutManager = LinearLayoutManager(this)  // Configura el administrador de diseño del RecyclerView
        val adapter = CarAdapter(CarProvider.carList)  // Crea un adaptador personalizado con una lista de datos
        recyclerView.adapter = adapter  // Asigna el adaptador al RecyclerView
        recyclerView.visibility = View.INVISIBLE  // Inicialmente, establece la visibilidad del RecyclerView en INVISIBLE

        val buttonMostrar = findViewById<Button>(R.id.bMostrar)  // Busca el botón por su ID
        var isVisible = false  // Variable para realizar un seguimiento de la visibilidad actual

        buttonMostrar.setOnClickListener {
            if (isVisible) {
                recyclerView.visibility = View.INVISIBLE  // Si ya es visible, oculta el RecyclerView
                isVisible = false  // Actualiza la variable de visibilidad
            } else {
                recyclerView.visibility = View.VISIBLE  // Si no es visible, muestra el RecyclerView
                isVisible = true  // Actualiza la variable de visibilidad
            }
        }

        val buttonGuardar = findViewById<Button>(R.id.bGuardar)  // Busca el botón "Guardar" por su ID

        buttonGuardar.setOnClickListener{
            AlertDialog.Builder(this)  // Crea un diálogo de alerta utilizando el contexto actual
                .setTitle("Confirmacion")  // Establece el título del diálogo
                .setMessage("¿Desea guardar los datos?")  // Establece el mensaje del diálogo
                .setCancelable(false)  // Evita que se pueda cancelar el diálogo tocando fuera de él
                .setPositiveButton(android.R.string.ok, { dialog, which ->
                    // Cuando se presiona "OK", muestra un mensaje de Toast indicando que los datos se guardaron
                    Toast.makeText(applicationContext, "Se guardaron los datos", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton(android.R.string.cancel,  { dialog, which ->
                    // Cuando se presiona "Cancelar", muestra un mensaje de Toast indicando que no se guardaron los datos
                    Toast.makeText(applicationContext, "No se guardaron los datos", Toast.LENGTH_SHORT).show()
                })
                .show()  // Muestra el diálogo de alerta
        }








    }
}