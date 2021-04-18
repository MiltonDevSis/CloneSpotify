package com.example.myspotify.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myspotify.R

class Biblioteca : Fragment() {

    companion object{
        fun newInstance() : Biblioteca{
            val fragmenteBiblioteca = Biblioteca()
            val argumentos = Bundle()
            fragmenteBiblioteca.arguments = argumentos
            return fragmenteBiblioteca
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_biblioteca, container, false)
    }
}