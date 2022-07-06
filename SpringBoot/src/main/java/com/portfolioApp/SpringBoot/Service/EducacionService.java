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
    public void add(Educacion edu){
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

    //Este corresponde a borrarPersona()
    /**
     *
     * @param id
     * @return Educacion or null
     * @throws BusinessException
     */
    @Override
    public Educacion search(Long id) throws BusinessException {
        try {
            return eduRepo.findById(id).orElse(null);
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }
}
