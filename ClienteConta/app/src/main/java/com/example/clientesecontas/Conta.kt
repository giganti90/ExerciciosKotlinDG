package com.example.clientesecontas

open class Conta (val numeroConta: Int, var saldo: Double, val titular: Cliente) {

    fun deposito (valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Deposito feito")
        }
    }

    open fun saque (valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("saque efetivado")
        } else {
            println("saldo insuficiente")
        }
    }
}


// classe de conta poupança que tem que herdar saque da classe Conta
// class ContaPoupanca(cliente: Cliente, numeroConta: Int, saldo: Double, titular: Cliente) : Conta (cliente) {
//    override fun saque(valor: Double) {
//        if (saldo <= saque) {
//            saque()
//            println("saque efetivado")
//        }
//    }
//}

// classe de conta corrente que tem que herdar saque com o adicional de conferir limite do cheque especial para que o cliente possa sacar
//class ContaCorrente(cliente : Cliente, val private limiteChequeEspecial: Double) : Conta (cliente) {
//    override fun saque(valor: Double) {
//        val valorAlemLimite = saldo - saque
//        if (saldo <= saque) {
//            saque()
//            println("saque efetivado")
//        } else {
//            valorAlemLimite <= limiteChequeEspecial
//            println("limite insuficiente para saque")
//        } else if {
//            println("saque efetivado")
//        }
//    }
//}
