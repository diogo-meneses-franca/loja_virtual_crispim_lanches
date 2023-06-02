package br.com.crispimlanches.backend.repository;

import br.com.crispimlanches.backend.entity.CarrinhoCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoCompraRepository extends JpaRepository<CarrinhoCompra, Long> {
}
