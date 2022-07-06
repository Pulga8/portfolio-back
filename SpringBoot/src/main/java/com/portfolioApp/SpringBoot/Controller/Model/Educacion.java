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
public class Educacion {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String descripcion;

    public Educacion() {
    }

    public Educacion(Long id, String title, String descripcion) {
        this.id = id;
        this.title = title;
        this.descripcion = descripcion;
    }
}
