package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Marca;
import lombok.Data;

@Data
public class MarcaDTO {

    private String nome;

    public MarcaDTO(Marca marca){
        this.nome = marca.getNome();
    }
}
