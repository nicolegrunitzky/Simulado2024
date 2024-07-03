package com.example.simulado2024.controller;

import com.example.simulado2024.entity.Imovel;
import com.example.simulado2024.entity.Proprietario;
import com.example.simulado2024.service.ImovelService;
import com.example.simulado2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImovelController {
    @Autowired
    ImovelService imovelService;

    @PostMapping("imovel")
    public String cadastrarImovel(@RequestBody @Valid Imovel imovel) {
        imovelService.cadastrarImovel(imovel);
        return "Imóvel cadastrado com sucesso!";
    }

    @GetMapping("imoveis/{id}")
    public List<Imovel> buscarImoveis() {
        return imovelService.buscarImoveis();
    }

    @PutMapping("upimovel/{id}")
    public String atualizarImovel(@RequestBody @Valid Imovel imovel) {
        imovelService.atualizarImovel(imovel);
        return "Imóvel atualizado com sucesso!";
    }

    @DeleteMapping("deleteimovel/{id}")
    public String deletarImovel(@PathVariable Long id) {
        imovelService.deletarImovel(id);
        return "Imóvel excluído com sucesso!";
    }
}
