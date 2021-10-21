package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eam.parcial2.controlador.ctlActividad
import com.eam.parcial2.databinding.ActivityCrearActividadBinding
import com.eam.parcial2.databinding.ActivityListaActividadesBinding

class CrearActividadActivity : AppCompatActivity() {




    private lateinit var binding: ActivityCrearActividadBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar=supportActionBar
        if(actionBar !=null){
            actionBar.title="Crear Actividad"
        }

    }


    fun irListaActividades(view: View){
        val intent= Intent(this,ListaActividadesActivity::class.java)
        startActivity(intent)
    }

}