package br.com.crispimlanches.backend.entity;

import br.com.crispimlanches.backend.dto.PessoaAdminDTO;
import br.com.crispimlanches.backend.dto.cliente.PessoaClienteDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Table(name="pessoa")
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Date dataCriacao;
    private Date dataAtualizacao;
    private boolean status;
    public Pessoa(PessoaClienteDTO pessoaClienteDTO){
        this.nome = pessoaClienteDTO.getNome();
        this.cpf = pessoaClienteDTO.getCpf();
        this.email = pessoaClienteDTO.getEmail();
    }

    public Pessoa(PessoaAdminDTO pessoaAdminDTO){
        this.nome = pessoaAdminDTO.getNome();
        this.cpf = pessoaAdminDTO.getCpf();
        this.email = pessoaAdminDTO.getEmail();
    }

}
