package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "carrinhoCompraProduto")
public class CarrinhoCompraProduto extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigInteger valor;
    private Double quantidade;
    private String observacao;

}
