package br.com.crispimlanches.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "endereco")
@Data
public class Endereco {
    @Id
    private Long id;

    private boolean principal;
    private String logradouro;

    private String numero;
    private String complemento;
    private String bairro;
    @ManyToOne
    private Cidade cidade;
    private String cep;
    @ManyToOne
    private Pessoa pessoa;

}
