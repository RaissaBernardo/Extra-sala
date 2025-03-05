package com.mercado.demo.model;

public class Funcionario {
    private Long id;
    private String nome;
    private String cpf;
    private double comissao;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, double comissao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.comissao = comissao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
