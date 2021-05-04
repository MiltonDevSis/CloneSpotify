package com.example.myspotify.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myspotify.R
import com.example.myspotify.adapter.SecaoAdapter
import com.example.myspotify.model.dados
import kotlinx.android.synthetic.main.fragment_buscar.*

class Buscar : Fragment() {

    private lateinit var secaoAdapter: SecaoAdapter

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        secaoAdapter = SecaoAdapter(dados())
        recycler_view_secao.adapter = secaoAdapter
        recycler_view_secao.layoutManager = GridLayoutManager(context, 2)
    }
}

