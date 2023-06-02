package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao, Long > {
}
