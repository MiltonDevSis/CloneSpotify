package com.example.myspotify.model

import com.google.gson.annotations.SerializedName

data class Categoria(

    @SerializedName("titulo")
    var titulo: String = "",

    @SerializedName("albuns")
    var albuns: List<Album> = arrayListOf()
)