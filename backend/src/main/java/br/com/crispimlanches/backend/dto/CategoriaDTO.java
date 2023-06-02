package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Categoria;
import lombok.Data;

@Data
public class CategoriaDTO {

    private String nome;

    public CategoriaDTO(Categoria categoria){
        this.nome = categoria.getNome();
    }
}
