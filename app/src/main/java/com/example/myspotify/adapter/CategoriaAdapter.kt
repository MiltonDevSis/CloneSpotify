package com.example.myspotify.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myspotify.DetailsActivity
import com.example.myspotify.R
import com.example.myspotify.model.Categoria
import kotlinx.android.synthetic.main.categoria_item.view.*

class CategoriaAdapter(
    internal val categorias: MutableList<Categoria>,
    private val context: Context
) : RecyclerView.Adapter<CategoriaAdapter.CategoriaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.categoria_item, parent, false)
        return CategoriaHolder(view)

    }

    override fun onBindViewHolder(holder: CategoriaHolder, position: Int) {

        val categoria = categorias[position]
        holder.bind(categoria, context)
    }

    override fun getItemCount(): Int = categorias.size


    class CategoriaHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(categoria: Categoria, context: Context) {
            itemView.text_titulo.text = categoria.titulo
            itemView.recycler_albuns.adapter = AlbunsAdapter(categoria.albuns) {
                val intent = Intent(context, DetailsActivity::class.java)
                context.startActivity(intent)
            }
            itemView.recycler_albuns.layoutManager =
                LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        }

    }
}

