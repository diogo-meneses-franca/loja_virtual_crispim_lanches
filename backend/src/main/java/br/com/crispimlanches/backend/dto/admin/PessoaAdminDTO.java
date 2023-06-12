package br.com.crispimlanches.backend.dto.admin;

import br.com.crispimlanches.backend.dto.cliente.PessoaClienteDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import lombok.Data;
import java.util.Date;

@Data
public class PessoaAdminDTO extends PessoaClienteDTO {

    private Date dataCriacao;

    private Date dataAtualizacao;

    private Boolean status;


    public PessoaAdminDTO(Pessoa pessoa){
        super();
        this.dataCriacao = pessoa.getDataCriacao();
        this.dataAtualizacao = pessoa.getDataAtualizacao();
    }
}
