package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Proyecto;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IProyectoService {

    public List<Proyecto> list() throws BusinessException;

    public void add(Proyecto proy);

    public void delete(Long id);

    /*Chequear que pro y pro de proyecto y progreso sean distintos*/
    public void upgrade(Long id, Proyecto proy);

}
