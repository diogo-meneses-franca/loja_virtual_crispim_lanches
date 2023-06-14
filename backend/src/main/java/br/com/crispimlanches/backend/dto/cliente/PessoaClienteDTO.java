package br.com.crispimlanches.backend.dto.cliente;

import br.com.crispimlanches.backend.dto.CidadeDTO;
import br.com.crispimlanches.backend.entity.Pessoa;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PessoaClienteDTO {

    private Long id;

    @NotBlank(message = "nome.not.blank")
    private String nome;

    @NotBlank
    private String cpf;

    @Email
    @NotBlank
    private String email;


    public PessoaClienteDTO(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.cpf = pessoa.getCpf();

    }
}
