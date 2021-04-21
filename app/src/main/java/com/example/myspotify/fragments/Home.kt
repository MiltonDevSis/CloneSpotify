package com.example.myspotify.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myspotify.R
import com.example.myspotify.adapter.CategoriaAdapter
import com.example.myspotify.model.Album
import com.example.myspotify.model.Categoria
import kotlinx.android.synthetic.main.fragment_home.*

class Home : Fragment() {

    private lateinit var categoriaAdapter: CategoriaAdapter

    companion object{
        fun newInstance() : Home{
            val fragmenteHome = Home()
            val argumentos = Bundle()
            fragmenteHome.arguments = argumentos
            return fragmenteHome
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val categorias: MutableList<Categoria> = ArrayList()
        for (c in 0..4){
            val categoria = Categoria()
            categoria.titulo = "Categoria: $c"

            val albuns: MutableList<Album> = ArrayList()
            for (a in 0..19){
                val album = Album()
                album.album = R.drawable.spotify
                albuns.add(album)
            }

            categoria.albuns = albuns
            categorias.add(categoria)
        }

        categoriaAdapter = CategoriaAdapter(categorias, context!!)
        recycler_view_categorias.adapter = categoriaAdapter
        recycler_view_categorias.layoutManager = LinearLayoutManager(context)
        recycler_view_categorias.setHasFixedSize(true)
    }
}