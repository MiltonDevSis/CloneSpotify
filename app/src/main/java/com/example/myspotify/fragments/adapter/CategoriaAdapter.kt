package com.example.myspotify.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myspotify.R
import com.example.myspotify.model.Categoria
import kotlinx.android.synthetic.main.categoria_item.view.*

class CategoriaAdapter(
    private val categorias: MutableList<Categoria>
) : RecyclerView.Adapter<CategoriaAdapter.CategoriaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.categoria_item, parent, false)
        return CategoriaHolder(view)

    }

    override fun onBindViewHolder(holder: CategoriaHolder, position: Int) {

        val categoria = categorias[position]
        holder.bind(categoria)
    }

    override fun getItemCount(): Int = categorias.size


    class CategoriaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(categoria: Categoria){
            itemView.text_titulo.text = categoria.titulo
        }
    }
}

