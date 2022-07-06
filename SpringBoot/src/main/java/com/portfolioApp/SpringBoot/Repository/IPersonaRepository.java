/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioApp.SpringBoot.Repository;

import com.portfolioApp.SpringBoot.Controller.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xortb
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
