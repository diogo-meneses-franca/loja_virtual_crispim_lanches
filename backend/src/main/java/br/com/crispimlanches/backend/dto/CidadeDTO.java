package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Cidade;
import lombok.Data;

@Data
public class CidadeDTO {
    private String nome;
    private EstadoDTO estado;

    public CidadeDTO(Cidade cidade){
        this.nome = cidade.getNome();
        this.estado = new EstadoDTO(cidade.getEstado());
    }
}
