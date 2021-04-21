package com.example.myspotify.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myspotify.R
import com.example.myspotify.model.Album
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.album_item.view.*

class AlbunsAdapter(private val albuns: List<Album>): RecyclerView.Adapter<AlbunsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbunsHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.album_item, parent, false)
        return AlbunsHolder(view)
    }

    override fun onBindViewHolder(holder: AlbunsHolder, position: Int) {
        val album = albuns[position]
        holder.bind(album)
    }

    override fun getItemCount(): Int = albuns.size
}

class AlbunsHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    fun bind(album: Album){
        Picasso.get()
            .load(album.album)
            .placeholder(R.drawable.placeholder)
            .fit()
            .into(itemView.image_album)
    }
}
