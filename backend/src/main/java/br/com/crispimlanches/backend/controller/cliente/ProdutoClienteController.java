package br.com.crispimlanches.backend.controller.cliente;

import br.com.crispimlanches.backend.dto.cliente.ProdutoClienteDTO;
import br.com.crispimlanches.backend.service.cliente.ProdutoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "cliente/produto")
public class ProdutoClienteController {

    @Autowired
    private ProdutoClienteService produtoClienteService;

    public Page<ProdutoClienteDTO> listarTodos(Pageable pageable){
        return produtoClienteService.listarTodos(pageable);
    }
}
