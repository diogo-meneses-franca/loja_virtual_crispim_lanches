package br.com.crispimlanches.backend.service.cliente;

import br.com.crispimlanches.backend.dto.cliente.CidadeClienteDTO;
import br.com.crispimlanches.backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CidadeClienteService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public Page<CidadeClienteDTO> listarTodos(Pageable paginacao){
        return cidadeRepository.findAll(paginacao).map(CidadeClienteDTO::new);
    }
}
