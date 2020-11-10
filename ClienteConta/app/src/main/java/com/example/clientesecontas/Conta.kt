package com.example.clientesecontas

class Conta (val numeroConta: Int, var saldo: Double, val titular: Cliente) {

    fun deposito (valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Deposito feito")
        }
    }

    fun saque (valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("saque efetivado")
        } else {
            println("saldo insuficiente")
        }
    }
}
//teste
