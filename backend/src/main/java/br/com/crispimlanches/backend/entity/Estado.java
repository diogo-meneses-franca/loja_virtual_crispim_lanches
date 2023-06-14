package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estado")
@Data
public class Estado extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sigla;
    private Boolean status;

}