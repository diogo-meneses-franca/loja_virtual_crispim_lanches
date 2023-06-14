package br.com.crispimlanches.backend.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import java.util.Date;

@Data
@MappedSuperclass
public class Auditable {

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;


}
