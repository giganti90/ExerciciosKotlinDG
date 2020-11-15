package com.example.clientesecontas

class ContaCorrente (cliente : Cliente, val limiteChequeEspecial: Double) : Conta(cliente) {

    override fun saque(valor: Double) {
        val valorAlemLimite = super.saldo - valor
        if (saldo >= valor) {
            super.saque(valor)
            println("saque efetivado, saldo é ${super.saldo}")
        } else if (super.saldo >= valor) {
            valorAlemLimite <= limiteChequeEspecial
            println("limite insuficiente para saque")
        } else {
            println("saque efetivado")
        }
    }
}
