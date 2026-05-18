package cl.innovatech.bffservice.repository;

import cl.innovatech.bffservice.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}