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
    public void add(Proyecto pro) {
        proRepository.save(pro);
    }

    @Override
    public void delete(Long id) {
        proRepository.deleteById(id);
    }

    @Override
    public Proyecto search(Long id) throws BusinessException {
        try {
            return proRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

}
