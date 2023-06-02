package br.com.crispimlanches.backend.dto;

import br.com.crispimlanches.backend.entity.Pessoa;

public class PessoaDTO {
    private String nome;
    private String email;
    private String endereco;

    private CidadeDTO cidade;
    private String cep;

    public PessoaDTO(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
        this.endereco = pessoa.getEndereco();
        this.cidade = new CidadeDTO(pessoa.getCidade());
        this.cep = pessoa.getCep();
    }
}
