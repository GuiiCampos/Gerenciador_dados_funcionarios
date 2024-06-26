package com.funcionariosdata.projet.model;

import jakarta.persistence.*;

//classe que gerência o banco de dados
@Entity
@Table(name = "dados")
public class ModelFuncionarios {

    //Id que se auto incrementa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //nome das tabelas
    private String nome;
    private String alergias;
    private String problemasMedicos;
    private String telefone;
    private String email;

    //getters e setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public void setProblemasMedicos(String problemasMedicos) {
        this.problemasMedicos = problemasMedicos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
