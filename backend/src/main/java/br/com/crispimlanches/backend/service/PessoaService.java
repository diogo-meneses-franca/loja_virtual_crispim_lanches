package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.dto.PessoaDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa inserir(Pessoa pessoa){
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa editar(Pessoa pessoa){
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoaRepository.delete(pessoa);
    }

    public Page<PessoaDTO> listarTodos(Pageable pageable){
        return pessoaRepository.findAll(pageable).map(PessoaDTO::new);
    }
}
