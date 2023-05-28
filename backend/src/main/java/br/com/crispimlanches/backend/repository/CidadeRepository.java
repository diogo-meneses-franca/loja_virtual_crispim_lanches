package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
