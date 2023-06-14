package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "carrinhoCompra")
public class CarrinhoCompra extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCompra;

    private String observacao;

    private String situacao;

}
