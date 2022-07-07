package com.portfolioApp.SpringBoot.Repository;

import com.portfolioApp.SpringBoot.Controller.Model.Progreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xortb
 */
@Repository
public interface IProgresoRepository extends JpaRepository<Progreso, Long>{
    
}
