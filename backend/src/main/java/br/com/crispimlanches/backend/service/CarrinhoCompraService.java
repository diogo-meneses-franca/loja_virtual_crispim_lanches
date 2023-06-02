package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.CarrinhoCompra;
import br.com.crispimlanches.backend.repository.CarrinhoCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoCompraService {
    @Autowired
    private CarrinhoCompraRepository carrinhoCompraRepository;

    public CarrinhoCompra inserir(CarrinhoCompra carrinhoCompra){
        return carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
    }

    public CarrinhoCompra editar(CarrinhoCompra carrinhoCompra){
        return  carrinhoCompraRepository.saveAndFlush(carrinhoCompra);
    }

    public void excluir(Long id){
        CarrinhoCompra carrinhoCompra = carrinhoCompraRepository.findById(id).get();
        carrinhoCompraRepository.delete(carrinhoCompra);
    }

    public List<CarrinhoCompra> listarTodos(){
        return carrinhoCompraRepository.findAll();
    }
}
