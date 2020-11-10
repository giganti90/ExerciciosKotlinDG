package com.example.jogotreino

import com.example.jogotreino.classes.JogadorDeFutebol
import com.example.jogotreino.classes.SessaoDeTreinamento

fun main() {

    val jogador1 = JogadorDeFutebol("Tata", 10, 10, 5, 0)

    val jogador2 = JogadorDeFutebol("Val", 5, 5,2, 1)

    val sessaoDeTreinamento = SessaoDeTreinamento(jogador1)
    sessaoDeTreinamento.treinarA(jogador1)

}
