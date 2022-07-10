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
    public void add(Progreso prog) {
        progresoRepository.save(prog);
    }

    @Override
    public void delete(Long id) {
        progresoRepository.deleteById(id);
    }

    @Override
    public void upgrade(Long id, Progreso prog) {
        Progreso antiguo_pro = progresoRepository.findById(id).orElse(null);
        if (prog.getTitulo() != null) {
            antiguo_pro.setTitulo(prog.getTitulo());
        }
        if (prog.getProgreso() != 0) {
            antiguo_pro.setProgreso(prog.getProgreso());
        }
        progresoRepository.save(antiguo_pro);
    }
}
