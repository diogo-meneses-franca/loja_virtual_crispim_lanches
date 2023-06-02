package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.Imagem;
import br.com.crispimlanches.backend.service.ImagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(path = "/imagem")
@CrossOrigin
public class ImagemController {
    @Autowired
    private ImagemService imagemService;

    @PostMapping
    public Imagem inserir(Imagem imagem){
        return imagemService.inserir(imagem);
    }

    @PutMapping
    public Imagem editar(Imagem imagem){
        return imagemService.editar(imagem);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable(name = "id") Long id){
        imagemService.excluir(id);
    }

    @GetMapping
    public List<Imagem> listarTodos(){
        return imagemService.listarTodos();
    }
}
