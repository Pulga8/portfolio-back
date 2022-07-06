package com.portfolioApp.SpringBoot.Controller;

import com.portfolioApp.SpringBoot.Controller.Model.Educacion;
import com.portfolioApp.SpringBoot.Service.BusinessException;
import com.portfolioApp.SpringBoot.Service.IEducacionService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class Controller {

    @Autowired
    private IEducacionService eduServ;

    @GetMapping("/educacion/traer")
    public List<Educacion> list() throws BusinessException {
        return eduServ.list();
    }

    @PostMapping("/educacion/crear")
    public String add(@RequestBody Educacion edu) throws BusinessException {
        eduServ.add(edu);
        return "se agregó dicha educacion";
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) throws BusinessException {
        eduServ.delete(id);
    }
}
