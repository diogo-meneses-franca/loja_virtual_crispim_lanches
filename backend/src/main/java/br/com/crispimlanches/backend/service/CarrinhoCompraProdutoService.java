package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.CarrinhoCompraProduto;
import br.com.crispimlanches.backend.repository.CarrinhoCompraProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoCompraProdutoService {
    @Autowired
    private CarrinhoCompraProdutoRepository carrinhoCompraProdutoRepository;

    public CarrinhoCompraProduto inserir(CarrinhoCompraProduto carrinhoCompraProduto){
        return carrinhoCompraProdutoRepository.saveAndFlush(carrinhoCompraProduto);
    }

    public CarrinhoCompraProduto editar(CarrinhoCompraProduto carrinhoCompraProduto){
        return carrinhoCompraProdutoRepository.saveAndFlush(carrinhoCompraProduto);
    }

    public void excluir(Long id){
        CarrinhoCompraProduto carrinhoCompraProduto = carrinhoCompraProdutoRepository.findById(id).get();
        carrinhoCompraProdutoRepository.delete(carrinhoCompraProduto);
    }

    public List<CarrinhoCompraProduto> listarTodos(){
        return carrinhoCompraProdutoRepository.findAll();
    }
}
