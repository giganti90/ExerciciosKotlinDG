package com.example.clientesecontas

abstract class Conta (cliente: Cliente) {

       var saldo: Double = 0.0

       open fun deposito(valor: Double) {
              if (valor > 0) {
                     saldo += valor
                     println("Deposito feito")
                     }
              }

       open fun saque(valor: Double) {
              saldo -= valor
              println("saldo atual: $saldo")
       }
}

