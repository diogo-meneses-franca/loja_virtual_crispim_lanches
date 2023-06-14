package br.com.crispimlanches.backend.dto.admin;

import br.com.crispimlanches.backend.dto.cliente.CidadeClienteDTO;
import br.com.crispimlanches.backend.dto.cliente.EstadoClienteDTO;
import br.com.crispimlanches.backend.entity.Cidade;
import lombok.Data;

import java.util.Date;

@Data
public class CidadeAdminDTO extends CidadeClienteDTO {

    private Long id;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private Boolean status;


    public CidadeAdminDTO(Cidade cidade){
        super();
        this.id = cidade.getId();
        this.dataCriacao = cidade.getDataCriacao();
        this.dataAtualizacao = cidade.getDataAtualizacao();
        this.status = cidade.getStatus();

    }
}
