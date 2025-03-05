package com.mercado.demo.model;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    private Long id;
    private String cliente;
    private List<Produto> produtos;
    private int quantidade;
    private double valorTotal;
    private LocalDate data;

    public Venda() {
    }

    public Venda(Long id, String cliente, List<Produto> produtos, int quantidade, double valorTotal, LocalDate data) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
