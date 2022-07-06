package com.portfolioApp.SpringBoot.Controller.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author xortb
 */
@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String about;
    private String img_portada;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String about, String img_portada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.about = about;
        this.img_portada = img_portada;
    }
}
