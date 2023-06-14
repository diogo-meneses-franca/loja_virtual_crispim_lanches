package br.com.crispimlanches.backend.controller.cliente;

import br.com.crispimlanches.backend.dto.admin.CidadeAdminDTO;
import br.com.crispimlanches.backend.dto.cliente.CidadeClienteDTO;
import br.com.crispimlanches.backend.entity.Cidade;
import br.com.crispimlanches.backend.service.admin.CidadeAdminService;
import br.com.crispimlanches.backend.service.cliente.CidadeClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cliente/cidade")
public class CidadeClienteController {
    @Autowired
    private CidadeClienteService cidadeClienteService;

    @GetMapping
    public Page<CidadeClienteDTO> listarTodos(Pageable pageable){
        return cidadeClienteService.listarTodos(pageable);
    }

}
