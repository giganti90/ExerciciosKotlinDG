package com.example.jogotreino.classes

class SessaoDeTreinamento() {

    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        val experienciaInicial = jogador.experiencia
        jogador.experiencia += 1
        println("A experieência inicial era de $experienciaInicial e subiu para ${jogador.experiencia}")
    }
}
