package br.com.crispimlanches.backend.entity;

import br.com.crispimlanches.backend.dto.MarcaDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "marca")
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    public Marca(MarcaDTO marcaDTO){
        this.nome = marcaDTO.getNome();
        this.dataCriacao = new Date();
    }
}
