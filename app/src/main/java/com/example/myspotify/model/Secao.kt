package com.example.myspotify.model

import com.example.myspotify.R

data class Secao(
    var secao: Int,
    var nomeSecao: String
)

class SecaoBuilder {
    var secao: Int = 0
    var nomeSecao: String = ""

    fun build() : Secao = Secao(secao = secao, nomeSecao = nomeSecao)
}

fun secao(block: SecaoBuilder.() -> Unit): Secao = SecaoBuilder().apply(block).build()

fun dados(): MutableList<Secao> = mutableListOf(

    secao {
        secao = R.drawable.secao1
        nomeSecao = "Podcasts"
    },

    secao {
        secao = R.drawable.secao2
        nomeSecao = "Lançamentos"
    },

    secao {
        secao = R.drawable.secao3
        nomeSecao = "Em casa"
    },

    secao {
        secao = R.drawable.secao4
        nomeSecao = "Paradas"
    },

    secao {
        secao = R.drawable.secao2
        nomeSecao = "Shows"
    },

    secao {
        secao = R.drawable.secao1
        nomeSecao = "Made for you"
    },

    secao {
        secao = R.drawable.secao4
        nomeSecao = "Top Brasil"
    },

    secao {
        secao = R.drawable.secao2
        nomeSecao = "Rock"
    },

    secao {
        secao = R.drawable.secao1
        nomeSecao = "Funk"
    },

    secao {
        secao = R.drawable.secao4
        nomeSecao = "Sertanejas"
    },

    secao {
        secao = R.drawable.secao2
        nomeSecao = "Descobertas"
    },

    secao {
        secao = R.drawable.secao3
        nomeSecao = "Trilhas sonoras"
    },


)