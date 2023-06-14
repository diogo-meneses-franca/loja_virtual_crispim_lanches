package br.com.crispimlanches.backend.entity;

import br.com.crispimlanches.backend.dto.CategoriaDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categoria")
@Data
@NoArgsConstructor
public class Categoria extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Categoria(CategoriaDTO categoriaDTO){
        this.nome = categoriaDTO.getNome();
    }
}
