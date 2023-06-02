package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
