package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private Integer numero;
    private BigDecimal saldo;
    private Cliente titular;

    public Conta(Integer numero, BigDecimal valor, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public boolean possuiSaldo(){
        return this.saldo.compareTo(BigDecimal.ZERO) != 0;
    }
    public void sacar(BigDecimal numero){
        this.saldo = this.saldo.subtract(saldo);
    }
    public void depositar(BigDecimal numero) {
    }

    public Integer getNumero(){
        return this.numero;
    }
    public BigDecimal getValor(){
        return this.saldo;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public boolean equals() {
        return true;
    }
    public int hashCode(){
        return 0;
    }
  }