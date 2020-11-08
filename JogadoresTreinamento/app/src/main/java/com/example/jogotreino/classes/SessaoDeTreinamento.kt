package com.example.jogotreino.classes

class SessaoDeTreinamento (var jogador : JogadorDeFutebol) {

    fun treinarA(boleiro: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        var experienciaInicial = jogador.experiencia
        jogador.experiencia += 1
        println("a experiencia inicial era $experienciaInicial e agora, depois do treino, é de ${jogador.experiencia}")

    }
}
