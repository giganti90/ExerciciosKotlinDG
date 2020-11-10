package com.example.jogotreino.classes

class SessaoDeTreinamento (var jogador : JogadorDeFutebol) {

    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("experiencia inicial é ${jogador.experiencia}")
        jogador.experiencia ++
        println("a experiencia inicial era ${jogador.experiencia} e agora, depois do treino, é de ${jogador.experiencia}")

    }
}
