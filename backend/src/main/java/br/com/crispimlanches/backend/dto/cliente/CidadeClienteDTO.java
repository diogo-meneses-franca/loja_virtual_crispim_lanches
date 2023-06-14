package br.com.crispimlanches.backend.dto.cliente;
import br.com.crispimlanches.backend.entity.Cidade;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CidadeClienteDTO {
    private String nome;
    private EstadoClienteDTO estado;

    public CidadeClienteDTO(Cidade cidade){
        this.nome = cidade.getNome();
        this.estado = new EstadoClienteDTO(cidade.getEstado());
    }
}
