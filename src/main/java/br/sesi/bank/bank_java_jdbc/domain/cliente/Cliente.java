package br.sesi.bank.bank_java_jdbc.domain.cliente;

import java.util.Objects;

public class Cliente {

    public String nome;
    public String cpf;
    public String email;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome;
        this.email = dados.email;
        this.cpf = dados.cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getCpf(){
        return cpf;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cpf.equals(cliente.cpf);
    }
    @Override
    public int hashCode(){
        return Objects.hash(cpf);
    }
    @Override
    public String toString(){
        return "CLiente{" +
                "nome'" + nome + '\'' +
                ", cpf'" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
