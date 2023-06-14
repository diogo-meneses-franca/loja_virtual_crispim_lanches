package br.com.crispimlanches.backend.controller.admin;

import br.com.crispimlanches.backend.dto.admin.CidadeAdminDTO;
import br.com.crispimlanches.backend.entity.Cidade;
import br.com.crispimlanches.backend.service.admin.CidadeAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cidade")
public class CidadeAdminController {
    @Autowired
    private CidadeAdminService cidadeAdminService;

    @PostMapping
    public Cidade inserir(@RequestBody Cidade cidade){
        return cidadeAdminService.inserir(cidade);
    }

    @PutMapping
    public Cidade editar(@RequestBody Cidade cidade){
        return cidadeAdminService.editar(cidade);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        cidadeAdminService.excluir(id);
    }

    @GetMapping
    public Page<CidadeAdminDTO> listarTodos(Pageable pageable){
        return cidadeAdminService.listarTodos(pageable);
    }

}
