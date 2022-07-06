package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Experiencia;
import com.portfolioApp.SpringBoot.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xortb
 */
@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    private IExperienciaRepository expeRepository;

    @Override
    public List<Experiencia> list() throws BusinessException {
        try {
            return expeRepository.findAll();
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

    @Override
    public void add(Experiencia expe) {
        expeRepository.save(expe);
    }

    @Override
    public void delete(Long id)  {
        expeRepository.deleteById(id);
    }

    @Override
    public Experiencia search(Long id) throws BusinessException {
        try {
            return expeRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

}
