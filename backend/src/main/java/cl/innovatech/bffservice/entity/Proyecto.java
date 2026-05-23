package cl.innovatech.bffservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proyectos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String estado;

    private Integer totalHoras;
}