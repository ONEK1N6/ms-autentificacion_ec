package pe.edu.upeu.msecomerse.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "acceso_rol")
public class AccesoRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acceso_rol")
    private Long id;

    @Column(name = "recurso")
    private String recurso;

    @Column(name = "permiso")
    private String permiso;

    @ManyToOne
    @JoinColumn(name = "acceso_id") // Renombrado para que tenga sentido en la base de datos
    private Acceso acceso;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

}