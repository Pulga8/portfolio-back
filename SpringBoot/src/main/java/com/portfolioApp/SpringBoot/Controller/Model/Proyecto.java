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
public class Proyecto {

    private int id;
    private String title;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(int id, String title, String descripcion) {
        this.id = id;
        this.title = title;
        this.descripcion = descripcion;
    }
}
