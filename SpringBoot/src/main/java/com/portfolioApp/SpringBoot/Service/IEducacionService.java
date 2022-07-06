package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Educacion;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IEducacionService {

    public List<Educacion> list() throws BusinessException;

    public void add(Educacion edu);

    public void delete(Long id) throws BusinessException;

    public Educacion search(Long id) throws BusinessException;
}
