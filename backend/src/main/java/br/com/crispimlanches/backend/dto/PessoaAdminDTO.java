package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Pessoa;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import java.util.Date;

@Data
public class PessoaAdminDTO {
    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String cpf;


    private Date dataCriacao;


    private Date dataAtualizacao;

    private Boolean status;


    public PessoaAdminDTO(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.cpf = pessoa.getCpf();
        this.dataCriacao = pessoa.getDataCriacao();
        this.dataAtualizacao = pessoa.getDataAtualizacao();
    }
}
