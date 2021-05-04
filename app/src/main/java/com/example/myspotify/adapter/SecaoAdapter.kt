package com.example.myspotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myspotify.R
import com.example.myspotify.model.Secao
import kotlinx.android.synthetic.main.secao_item.view.*

class SecaoAdapter(private val secoes: MutableList<Secao>): RecyclerView.Adapter<SecaoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecaoHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.secao_item, parent, false)
        return SecaoHolder(view)
    }

    override fun onBindViewHolder(holder: SecaoHolder, position: Int) {

        val secao: Secao = secoes[position]
        holder.bind(secao)
    }

    override fun getItemCount()  = secoes.size

}

class SecaoHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(secao: Secao){
        itemView.imagen_secao.setImageResource(secao.secao)
        itemView.nomeSecao.text = secao.nomeSecao
    }
}