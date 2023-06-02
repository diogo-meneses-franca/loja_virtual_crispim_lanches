package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.Permissao;
import br.com.crispimlanches.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/permissao")
@CrossOrigin
public class PermissaoController {
    @Autowired
    PermissaoService permissaoService;

    @PostMapping
    public Permissao inserir(Permissao permissao){
        return permissaoService.inserir(permissao);
    }

    @PutMapping
    public Permissao editar(Permissao permissao){
        return permissaoService.editar(permissao);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable(name = "id") Long id){
        permissaoService.excluir(id);
    }

    @GetMapping
    public List<Permissao> listarTodos(){
        return permissaoService.listarTodos();
    }

}
