package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
