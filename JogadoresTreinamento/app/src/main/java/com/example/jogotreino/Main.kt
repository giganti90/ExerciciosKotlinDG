package com.example.jogotreino

import com.example.jogotreino.classes.JogadorDeFutebol
import com.example.jogotreino.classes.SessaoDeTreinamento

fun main() {
    val jogador1 = JogadorDeFutebol("Gabriel", 10, 0, 1, 0)
    jogador1.fazerGol()

    val sessaoDeTreinamento = SessaoDeTreinamento()
    sessaoDeTreinamento.treinarA(jogador1)
//    println($experiencia)
}
