package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.eam.parcial2.controlador.ctlAcademicSpace
import com.eam.parcial2.controlador.ctlActividad
import com.eam.parcial2.databinding.ActivityListaAcademicSpaceBinding
import com.eam.parcial2.modelo.AcademicSpace
import com.eam.parcial2.modelo.Actividad

class ListaAcademicSpace : AppCompatActivity() {

    lateinit var binding: ActivityListaAcademicSpaceBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListaAcademicSpaceBinding.inflate(layoutInflater);
        val spinner: Spinner = binding.spinner01
        ArrayAdapter.createFromResource(
            this,
            R.array.creditos,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        setContentView(binding.root)

        val actionBar=supportActionBar

        if(actionBar !=null){
            actionBar.title="Lista Actividades"
        }

        binding.lvActividades.adapter= ctlAcademicSpace().activiAdapter(this)

        val listaActividades= ctlAcademicSpace().llenarArreglo()

        binding.lvActividades.setOnItemClickListener(AdapterView.OnItemClickListener{ parent, view, position, id ->
            val actividad: AcademicSpace = listaActividades[position]

        })

    }
    fun irCrearAcademicSpace(view: View){
        val intent= Intent(this,CrearAcademicSpace::class.java)
        startActivity(intent)
    }

}