package br.com.crispimlanches.backend.dto.admin;

import br.com.crispimlanches.backend.dto.CategoriaDTO;
import br.com.crispimlanches.backend.dto.MarcaDTO;
import br.com.crispimlanches.backend.entity.Produto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProdutoAdminDTO {


    @NotBlank
    private String nome;

    private String descricao;

    @NotBlank
    private BigDecimal valorCusto;

    @NotBlank
    private BigDecimal valorVenda;

    private MarcaDTO marca;

    private CategoriaDTO categoria;

    public ProdutoAdminDTO(Produto produto){
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.valorCusto = produto.getValorCusto();
        this.valorVenda = produto.getValorVenda();
        this.marca = new MarcaDTO(produto.getMarca());
        this.categoria = new CategoriaDTO(produto.getCategoria());
    }

}
