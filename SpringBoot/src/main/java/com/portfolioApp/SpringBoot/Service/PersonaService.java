package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Persona;
import com.portfolioApp.SpringBoot.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xortb
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository persRepository;

    @Override
    public List<Persona> list() throws BusinessException {
        try {
            return persRepository.findAll();
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

    @Override
    public Persona find(Long id) {
        return persRepository.findById(id).orElse(null);
    }

    @Override
    public void upgrade(Long id, Persona p) {
        Persona antigua_p = persRepository.findById(id).orElse(null);
        if (p.getNombre() != null) {
            antigua_p.setNombre(p.getNombre());
        }
        if (p.getApellido() != null) {
            antigua_p.setApellido(p.getApellido());
        }
        if (p.getProfesion() != null) {
            antigua_p.setProfesion(p.getProfesion());
        }
        if (p.getAbout() != null) {
            antigua_p.setAbout(p.getAbout());
        }
        if (p.getImg_perfil() != null) {
            antigua_p.setImg_perfil(p.getImg_perfil());
        }
        if (p.getImg_portada() != null) {
            antigua_p.setImg_portada(p.getImg_portada());
        }
        persRepository.save(antigua_p);
    }

}
