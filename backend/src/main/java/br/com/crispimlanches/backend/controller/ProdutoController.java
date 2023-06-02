package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.dto.ProdutoDTO;
import br.com.crispimlanches.backend.entity.Produto;
import br.com.crispimlanches.backend.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@CrossOrigin
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto inserir(@RequestBody Produto produto){
        return produtoService.inserir(produto);
    }

    @PutMapping
    public Produto editar(@RequestBody Produto produto){
        return produtoService.editar(produto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        produtoService.excluir(id);
    }

    @GetMapping
    public Page<ProdutoDTO> listarTodos(Pageable pageable){
        return produtoService.listarTodos(pageable);
    }
}
