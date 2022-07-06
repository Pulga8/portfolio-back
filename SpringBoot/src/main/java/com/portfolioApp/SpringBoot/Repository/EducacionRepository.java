package com.portfolioApp.SpringBoot.Repository;

import com.portfolioApp.SpringBoot.Controller.Model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author xortb
 */
@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {

}
