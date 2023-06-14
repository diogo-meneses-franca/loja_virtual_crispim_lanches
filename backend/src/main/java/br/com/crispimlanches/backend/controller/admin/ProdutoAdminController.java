package br.com.crispimlanches.backend.controller.admin;
import br.com.crispimlanches.backend.dto.admin.ProdutoAdminDTO;
import br.com.crispimlanches.backend.entity.Produto;
import br.com.crispimlanches.backend.service.admin.ProdutoAdminService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
@CrossOrigin
public class ProdutoAdminController {

    @Autowired
    private ProdutoAdminService produtoAdminService;

    @PostMapping
    @Transactional
    public Produto inserir(@Valid @RequestBody ProdutoAdminDTO produtoAdminDTO){
        return produtoAdminService.inserir(produtoAdminDTO);
    }

    @PutMapping
    @Transactional
    public Produto editar(@RequestBody ProdutoAdminDTO produtoAdminDTO){
        return produtoAdminService.editar(produtoAdminDTO);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable("id") Long id){
        produtoAdminService.excluir(id);
    }

    @GetMapping
    public Page<ProdutoAdminDTO> listarTodos(Pageable pageable){
        return produtoAdminService.listarTodos(pageable);
    }
}
