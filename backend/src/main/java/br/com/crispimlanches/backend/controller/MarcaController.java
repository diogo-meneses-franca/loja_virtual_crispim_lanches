package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.Marca;
import br.com.crispimlanches.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @PostMapping
    public Marca inserir(@RequestBody Marca marca){
        return marcaService.inserir(marca);
    }

    @PutMapping
    public Marca editar(@RequestBody Marca marca){
        return marcaService.editar(marca);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        marcaService.excluir(id);
    }

    @GetMapping
    public List<Marca> listarTodos(){
        return marcaService.listarTodos();
    }
}
