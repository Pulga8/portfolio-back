package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Persona;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IPersonaService;
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
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/persona/traer")
    public List<Persona> list() throws BusinessException {
        return personaService.list();
    }

    @GetMapping("/persona/traer/{id}")
    public Persona find(Long id) throws BusinessException {
        return personaService.find(id);
    }

    @PostMapping("/persona/crear")
    public String add(@RequestBody Persona per) {
        personaService.add(per);
        return "se agregó la persona";
    }

    @GetMapping("/persona/delete/{id}")
    public void delete(@RequestBody Long id) throws BusinessException {
        personaService.find(id);
    }
}
