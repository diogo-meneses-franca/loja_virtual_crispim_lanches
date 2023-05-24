package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.Estado;
import br.com.crispimlanches.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;

    @PostMapping
    public Estado inserir(Estado estado){
        return estadoService.inserir(estado);
    }

    @DeleteMapping("/{id}")
     public void excluir(@PathVariable("id") Long id){
        estadoService.excluir(id);
     }

     public Estado alterar(Estado estado){
        return estadoService.alterar(estado);
     }
    @GetMapping
     public List<Estado> listarTodos(){
        return estadoService.listarTodos();
     }
}
