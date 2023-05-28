package br.com.crispimlanches.backend.service;

import br.com.crispimlanches.backend.entity.Marca;
import br.com.crispimlanches.backend.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;

    public Marca inserir(Marca marca){
        marca.setDataCriacao(new Date());
        return marcaRepository.saveAndFlush(marca);
    }

    public Marca editar(Marca marca){
        marca.setDataAtualizacao(new Date());
        return marcaRepository.saveAndFlush(marca);
    }

    public void excluir(Long id) {
        Marca marca = marcaRepository.findById(id).get();
        marcaRepository.delete(marca);
    }

    public List<Marca> listarTodos(){
        return marcaRepository.findAll();
    }


}
