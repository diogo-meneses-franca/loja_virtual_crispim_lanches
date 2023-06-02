package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Produto;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProdutoDTO {
    private String nome;

    private String descricao;

    private BigDecimal preco;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    public ProdutoDTO(Produto produto){
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.preco = produto.getValorVenda();
        this.marca = new MarcaDTO(produto.getMarca());
        this.categoria = new CategoriaDTO(produto.getCategoria());
    }
}
