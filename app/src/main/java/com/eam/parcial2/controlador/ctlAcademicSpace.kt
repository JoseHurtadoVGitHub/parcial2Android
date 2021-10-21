package com.eam.parcial2.controlador

import android.content.Context
import com.eam.parcial2.R
import com.eam.parcial2.adapter.activiadAdapter
import com.eam.parcial2.adapter.actividad2Adaptar
import com.eam.parcial2.modelo.AcademicSpace


class ctlAcademicSpace {


    fun llenarArreglo():ArrayList<AcademicSpace>{
        val listaActividades=arrayListOf<AcademicSpace>()

        listaActividades.add(AcademicSpace("Matematicas IV",2,3,"XD","Ingenieria",1,true))
        listaActividades.add(AcademicSpace("Matematicas III",2,3,"XD","Ingenieria",1,false))
        listaActividades.add(AcademicSpace("Matematicas II",2,3,"XD","Ingenieria",1,true))
        listaActividades.add(AcademicSpace("Matematicas I",2,3,"XD","Ingenieria",1,false))
        listaActividades.add(AcademicSpace("Matematicas V",2,3,"XD","Ingenieria",1,true))
        listaActividades.add(AcademicSpace("Matematicas VII",2,3,"XD","Ingenieria",1,false))
        return listaActividades;

    }


    fun activiAdapter(contexto: Context):actividad2Adaptar{
        return actividad2Adaptar(contexto,R.layout.row_actividad2,llenarArreglo())
    }







}