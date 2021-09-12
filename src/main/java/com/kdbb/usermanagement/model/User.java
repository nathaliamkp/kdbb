package com.kdbb.usermanagement.model;

import javax.persistence.*;

@Entity
@Table(name= "t_pdg_usuario")
@SequenceGenerator(name = "usuario", sequenceName = "sq_usuario", allocationSize=1)
public class User {

    @Id
    @GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
    @Column(name = "cd_usuario")
    long id;
    @Column(name = "nm_usuario")
    String nomeCompleto;

    @Column(name = "ds_rg")
    String rg;

    @Column(name = "ds_cpr")
    String cpf;

    @Column(name = "nr_celular")
    int celular;

    public User() {
    }

    public User(long id, String nomeCompleto, String rg, String cpf, int celular) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
        this.celular = celular;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
