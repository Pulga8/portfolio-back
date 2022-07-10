package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Educacion;
import com.portfolioApp.SpringBoot.Repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xortb
 */
@Service
public class EducacionService implements IEducacionService {

    @Autowired
    private IEducacionRepository eduRepo;

    // Este corresponde a verPersonas()
    @Override
    public List<Educacion> list() throws BusinessException {
        try {
            return eduRepo.findAll();
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }

    @Override
    public void add(Educacion edu) {
        eduRepo.save(edu);
    }

    //Este corresponde a borrarPersona()
    @Override
    public void delete(Long id) throws BusinessException {
        try {
            eduRepo.deleteById(id);
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }

    @Override
    public void upgrade(Long id, Educacion edu) {
        Educacion antigua_edu = eduRepo.findById(id).orElse(null);
        if (edu.getTitulo() != null) {
            antigua_edu.setTitulo(edu.getTitulo());
        }
        if (edu.getDescripcion() != null) {
            antigua_edu.setDescripcion(edu.getDescripcion());
        }
        eduRepo.save(antigua_edu);
    }
}
