package com.example.Banco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BancoApplication {

	public static void main(String[] args) {

		System.out.println("");

		Cliente cliente = new Cliente("Roberto");
		Cliente cliente2 = new Cliente("Caroline");

		Conta conta = new ContaCorrente(cliente);
		Conta conta2 = new ContaPoupanca(cliente2);

		conta.depositar(200.00);
		conta.consultarSaldo();
		conta.sacar(150.00);

		conta2.depositar(10000.00);
		conta.consultarSaldo();
		conta2.sacar(1000.00);


	}



}
