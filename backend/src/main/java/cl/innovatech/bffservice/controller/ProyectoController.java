package cl.innovatech.bffservice.controller;

import cl.innovatech.bffservice.entity.Proyecto;
import cl.innovatech.bffservice.repository.ProyectoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@RequiredArgsConstructor
public class ProyectoController {

    private final ProyectoRepository repository;

    @GetMapping
    public List<Proyecto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Proyecto guardar(@RequestBody Proyecto proyecto) {
        return repository.save(proyecto);
    }
}