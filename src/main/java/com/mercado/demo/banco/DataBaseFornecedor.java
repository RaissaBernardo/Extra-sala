package com.mercado.demo.banco;

import com.mercado.demo.model.Fornecedor;
import java.util.ArrayList;
import java.util.List;

public class DataBaseFornecedor {
    private final List<Fornecedor> fornecedores = new ArrayList<>();

    public void insert(Fornecedor f) {
        fornecedores.add(f);
    }

    public Fornecedor findOne(Long id) {
        return fornecedores.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Fornecedor> findAll() {
        return new ArrayList<>(fornecedores);
    }

    public boolean update(Fornecedor f) {
        int index = fornecedores.indexOf(findOne(f.getId()));
        if (index != -1) {
            fornecedores.set(index, f);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return fornecedores.removeIf(f -> f.getId().equals(id));
    }
}
