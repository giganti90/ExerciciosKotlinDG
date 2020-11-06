package com.example.clientesecontas

class Exercicio1 (cliente1 : String, cliente2 : String, conta1 : Int, conta2: Int) {

    fun doisClientes (cliente1: Cliente, cliente2: Cliente, conta1: Conta, conta2: Conta) {
        cliente1("Valeria", "Serra")
        conta1(2, 100.0, cliente1)
        conta1.deposito(100.0)


        cliente2("Talia", "Giganti")
        conta2(3, 500.0, cliente2)
        conta2.deposito(200.0)

    }
}