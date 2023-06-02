package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.dto.PessoaDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.service.PessoaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    @Transactional
    public Pessoa inserir(Pessoa pessoa){
        return pessoaService.inserir(pessoa);
    }
    @PutMapping
    @Transactional
    public Pessoa editar(Pessoa pessoa){
        return pessoaService.editar(pessoa);
    }
    @DeleteMapping(path = "/{id}")
    @Transactional
    public void excluir(@PathVariable(name = "id") Long id){
        pessoaService.excluir(id);
    }

    @GetMapping
    public Page<PessoaDTO> listarTodos(Pageable pageable){
        return pessoaService.listarTodos(pageable);

    }


}
