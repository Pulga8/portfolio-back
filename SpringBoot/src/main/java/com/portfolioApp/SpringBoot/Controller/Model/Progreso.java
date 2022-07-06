/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioApp.SpringBoot.Controller.Model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author xortb
 */
@Getter
@Setter
public class Progreso {

    private int id;
    private String title;
    private String progreso;

    public Progreso() {
    }

    public Progreso(int id, String title, String progreso) {
        this.id = id;
        this.title = title;
        this.progreso = progreso;
    }
}
