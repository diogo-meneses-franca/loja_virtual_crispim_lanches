package br.com.crispimlanches.backend.controller.cliente;

import br.com.crispimlanches.backend.dto.cliente.EstadoClienteDTO;
import br.com.crispimlanches.backend.service.cliente.EstadoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cliente/estado")
public class EstadoClienteController {
    @Autowired
    private EstadoClienteService estadoClienteService;

    @GetMapping
    public Page<EstadoClienteDTO> listarTodos(Pageable pageable){
        return estadoClienteService.listarTodos(pageable);
    }


}
