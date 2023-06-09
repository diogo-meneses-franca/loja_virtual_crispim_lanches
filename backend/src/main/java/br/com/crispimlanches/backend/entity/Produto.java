package br.com.crispimlanches.backend.entity;
import br.com.crispimlanches.backend.dto.admin.ProdutoAdminDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "produto")
@NoArgsConstructor
public class Produto extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal valorCusto;

    private BigDecimal valorVenda;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    private Categoria categoria;

    private boolean status;

    public Produto(ProdutoAdminDTO produtoAdminDTO){
        super();
        this.nome = produtoAdminDTO.getNome();
        this.descricao = produtoAdminDTO.getDescricao();
        this.valorCusto = produtoAdminDTO.getValorCusto();
        this.valorVenda = produtoAdminDTO.getValorVenda();
        this.marca = new Marca(produtoAdminDTO.getMarca());
        this.categoria = new Categoria(produtoAdminDTO.getCategoria());
    }
}
