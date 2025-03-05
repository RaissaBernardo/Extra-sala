package com.mercado.demo.view;


import com.mercado.demo.controller.ProdutoController;
import com.mercado.demo.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produto")
public class ProdutoView {
        ProdutoController pc = new ProdutoController();

        @GetMapping
        public List<Produto> getAllProdutos() {
            return pc.pegarTodosOsProdutos();
        }

        @PostMapping
        public void addProduto(@RequestBody Produto p) {
            pc.adicionarProduto(p);
        }

        @PutMapping
        public boolean updateProduto(@RequestBody Produto p) {
            return pc.atualizarProduto(p);
        }

        @DeleteMapping
        public boolean deleteProduto(@RequestParam int id) {
            return pc.removerProduto(id);
        }
    }
