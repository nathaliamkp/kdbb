package com.kdbb.usermanagement.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "name")
    String nomeCompleto;

    @Column(name = "identity")
    String rg;

    @Column(name = "document")
    String cpf;

    @Column(name = "city")
    String cidade;

    @Column(name = "neighborhood")
    String bairro;

    @Column(name = "telephone")
    int telefone;

    @Column(name = "cellphone")
    int celular;

    public User() {
    }

    public User(long id, String nomeCompleto, String rg, String cpf, String cidade, String bairro, int telefone, int celular) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.celular = celular;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}
