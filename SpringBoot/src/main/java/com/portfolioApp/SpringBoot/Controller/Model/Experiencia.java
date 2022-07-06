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
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
}
