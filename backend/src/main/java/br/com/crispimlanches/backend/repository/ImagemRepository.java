package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Imagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagemRepository extends JpaRepository<Imagem, Long> {
}
