package br.com.crispimlanches.backend.dto.admin;
import br.com.crispimlanches.backend.dto.cliente.ProdutoClienteDTO;
import br.com.crispimlanches.backend.entity.Produto;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProdutoAdminDTO extends ProdutoClienteDTO {

    @NotBlank
    private Long id;

    @NotBlank
    private BigDecimal valorCusto;

    private Date dataCriacao;

    private Date dataAtualizacao;



    public ProdutoAdminDTO(Produto produto){
        super();
        this.id = produto.getId();
        this.valorCusto = produto.getValorCusto();
        this.dataCriacao = produto.getDatacriacao();
        this.dataAtualizacao = produto.getDataAtualizacao();
    }

}
