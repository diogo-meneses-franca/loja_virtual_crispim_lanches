package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.Imagem;
import br.com.crispimlanches.backend.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository imagemRepository;

    public Imagem inserir(Imagem imagem){
        return imagemRepository.saveAndFlush(imagem);
    }

    public Imagem editar(Imagem imagem){
        return imagemRepository.saveAndFlush(imagem);
    }

    public void excluir(Long id){
        Imagem imagem = imagemRepository.findById(id).get();
        imagemRepository.delete(imagem);
    }

    public List<Imagem> listarTodos(){
        return imagemRepository.findAll();
    }

}
