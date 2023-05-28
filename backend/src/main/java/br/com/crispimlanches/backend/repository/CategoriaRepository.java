package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
