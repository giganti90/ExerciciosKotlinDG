package com.example.clientesecontas

class ContaPoupanca (cliente: Cliente, numeroConta: Int, saldo: Double, titular: Cliente) : Conta (cliente) {

    override fun saque(valor: Double) {
        if (valor <= super.saldo) {
            super.saldo -= valor
            println("saque efetivado")
        } else {
            println("saldo insuficiente")
        }
    }
}
