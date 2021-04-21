package com.example.myspotify.model

import com.google.gson.annotations.SerializedName

data class Categorias(

    @SerializedName("categoria")
    var categorias: List<Categoria>
)