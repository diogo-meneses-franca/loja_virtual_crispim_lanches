package br.com.crispimlanches.backend.service.admin;

import br.com.crispimlanches.backend.entity.Estado;
import br.com.crispimlanches.backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoAdminService {
    @Autowired
    private EstadoRepository estadoRepository;

    public Estado inserir(Estado estado){
        estado.setStatus(true);
        estado.setDataCriacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public Estado editar(Estado estado){
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public void excluir(Long id){
        Estado estado = estadoRepository.findById(id).get();
        estado.setStatus(false);
        estadoRepository.saveAndFlush(estado);
    }

    public List<Estado> listarTodos(){
        return estadoRepository.findAll();
    }

}
