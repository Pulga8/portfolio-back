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
public class Progreso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int progreso;

    public Progreso() {
    }

    public Progreso(Long id, String titulo, int progreso) {
        this.id = id;
        this.titulo = titulo;
        this.progreso = progreso;
    }
}
