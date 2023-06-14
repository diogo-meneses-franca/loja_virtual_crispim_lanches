package br.com.crispimlanches.backend.controller.admin;

import br.com.crispimlanches.backend.entity.Estado;
import br.com.crispimlanches.backend.service.admin.EstadoAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoAdminController {
    @Autowired
    private EstadoAdminService estadoAdminService;

    @PostMapping
    public Estado inserir(@RequestBody Estado estado){
        return estadoAdminService.inserir(estado);
    }

    @PutMapping
    public Estado editar(@RequestBody Estado estado){
        return estadoAdminService.editar(estado);
    }

    @DeleteMapping("/{id}")
     public void excluir(@PathVariable("id") Long id){
        estadoAdminService.excluir(id);
     }

    @GetMapping
     public List<Estado> listarTodos(){
        return estadoAdminService.listarTodos();
     }
}
