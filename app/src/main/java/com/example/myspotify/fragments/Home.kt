package com.example.myspotify.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myspotify.R
import com.example.myspotify.adapter.CategoriaAdapter
import com.example.myspotify.model.*
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val categorias = arrayListOf<Categoria>()

        categoriaAdapter = CategoriaAdapter(categorias, context!!)
        recycler_view_categorias.adapter = categoriaAdapter
        recycler_view_categorias.layoutManager = LinearLayoutManager(context)
        recycler_view_categorias.setHasFixedSize(true)

        retrofit().create(SpotifyApi::class.java)
            .listCategorias()
            .enqueue(object : Callback<Categorias>{

                @SuppressLint("NotifyDataSetChanged")
                override fun onResponse(call: Call<Categorias>, response: Response<Categorias>) {
                   if (response.isSuccessful){
                       response.body()?.let {

                           categoriaAdapter.categorias.clear()
                           categoriaAdapter.categorias.addAll(it.categorias)
                           categoriaAdapter.notifyDataSetChanged()
                       }
                   }
                }

                override fun onFailure(call: Call<Categorias>, t: Throwable) {
                    Toast.makeText(context, "Erro no servidor: $t", Toast.LENGTH_LONG).show()
                }


            })
    }
}