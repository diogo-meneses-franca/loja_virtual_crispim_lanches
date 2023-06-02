package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.Permissao;
import br.com.crispimlanches.backend.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissaoService {
    @Autowired
    private PermissaoRepository permissaoRepository;

    public Permissao inserir(Permissao permissao){
        return permissaoRepository.saveAndFlush(permissao);
    }

    public Permissao editar(Permissao permissao){
        return permissaoRepository.saveAndFlush(permissao);
    }

    public void excluir(Long id){
        Permissao permissao = permissaoRepository.findById(id).get();
        permissaoRepository.delete(permissao);
    }

    public List<Permissao> listarTodos(){
        return permissaoRepository.findAll();
    }
}
