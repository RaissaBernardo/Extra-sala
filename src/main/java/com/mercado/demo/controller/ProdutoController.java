package com.mercado.demo.controller;

import com.mercado.demo.banco.DataBaseProduto;
import com.mercado.demo.model.Produto;
import java.util.List;

public class ProdutoController {
    DataBaseProduto bcP = new DataBaseProduto();

    //RETORNA TD
    public List<Produto> pegarTodosOsProdutos() {
        return bcP.findAll();
    }

    // ADD PROS
    public void adicionarProduto(Produto p) {
        bcP.insert(p);
    }

    // ATUALIZA PROD
    public boolean atualizarProduto(Produto p) {
        return bcP.update(p);
    }

    // REMOVE
    public boolean removerProduto(int id) {
        return bcP.delete((long) id);
    }
}