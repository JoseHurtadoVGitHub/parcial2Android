package com.eam.parcial2.controlador

import android.content.Context
import com.eam.parcial2.R
import com.eam.parcial2.modelo.Actividad
import com.eam.parcial2.adapter.activiadAdapter


class ctlActividad {


    fun llenarArreglo():ArrayList<Actividad>{
        val listaActividades=arrayListOf<Actividad>()

        listaActividades.add(Actividad("nombre 1","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 2","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 3","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 4","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 5","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 6","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 7","ejemplo de descripción",false))
        listaActividades.add(Actividad("nombre 8","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 9","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 10","ejemplo de descripción",true))
        listaActividades.add(Actividad("nombre 11","ejemplo de descripción",true))

        return listaActividades;


    }


    fun activiAdapter(contexto: Context):activiadAdapter{
        return activiadAdapter(contexto,R.layout.row_actividad,llenarArreglo())
    }







}