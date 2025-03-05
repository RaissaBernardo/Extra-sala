package com.mercado.demo.banco;

import com.mercado.demo.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class DataBaseProduto {
    private final List<Produto> produtos = new ArrayList<>();

    public void insert(Produto p) {
        produtos.add(p);
    }

    public Produto findOne(Long id) {
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    public boolean update(Produto p) {
        int index = produtos.indexOf(findOne(p.getId()));
        if (index != -1) {
            produtos.set(index, p);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return produtos.removeIf(p -> p.getId().equals(id));
    }
}
