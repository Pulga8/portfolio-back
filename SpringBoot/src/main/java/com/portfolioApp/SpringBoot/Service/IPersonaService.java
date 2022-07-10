package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Persona;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IPersonaService {

    public Persona find(Long id) throws BusinessException;

    public List<Persona> list() throws BusinessException;
    
    public void upgrade(Long id, Persona p);

}
