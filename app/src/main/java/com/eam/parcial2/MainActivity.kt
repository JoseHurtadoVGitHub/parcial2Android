package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eam.parcial2.controlador.ctlActividad
import com.eam.parcial2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar=supportActionBar

        if(actionBar !=null){
            actionBar.title="Menú"
        }


    }

     fun irListaActividades(view:View){
        val intent= Intent(this,ListaActividadesActivity::class.java)
        startActivity(intent)
    }

    fun irAcademicSpaces(view:View){
        val intent= Intent(this,ListaAcademicSpace::class.java)
        startActivity(intent)
    }







}