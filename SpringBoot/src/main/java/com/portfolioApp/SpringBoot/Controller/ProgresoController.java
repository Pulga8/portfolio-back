package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Progreso;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IProgresoService;

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
public class ProgresoController {

    @Autowired
    private IProgresoService progresoService;

    @GetMapping("progreso/traer")
    public List<Progreso> list() throws BusinessException {
        return progresoService.list();
    }

    @PostMapping("/progreso/crear")
    public String add(@RequestBody Progreso pro) {
        progresoService.add(pro);
        return "se agregó dicha experiencia";
    }

    @DeleteMapping("progreso/delete/{id}")
    public void delete(@PathVariable Long id) {
        progresoService.delete(id);
    }
}
