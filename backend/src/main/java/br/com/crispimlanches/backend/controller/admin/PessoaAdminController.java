package br.com.crispimlanches.backend.controller.admin;

import br.com.crispimlanches.backend.dto.PessoaAdminDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.service.admin.PessoaAdminService;
import br.com.crispimlanches.backend.service.cliente.PessoaClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaAdminController {
    @Autowired
    private PessoaAdminService pessoaAdminService;

    @PostMapping
    @Transactional
    public Pessoa inserir(@Valid @RequestBody PessoaAdminDTO pessoaAdminDTO){
        return pessoaAdminService.inserir(pessoaAdminDTO);
    }
    @PutMapping
    @Transactional
    public Pessoa editar(@RequestBody PessoaAdminDTO pessoaAdminDTO){
        return pessoaAdminService.editar(pessoaAdminDTO);
    }
    @DeleteMapping(path = "/{id}")
    @Transactional
    public void excluir(@PathVariable(name = "id") Long id){
        pessoaAdminService.excluir(id);
    }

    @GetMapping
    public Page<PessoaAdminDTO> listarTodos(Pageable pageable){
        return pessoaAdminService.listarTodos(pageable);

    }


}
