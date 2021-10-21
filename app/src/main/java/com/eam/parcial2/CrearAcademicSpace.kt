package com.eam.parcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CrearAcademicSpace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_academic_space)
    }

    fun irListaActividades(view: View){
        val intent= Intent(this,ListaAcademicSpace::class.java)
        startActivity(intent)
    }
}