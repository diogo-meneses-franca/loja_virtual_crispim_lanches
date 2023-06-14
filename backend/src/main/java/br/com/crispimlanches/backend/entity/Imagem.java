package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table
public class Imagem extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String url;

}
