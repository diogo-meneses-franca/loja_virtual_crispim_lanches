package br.com.crispimlanches.backend.dto.cliente;

import br.com.crispimlanches.backend.dto.CategoriaDTO;
import br.com.crispimlanches.backend.dto.MarcaDTO;
import br.com.crispimlanches.backend.entity.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
public class ProdutoClienteDTO {

    private String nome;

    private String descricao;

    private BigDecimal valorVenda;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    public ProdutoClienteDTO(Produto produto){
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valorVenda = produto.getValorVenda();
        this.marca = new MarcaDTO(produto.getMarca());
        this.categoria = new CategoriaDTO(produto.getCategoria());
    }
}
