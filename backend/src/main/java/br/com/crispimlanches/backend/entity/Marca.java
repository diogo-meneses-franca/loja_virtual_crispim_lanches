package br.com.crispimlanches.backend.entity;

import br.com.crispimlanches.backend.dto.MarcaDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marca")
@Data
@NoArgsConstructor
public class Marca extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Marca(MarcaDTO marcaDTO){
        this.nome = marcaDTO.getNome();
    }

}
