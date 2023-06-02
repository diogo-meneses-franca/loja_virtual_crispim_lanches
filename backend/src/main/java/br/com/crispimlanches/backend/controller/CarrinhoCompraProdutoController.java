package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.CarrinhoCompraProduto;
import br.com.crispimlanches.backend.service.CarrinhoCompraProdutoService;
import br.com.crispimlanches.backend.service.CarrinhoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/carrinhoCompraProduto")
public class CarrinhoCompraProdutoController {
    @Autowired
    private CarrinhoCompraProdutoService carrinhoCompraProdutoService;

    public CarrinhoCompraProduto inserir(CarrinhoCompraProduto carrinhoCompraProduto){
        return carrinhoCompraProdutoService.inserir(carrinhoCompraProduto);
    }


    @PutMapping
    public CarrinhoCompraProduto editar(CarrinhoCompraProduto carrinhoCompraProduto){
        return carrinhoCompraProdutoService.editar(carrinhoCompraProduto);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable(name = "id") Long id){
        carrinhoCompraProdutoService.excluir(id);
    }

    @GetMapping
    public List<CarrinhoCompraProduto> listarTodos(){
        return carrinhoCompraProdutoService.listarTodos();
    }
}
