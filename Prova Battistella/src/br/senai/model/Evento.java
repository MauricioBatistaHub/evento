package br.senai.model;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<Cliente> clientes;

    public Evento(){
        clientes= new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void setCliente(String nome, String cpf, String telefone, String email){
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);

        clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "\nEvento:" + nome + " " +
                "Data:" + data + "\n" + clientes;
    }
}
