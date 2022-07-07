package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Progreso;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IProgresoService {

    public List<Progreso> list() throws BusinessException;

    public void add(Progreso expe);

    public void delete(Long id);

    public Progreso search(Long id) throws BusinessException;

}
