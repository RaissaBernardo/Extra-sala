package com.mercado.demo.view;

import com.mercado.demo.controller.FornecedorController;
import com.mercado.demo.model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorView {
    FornecedorController fc = new FornecedorController();

    @GetMapping
    public List<Fornecedor> getAllFornecedores() {
        return fc.pegarTodosOsFornecedores();
    }

    @PostMapping
    public void addFornecedor(@RequestBody Fornecedor f) {
        fc.adicionarFornecedor(f);
    }

    @PutMapping
    public boolean updateFornecedor(@RequestBody Fornecedor f) {
        return fc.atualizarFornecedor(f);
    }

    @DeleteMapping
    public boolean deleteFornecedor(@RequestParam Long id) {
        return fc.removerFornecedor(id);
    }
}
