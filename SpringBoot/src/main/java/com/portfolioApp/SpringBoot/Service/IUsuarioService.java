package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Usuario;
import java.util.List;

/**
 *
 * @author xortb
 */
public interface IUsuarioService {
    
    public List<Usuario> list() throws BusinessException;
    
    public boolean autentificacion(Usuario user);
    
}
