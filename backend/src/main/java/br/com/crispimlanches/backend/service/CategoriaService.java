package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.Categoria;
import br.com.crispimlanches.backend.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria inserir(Categoria categoria){
        categoria.setDataCriacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    public Categoria editar(Categoria categoria){
        categoria.setDataAtualizacao(new Date());
        return categoriaRepository.saveAndFlush(categoria);
    }

    public void excluir(Long id){
        Categoria categoria = categoriaRepository.findById(id).get();
        categoriaRepository.delete(categoria);
    }

    public List<Categoria> listarTodos(){
        return categoriaRepository.findAll();
    }

}
