package com.ensah.core.services.impl;

import com.ensah.core.bo.Matiere;
import com.ensah.core.dao.IMatiereDao;
import com.ensah.core.services.IMatierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MatierServiceImpl  implements IMatierService {

    @Autowired
    private IMatiereDao matiereDao;

    @Override
    public List<Matiere> getMatierByIdModul(String idModule) {

            List<Matiere> u = matiereDao.getEntityByColValue("Matiere", "idModule", idModule);
            if (u != null && u.size() != 0) {
                return matiereDao.getEntityByColValue("Utilisateur", "idModule", idModule);
            }

            return null;

        }

    @Override
    public List<Matiere> getAllMatiers() {
        return matiereDao.getAll();
    }
    
    public Matiere getMatiereById(Long id)
    {
    	return matiereDao.findById(id);
    }

}

