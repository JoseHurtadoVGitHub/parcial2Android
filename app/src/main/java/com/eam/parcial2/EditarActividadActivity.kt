package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eam.parcial2.databinding.ActivityEditarActividadBinding
import com.eam.parcial2.modelo.Actividad

class EditarActividadActivity : AppCompatActivity() {





    private lateinit var binding: ActivityEditarActividadBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityEditarActividadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val actionBar=supportActionBar

        if(actionBar !=null){
            actionBar.title="Editar actividad"
        }
        llenarDatos(intent.getSerializableExtra("objeto")as Actividad)







    }
    fun irListaActividades(view: View){
        val intent= Intent(this,ListaActividadesActivity::class.java)
        startActivity(intent)
    }


    private fun llenarDatos(actividad: Actividad){
        binding.txtNombre.setText(actividad.nombre)
        binding.txtDescripcion.setText(actividad.descripcion)
    }


}