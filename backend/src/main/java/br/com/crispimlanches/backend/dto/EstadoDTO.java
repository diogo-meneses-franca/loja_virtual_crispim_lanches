package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Estado;
import lombok.Data;

@Data
public class EstadoDTO {
    private String nome;
    private String sigla;

    public EstadoDTO(Estado estado){
        this.nome = estado.getNome();
        this.sigla = estado.getSigla();
    }
}
