package com.example.Banco;

public class ContaCorrente extends Conta {

      public ContaCorrente(Cliente cliente){
          super(cliente);
          System.out.println("Conta Corrente criada com sucesso");
      }
}
