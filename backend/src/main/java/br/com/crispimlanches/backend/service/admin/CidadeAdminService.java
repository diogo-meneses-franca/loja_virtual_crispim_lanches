package br.com.crispimlanches.backend.service.admin;

import br.com.crispimlanches.backend.dto.admin.CidadeAdminDTO;
import br.com.crispimlanches.backend.dto.cliente.CidadeClienteDTO;
import br.com.crispimlanches.backend.entity.Cidade;
import br.com.crispimlanches.backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CidadeAdminService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade inserir(Cidade cidade){
        cidade.setStatus(true);
        return cidadeRepository.saveAndFlush(cidade);
    }

    public Cidade editar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidade.setStatus(false);
        cidadeRepository.saveAndFlush(cidade);
    }

    public Page<CidadeAdminDTO> listarTodos(Pageable paginacao){
        return cidadeRepository.findAll(paginacao).map(CidadeAdminDTO::new);
    }
}
