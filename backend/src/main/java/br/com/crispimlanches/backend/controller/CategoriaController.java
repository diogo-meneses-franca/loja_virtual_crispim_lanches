package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.Categoria;
import br.com.crispimlanches.backend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria inserir(@RequestBody Categoria categoria){
        return categoriaService.inserir(categoria);
    }

    @PutMapping
    public Categoria editar(@RequestBody Categoria categoria){
        return categoriaService.editar(categoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        categoriaService.excluir(id);
    }

    @GetMapping
    public List<Categoria> listarTodos(){
        return categoriaService.listarTodos();
    }
}
