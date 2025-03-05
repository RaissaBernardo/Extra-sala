package com.mercado.demo.controller;

import com.mercado.demo.banco.DataBaseVenda;
import com.mercado.demo.model.Venda;
import java.util.List;

public class VendaController {
    DataBaseVenda dbVenda = new DataBaseVenda();

    public List<Venda> pegarTodasAsVendas() {
        return dbVenda.findAll();
    }

    public void adicionarVenda(Venda v) {
        dbVenda.insert(v);
    }

    public boolean atualizarVenda(Venda v) {
        return dbVenda.update(v);
    }

    public boolean removerVenda(Long id) {
        return dbVenda.delete(id);
    }
}
