package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Proyecto;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IProyectoService;

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
public class ProyectoController {

    @Autowired
    private IProyectoService proService;

    @GetMapping("proyecto/traer")
    public List<Proyecto> list() throws BusinessException {
        return proService.list();
    }

    @PostMapping("/proyecto/crear")
    public String add(@RequestBody Proyecto proy) {
        proService.add(proy);
        return "se agregó dicho proyecto";
    }

    @DeleteMapping("proyecto/delete/{id}")
    public void delete(@PathVariable Long id) {
        proService.delete(id);
    }

    @PostMapping("/proyecto/modificar/{id}")
    public String upgrade(@PathVariable Long id, @RequestBody Proyecto proy) {
        proService.upgrade(id, proy);
        return "se actualizó dicho proyecto";
    }
}
