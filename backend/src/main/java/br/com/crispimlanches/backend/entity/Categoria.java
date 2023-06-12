package br.com.crispimlanches.backend.entity;

import br.com.crispimlanches.backend.dto.CategoriaDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "categoria")
@Data
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

    public Categoria(CategoriaDTO categoriaDTO){
        this.nome = categoriaDTO.getNome();
    }
}
