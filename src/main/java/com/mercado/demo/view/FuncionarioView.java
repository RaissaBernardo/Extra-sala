package com.mercado.demo.view;

import com.mercado.demo.controller.FuncionarioController;
import com.mercado.demo.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioView {
    FuncionarioController fc = new FuncionarioController();

    @GetMapping
    public List<Funcionario> getAllFuncionarios() {
        return fc.pegarTodosOsFuncionarios();
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario f) {
        fc.adicionarFuncionario(f);
    }

    @PutMapping
    public boolean updateFuncionario(@RequestBody Funcionario f) {
        return fc.atualizarFuncionario(f);
    }

    @DeleteMapping
    public boolean deleteFuncionario(@RequestParam Long id) {
        return fc.removerFuncionario(id);
    }
}
