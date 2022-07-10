package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Experiencia;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IExperienciaService {

    public List<Experiencia> list() throws BusinessException;

    public void add(Experiencia expe);

    public void delete(Long id);

    public void upgrade(Long id, Experiencia expe);

}
