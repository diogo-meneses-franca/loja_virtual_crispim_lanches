package br.com.crispimlanches.backend.service.cliente;

import br.com.crispimlanches.backend.dto.cliente.ProdutoClienteDTO;
import br.com.crispimlanches.backend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProdutoClienteService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Page<ProdutoClienteDTO> listarTodos(Pageable pageable){
        return produtoRepository.findAll(pageable).map(ProdutoClienteDTO::new);
    }
}
