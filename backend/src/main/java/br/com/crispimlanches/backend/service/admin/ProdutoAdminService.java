package br.com.crispimlanches.backend.service.admin;

import br.com.crispimlanches.backend.dto.admin.ProdutoAdminDTO;
import br.com.crispimlanches.backend.entity.Produto;
import br.com.crispimlanches.backend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class ProdutoAdminService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto inserir(ProdutoAdminDTO produtoAdminDTO){
        Produto produto = new Produto(produtoAdminDTO);
        produto.setDataCriacao(new Date());
        produto.setStatus(true);
        return produtoRepository.saveAndFlush(produto);
    }

    public Produto editar(ProdutoAdminDTO produtoAdminDTO){
        Produto produto = new Produto(produtoAdminDTO);
        produto.setDataAtualizacao(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public void excluir(Long id){
        Produto produto = produtoRepository.findById(id).get();
        produto.setStatus(false);
        produtoRepository.saveAndFlush(produto);
    }

    public Page<ProdutoAdminDTO> listarTodos(Pageable pageable){
        return produtoRepository.findAll(pageable).map(ProdutoAdminDTO::new);
    }
}
