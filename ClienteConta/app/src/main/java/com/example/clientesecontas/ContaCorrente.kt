package com.example.clientesecontas

class ContaCorrente (cliente : Cliente, val limiteChequeEspecial: Double) : Conta(cliente) {

    override fun saque(valor: Double) {
        val valorAlemLimite = super.saldo - valor
        if (super.saldo <= valor) {
            saque(valor)
            println("saque efetivado")
        } else if (super.saldo >= valor) {
            valorAlemLimite <= limiteChequeEspecial
            println("limite insuficiente para saque")
        } else {
            println("saque efetivado")
        }
    }
}
