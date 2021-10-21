package com.eam.parcial2.adapter

import android.app.Activity
import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button

import android.widget.Switch

import android.widget.TextView

import com.eam.parcial2.R
import com.eam.parcial2.modelo.Actividad


class activiadAdapter(var miContexto : Context, var resources:Int, var items:List<Actividad>):
    ArrayAdapter<Actividad>(miContexto,resources,items)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater: LayoutInflater = LayoutInflater.from(miContexto)
        val view: View =layoutInflater.inflate(resources,null)


        val txtNombre: TextView =view.findViewById(R.id.txtNombre)
        val swCheck: Switch =view.findViewById(R.id.swCheck)
        val btnModificar: Button =view.findViewById(R.id.btnEditar)



        var miItem:Actividad=items[position]

        txtNombre.text=miItem.nombre

       if(miItem.activa){
           swCheck.isChecked=true;

        }




        return view
    }


}