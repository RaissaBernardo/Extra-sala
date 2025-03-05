package com.mercado.demo.controller;

import com.mercado.demo.banco.DataBaseFornecedor;
import com.mercado.demo.model.Fornecedor;
import java.util.List;

public class FornecedorController {
    DataBaseFornecedor dbFornecedor = new DataBaseFornecedor();

    public List<Fornecedor> pegarTodosOsFornecedores() {
        return dbFornecedor.findAll();
    }

    public void adicionarFornecedor(Fornecedor f) {
        dbFornecedor.insert(f);
    }

    public boolean atualizarFornecedor(Fornecedor f) {
        return dbFornecedor.update(f);
    }

    public boolean removerFornecedor(Long id) {
        return dbFornecedor.delete(id);
    }
}
