package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
