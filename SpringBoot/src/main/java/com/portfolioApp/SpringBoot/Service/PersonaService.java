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
    public void add(Persona per) {
        persRepository.save(per);
    }

    @Override
    public Persona find(Long id) throws BusinessException {
        try {
            return persRepository.findById(id).orElse(null);
        } catch (Exception e) {
            throw new BusinessException(e);
        }
    }

}
