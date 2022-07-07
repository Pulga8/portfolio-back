package com.portfolioApp.SpringBoot.Repository;

import com.portfolioApp.SpringBoot.Controller.Model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xortb
 */
@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {

}
