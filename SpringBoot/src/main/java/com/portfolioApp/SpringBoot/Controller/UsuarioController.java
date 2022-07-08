package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Usuario;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IUsuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xortb
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private IUsuarioService userService;

    @GetMapping("usuario/traer")
    public List<Usuario> list() throws BusinessException {
        return userService.list();
    }
    
    /*
    @PostMapping("/usuario/crear")
    public String add(@RequestBody Usuario user) {
        userService.add(user);
        return "se agregó dicha experiencia";
    }
    */

    @GetMapping("/usuario/auth")
    public boolean autentificacion(@RequestBody Usuario user) {
        return userService.autentificacion(user);
    }

}
