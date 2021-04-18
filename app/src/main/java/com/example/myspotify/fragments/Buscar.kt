package com.example.myspotify.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myspotify.R

class Buscar : Fragment() {

    companion object{
        fun newInstance() : Buscar{
            val fragmenteBuscar = Buscar()
            val argumentos = Bundle()
            fragmenteBuscar.arguments = argumentos
            return fragmenteBuscar
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buscar, container, false)
    }
}

