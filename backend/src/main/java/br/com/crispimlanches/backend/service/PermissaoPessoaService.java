package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.PermissaoPessoa;
import br.com.crispimlanches.backend.repository.PermissaoPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissaoPessoaService {

    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    public PermissaoPessoa inserir(PermissaoPessoa permissaoPessoa){
        return permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
    }

    public PermissaoPessoa editar(PermissaoPessoa permissaoPessoa){
        return permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
    }

    public void excluir(Long id){
        PermissaoPessoa permissaoPessoa = permissaoPessoaRepository.findById(id).get();
        permissaoPessoaRepository.delete(permissaoPessoa);
    }

    public List<PermissaoPessoa> listarTodos(){
        return permissaoPessoaRepository.findAll();
    }

}
