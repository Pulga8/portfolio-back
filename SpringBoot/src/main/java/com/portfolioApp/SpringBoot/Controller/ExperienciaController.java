package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Experiencia;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IExperienciaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author xortb
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {

    @Autowired
    private IExperienciaService expeService;

    @GetMapping("experiencia/traer")
    public List<Experiencia> list() throws BusinessException {
        return expeService.list();
    }

    @PostMapping("/experiencia/crear")
    public String add(@RequestBody Experiencia expe) {
        expeService.add(expe);
        return "se agregó dicha experiencia";
    }

    @DeleteMapping("experiencia/delete/{id}")
    public void delete(@PathVariable Long id){
        expeService.delete(id);
    }
}
