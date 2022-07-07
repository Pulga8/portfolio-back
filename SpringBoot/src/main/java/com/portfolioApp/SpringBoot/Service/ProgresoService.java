package com.portfolioApp.SpringBoot.Service;

import com.portfolioApp.SpringBoot.Controller.Model.Progreso;
import com.portfolioApp.SpringBoot.Repository.IProgresoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xortb
 */
@Service
public class ProgresoService implements IProgresoService {

    @Autowired
    private IProgresoRepository progresoRepository;

    @Override
    public List<Progreso> list() throws BusinessException {
        try {
            return progresoRepository.findAll();
        } catch (Exception e) {
            throw new BusinessException();
        }
    }

    @Override
    public void add(Progreso pro) {
        progresoRepository.save(pro);
    }

    @Override
    public void delete(Long id) {
        progresoRepository.deleteById(id);
    }

    @Override
    public Progreso search(Long id) throws BusinessException {
        try {
            return progresoRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new BusinessException();
        }
    }
}
