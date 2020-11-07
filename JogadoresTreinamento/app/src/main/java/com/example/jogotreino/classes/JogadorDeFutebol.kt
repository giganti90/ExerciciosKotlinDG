package com.example.jogotreino.classes

class JogadorDeFutebol(
        val nome: String,
        var energia: Int,
        var alegria: Int,
        var gols: Int,
        var experiencia: Int
    ) {

        fun fazerGol() {
            alegria += 10
            energia -= 5
            println("GOOOL!")
        }

        fun correr() {
            energia -= 10
            println("Cansei")
        }
    }
