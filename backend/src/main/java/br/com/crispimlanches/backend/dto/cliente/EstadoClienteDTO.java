package br.com.crispimlanches.backend.dto.cliente;

import br.com.crispimlanches.backend.entity.Estado;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EstadoClienteDTO {

    private Long id;
    private String nome;
    private String sigla;

    public EstadoClienteDTO(Estado estado){
        this.id = estado.getId();
        this.nome = estado.getNome();
        this.sigla = estado.getSigla();
    }

}
