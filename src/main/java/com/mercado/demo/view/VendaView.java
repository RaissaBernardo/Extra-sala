package com.mercado.demo.view;

import com.mercado.demo.controller.VendaController;
import com.mercado.demo.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaView {
    VendaController vc = new VendaController();

    @GetMapping
    public List<Venda> getAllVendas() {
        return vc.pegarTodasAsVendas();
    }

    @PostMapping
    public void addVenda(@RequestBody Venda v) {
        vc.adicionarVenda(v);
    }

    @PutMapping
    public boolean updateVenda(@RequestBody Venda v) {
        return vc.atualizarVenda(v);
    }

    @DeleteMapping
    public boolean deleteVenda(@RequestParam Long id) {
        return vc.removerVenda(id);
    }
}
