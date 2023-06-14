package br.com.crispimlanches.backend.dto.admin;

import br.com.crispimlanches.backend.dto.cliente.EstadoClienteDTO;
import br.com.crispimlanches.backend.entity.Estado;
import lombok.Data;
import java.util.Date;

@Data
public class EstadoAdminDTO extends EstadoClienteDTO {

    private Date dataCriacao;
    private Date dataAtualizacao;
    private Boolean status;

    public EstadoAdminDTO(Estado estado){
        super();
        this.setDataCriacao(estado.getDataCriacao());
        this.setDataAtualizacao(estado.getDataAtualizacao());
    }
}
