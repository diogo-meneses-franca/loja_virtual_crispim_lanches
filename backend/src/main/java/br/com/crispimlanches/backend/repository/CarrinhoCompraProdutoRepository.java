package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.CarrinhoCompraProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoCompraProdutoRepository extends JpaRepository<CarrinhoCompraProduto, Long> {
}
