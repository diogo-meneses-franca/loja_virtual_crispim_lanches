package br.com.crispimlanches.backend.service.cliente;

import br.com.crispimlanches.backend.dto.cliente.PessoaClienteDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import br.com.crispimlanches.backend.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PessoaClienteService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa inserir(PessoaClienteDTO pessoaClienteDTO){
        Pessoa pessoa = new Pessoa(pessoaClienteDTO);
        pessoa.setStatus(true);
        pessoa.setDataCriacao(new Date());
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa editar(PessoaClienteDTO pessoaClienteDTO){
        Pessoa pessoa = new Pessoa(pessoaClienteDTO);
        pessoa.setDataAtualizacao(new Date());
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public Pessoa excluir(Long id){
        Pessoa pessoa = pessoaRepository.findById(id).get();
        pessoa.setStatus(false);
        return pessoaRepository.saveAndFlush(pessoa);
    }

    public PessoaClienteDTO listar(Long id){
        PessoaClienteDTO pessoaClienteDTO = new PessoaClienteDTO(pessoaRepository.findById(id).get());
        return pessoaClienteDTO;
    }
}
