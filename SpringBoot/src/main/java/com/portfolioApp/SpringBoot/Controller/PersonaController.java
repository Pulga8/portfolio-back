package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Persona;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IPersonaService;
import java.time.Instant;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    public Persona find(@PathVariable Long id) {
        return personaService.find(id);
    }

    @GetMapping("/persona/delete/{id}")
    public void delete(@RequestBody Long id) throws BusinessException {
        personaService.find(id);
    }

    @PostMapping("/persona/modificar/{id}")
    public String upgrade(@PathVariable Long id, @RequestBody Persona p) {
        personaService.upgrade(id, p);
        return "se actualizó la persona";
    }
    
    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {
        return Instant.now().toString();
    }
}
