package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
