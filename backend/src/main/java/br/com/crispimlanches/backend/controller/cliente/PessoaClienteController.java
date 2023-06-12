package br.com.crispimlanches.backend.controller.cliente;

import br.com.crispimlanches.backend.dto.cliente.PessoaClienteDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.service.cliente.PessoaClienteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/cliente/pessoa")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaClienteService;

    @PostMapping
    @Transactional
    public Pessoa inserir(@RequestBody PessoaClienteDTO pessoaClienteDTO){
        return pessoaClienteService.inserir(pessoaClienteDTO);
    }
    @PostMapping
    @Transactional
    public Pessoa editar(@RequestBody PessoaClienteDTO pessoaClienteDTO){
        return pessoaClienteService.editar(pessoaClienteDTO);
    }

    @DeleteMapping(path = "/{id}")
    @Transactional
    public Pessoa excluir(@PathVariable(name = "id") Long id){
        return pessoaClienteService.excluir(id);
    }

    @GetMapping(path = "/{id")
    public PessoaClienteDTO listar(@PathVariable(name = "id") Long id){
        return pessoaClienteService.listar(id);
    }
}
