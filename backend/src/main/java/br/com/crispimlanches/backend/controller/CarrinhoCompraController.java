package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.CarrinhoCompra;
import br.com.crispimlanches.backend.service.CarrinhoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/carrinhoCompra")
public class CarrinhoCompraController {
    @Autowired
    private CarrinhoCompraService carrinhoCompraService;

    @PostMapping
    public CarrinhoCompra inserir(CarrinhoCompra carrinhoCompra){
        return carrinhoCompraService.inserir(carrinhoCompra);
    }

    @PutMapping
    public CarrinhoCompra editar(CarrinhoCompra carrinhoCompra){
        return carrinhoCompraService.editar(carrinhoCompra);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable(name = "id") Long id){
        carrinhoCompraService.excluir(id);
    }
}
