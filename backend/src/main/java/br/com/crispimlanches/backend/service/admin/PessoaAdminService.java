package br.com.crispimlanches.backend.service.admin;

import br.com.crispimlanches.backend.dto.PessoaAdminDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PessoaAdminService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa inserir(PessoaAdminDTO pessoaAdminDTO){
        Pessoa pessoa = new Pessoa(pessoaAdminDTO);
        pessoa.setDataCriacao(new Date());
        pessoa.setStatus(true);
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa editar(PessoaAdminDTO pessoaAdminDTO){
        Pessoa pessoa = new Pessoa(pessoaAdminDTO);
        pessoa.setDataAtualizacao(new Date());
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoa.setStatus(false);
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Page<PessoaAdminDTO> listarTodos(Pageable pageable){
        return pessoaRepository.findAll(pageable).map(PessoaAdminDTO::new);

    }
}
