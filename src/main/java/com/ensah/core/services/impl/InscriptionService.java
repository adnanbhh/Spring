package com.ensah.core.services.impl;

import com.ensah.core.bo.Inscription;
import com.ensah.core.dao.IInscriptionDao;
import com.ensah.core.services.IinscreptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class InscriptionService implements IinscreptionsService {


    @Autowired
    private IInscriptionDao inscriptionDao;




    
    public List<Inscription> getAllInscriptions() {
       
      return inscriptionDao.getAll();
    }

    @Override
    public List<Inscription> getInscriptionByIdNiveau(String idNiveau) {

            List<Inscription> u = inscriptionDao.getEntityByColValue("Inscription", "idNiveau", idNiveau);
            if (u != null && u.size() != 0) {
                return (List<Inscription>) inscriptionDao.getEntityByColValue("Inscription", "idNiveau", idNiveau);
            }

        return null;
    }

    @Override
    public Inscription getEtudiantByIdinscription(String idEtudiant) {
        List<Inscription> u = (List<Inscription>) inscriptionDao.getEntityByColValue("Inscription", "idEtudiant", idEtudiant);
        if (u != null && u.size() != 0) {
            return inscriptionDao.getEntityByColValue("Inscription", "idEtudiant", idEtudiant).get(0);
        }

        return null;
    }
    
    public Inscription getInscriptionById(Long id) {
		return inscriptionDao.findById(id);
    	    	
    }
}
