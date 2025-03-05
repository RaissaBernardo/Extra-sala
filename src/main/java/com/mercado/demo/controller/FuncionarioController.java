package com.mercado.demo.controller;

import com.mercado.demo.banco.DataBaseFuncionario;
import com.mercado.demo.model.Funcionario;
import java.util.List;

public class FuncionarioController {
    DataBaseFuncionario dbFunc = new DataBaseFuncionario();

    public List<Funcionario> pegarTodosOsFuncionarios() {
        return dbFunc.findAll();
    }

    public void adicionarFuncionario(Funcionario f) {
        dbFunc.insert(f);
    }

    public boolean atualizarFuncionario(Funcionario f) {
        return dbFunc.update(f);
    }

    public boolean removerFuncionario(Long id) {
        return dbFunc.delete(id);
    }
}
