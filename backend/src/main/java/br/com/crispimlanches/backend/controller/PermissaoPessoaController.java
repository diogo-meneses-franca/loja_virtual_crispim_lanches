package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.entity.PermissaoPessoa;
import br.com.crispimlanches.backend.service.PermissaoPessoaService;
import br.com.crispimlanches.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/permissaoPessoa")
public class PermissaoPessoaController {
    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @PostMapping
    public PermissaoPessoa inserir(PermissaoPessoa permissaoPessoa){
        return permissaoPessoaService.inserir(permissaoPessoa);
    }

    @PutMapping
    public PermissaoPessoa editar(PermissaoPessoa permissaoPessoa){
        return permissaoPessoaService.inserir(permissaoPessoa);
    }

    @DeleteMapping(path = "/{id}")
    public void excluir(@PathVariable(name = "id") Long id){
        permissaoPessoaService.excluir(id);
    }

    @GetMapping
    public List<PermissaoPessoa> listarTodos(){
        return permissaoPessoaService.listarTodos();
    }
}
