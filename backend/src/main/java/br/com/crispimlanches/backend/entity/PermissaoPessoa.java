package br.com.crispimlanches.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "permissao_pessoa")
@Data
public class PermissaoPessoa extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
