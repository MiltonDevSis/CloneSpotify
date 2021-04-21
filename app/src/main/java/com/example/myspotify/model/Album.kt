package com.example.myspotify.model

import com.google.gson.annotations.SerializedName

data class Album(

    @SerializedName("url_imagem")
    var album: String = ""
)