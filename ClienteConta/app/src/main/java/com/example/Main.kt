package com.example

import com.example.clientesecontas.Cliente
import com.example.clientesecontas.Conta
import com.example.clientesecontas.ContaCorrente
import com.example.clientesecontas.ContaPoupanca

fun main () {

    val cliente1 = Cliente("Valeria", "Serra")
    val contaPoupanca = ContaPoupanca(cliente1, 1, 100.00, titular = cliente1)
    contaPoupanca.deposito(100.0)


    val cliente2 = Cliente("Talia", "Giganti")
    val contaCorrente = ContaCorrente(cliente2, 100.00)
    contaCorrente.deposito(200.0)

}
//teste
