package com.example.Banco;

public abstract class Conta {

    protected String agencia = "001";

    protected int numero;
    protected double saldo = 0.00;

    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if(valor > saldo ){
            System.out.println("Saldo insuficiente");
        } else{
            saldo -= valor;
            System.out.println("Saque de: R$" + valor + " concluído com sucesso!");
        }

    }

    public void depositar(double valor){
       saldo += valor;
       System.out.println("Depósito de R$" + valor + " feito com sucesso!");
    }

    public void consultarSaldo(){
        System.out.println("Saldo total: R$" + saldo);
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

}
