package com.mercado.demo.banco;

import com.mercado.demo.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class DataBaseFuncionario {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void insert(Funcionario f) {
        funcionarios.add(f);
    }

    public Funcionario findOne(Long id) {
        return funcionarios.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }

    public boolean update(Funcionario f) {
        int index = funcionarios.indexOf(findOne(f.getId()));
        if (index != -1) {
            funcionarios.set(index, f);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return funcionarios.removeIf(f -> f.getId().equals(id));
    }
}
