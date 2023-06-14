package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "cidade")
@Data
public class Cidade extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name ="idEstado")
    private Estado estado;

    private Boolean status;

}
