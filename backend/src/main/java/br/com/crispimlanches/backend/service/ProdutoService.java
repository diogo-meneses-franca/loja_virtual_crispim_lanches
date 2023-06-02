package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.dto.ProdutoDTO;
import br.com.crispimlanches.backend.entity.Produto;
import br.com.crispimlanches.backend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto inserir(Produto produto){
        produto.setDatacriacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public Produto editar(Produto produto){
        produto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public void excluir(Long id){
        Produto produto = produtoRepository.findById(id).get();
        produtoRepository.delete(produto);
    }

    public Page<ProdutoDTO> listarTodos(Pageable pageable){
        return produtoRepository.findAll(pageable).map(ProdutoDTO::new);
    }
}
