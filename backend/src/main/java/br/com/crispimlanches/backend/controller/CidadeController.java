package br.com.crispimlanches.backend.controller;

import br.com.crispimlanches.backend.dto.CidadeDTO;
import br.com.crispimlanches.backend.entity.Cidade;
import br.com.crispimlanches.backend.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cidade")
public class CidadeController {
    @Autowired
    private CidadeService cidadeService;

    @PostMapping
    public Cidade inserir(@RequestBody Cidade cidade){
        return cidadeService.inserir(cidade);
    }

    @PutMapping
    public Cidade editar(@RequestBody Cidade cidade){
        return cidadeService.editar(cidade);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        cidadeService.excluir(id);
    }

    @GetMapping
    public Page<CidadeDTO> listarTodos(Pageable pageable){
        return cidadeService.listarTodos(pageable);
    }

}
