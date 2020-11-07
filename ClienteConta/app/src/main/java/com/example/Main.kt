package com.example

import com.example.clientesecontas.Cliente
import com.example.clientesecontas.Conta

fun main () {

    val cliente1 : Cliente = Cliente("Valeria", "Serra")
    val conta1 : Conta = Conta(2, 100.0, cliente1)
    conta1.deposito(100.0)


    val cliente2 : Cliente = Cliente("Talia", "Giganti")
    val conta2 : Conta = Conta(3, 500.0, cliente2)
    conta2.deposito(200.0)

}

