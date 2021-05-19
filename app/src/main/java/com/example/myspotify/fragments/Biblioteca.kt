package com.example.myspotify.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myspotify.R
import com.example.myspotify.fragmentsTab.Albuns
import com.example.myspotify.fragmentsTab.Artistas
import com.example.myspotify.fragmentsTab.Playlists
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.fragment_biblioteca.*

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = FragmentPagerItemAdapter(fragmentManager, FragmentPagerItems.with(context)
            .add("Playlists", Playlists::class.java)
            .add("Artistas", Artistas::class.java)
            .add("Álbuns", Albuns::class.java)
            .create())

        viewpager.adapter = adapter
        viewpagertab.setViewPager(viewpager)
    }
}