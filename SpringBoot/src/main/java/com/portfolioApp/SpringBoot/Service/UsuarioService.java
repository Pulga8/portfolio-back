package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolioApp.SpringBoot.Repository.IUsuarioRepository;

/**
 *
 * @author xortb
 */
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository userRepo;

    @Override
    public List<Usuario> list() throws BusinessException {
        try {
            return userRepo.findAll();
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }

    @Override
    public boolean autentificacion(Usuario user) {
        List<Usuario> lista = userRepo.findAll();
        Usuario elemento = lista.get(0);
        boolean esIgual = elemento.getUsername().equals(user.getUsername())
                && elemento.getPassword().equals(user.getPassword());
        return esIgual;
    }

}
