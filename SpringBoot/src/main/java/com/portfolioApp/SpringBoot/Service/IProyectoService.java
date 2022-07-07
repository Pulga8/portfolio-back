package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Proyecto;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IProyectoService {

    public List<Proyecto> list() throws BusinessException;

    public void add(Proyecto pro);

    public void delete(Long id);

    public Proyecto search(Long id) throws BusinessException;

}
