package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.eam.parcial2.controlador.ctlActividad
import com.eam.parcial2.databinding.ActivityListaActividadesBinding
import com.eam.parcial2.modelo.Actividad

class ListaActividadesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaActividadesBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityListaActividadesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val actionBar=supportActionBar

        if(actionBar !=null){
            actionBar.title="Lista Actividades"
        }

        binding.lvActividades.adapter=ctlActividad().activiAdapter(this)


        val listaActividades=ctlActividad().llenarArreglo()



        binding.lvActividades.setOnItemClickListener(AdapterView.OnItemClickListener{parent, view, position, id ->
            val actividad:Actividad= listaActividades[position]


            val intent= Intent(this,EditarActividadActivity::class.java)
            intent.putExtra("objeto",actividad)
            startActivity(intent)

        })

    }


    fun irCrearActividad(view: View){
        val intent= Intent(this,CrearActividadActivity::class.java)
        startActivity(intent)
    }

    private fun imprimir(mensaje: String){
        Toast.makeText(this,mensaje, Toast.LENGTH_LONG).show()

    }
}