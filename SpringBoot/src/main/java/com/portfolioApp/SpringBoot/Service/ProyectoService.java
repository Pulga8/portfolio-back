package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Proyecto;
import com.portfolioApp.SpringBoot.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xortb
 */
@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    private IProyectoRepository proRepository;

    @Override
    public List<Proyecto> list() throws BusinessException {
        try {
            return proRepository.findAll();
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

    @Override
    public void add(Proyecto proy) {
        proRepository.save(proy);
    }

    @Override
    public void delete(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public void upgrade(Long id, Proyecto proy) {
        Proyecto antiguo_pro = proRepository.findById(id).orElse(null);
        if (proy.getTitulo() != null) {
            antiguo_pro.setTitulo(proy.getTitulo());
        }
        if (proy.getDescripcion() != null) {
            antiguo_pro.setDescripcion(proy.getDescripcion());
        }
        proRepository.save(antiguo_pro);
    }

}
