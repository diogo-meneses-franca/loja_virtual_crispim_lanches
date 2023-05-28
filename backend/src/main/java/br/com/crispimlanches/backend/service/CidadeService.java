package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.Cidade;
import br.com.crispimlanches.backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade inserir(Cidade cidade){
        cidade.setDataCriacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public Cidade editar(Cidade cidade){
        cidade.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(cidade);
    }

    public void excluir(Long id){
        Cidade cidade = cidadeRepository.findById(id).get();
        cidadeRepository.delete(cidade);
    }

    public List<Cidade> listarTodos(){
        return cidadeRepository.findAll();
    }
}
