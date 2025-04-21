package pe.edu.upeu.msecomerse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "accesos")
public class Acceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acceso")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url")
    private String url;

    @Column(name = "metodo")
    private String metodo;

    @OneToMany(mappedBy = "acceso", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AccesoRol> accesoRoles;


}