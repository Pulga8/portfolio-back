package com.portfolioApp.SpringBoot.Repository;

import com.portfolioApp.SpringBoot.Controller.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xortb
 */
@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
