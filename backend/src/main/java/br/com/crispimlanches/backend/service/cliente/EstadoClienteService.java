package br.com.crispimlanches.backend.service.cliente;

import br.com.crispimlanches.backend.dto.cliente.EstadoClienteDTO;
import br.com.crispimlanches.backend.entity.Estado;
import br.com.crispimlanches.backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoClienteService {
    @Autowired
    private EstadoRepository estadoRepository;


    public Page<EstadoClienteDTO> listarTodos(Pageable pageable){
        return estadoRepository.findAll(pageable).map(EstadoClienteDTO::new);
    }

}
