package com.ensah.core.services.impl;

import com.ensah.core.bo.Enseignant;
import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.PieceJustificative;
import com.ensah.core.dao.IEnseignantDao;
import com.ensah.core.services.IEnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EnseignantService implements IEnseignantService {

    @Autowired
    private IEnseignantDao enseignantDao;



    @Override
    public Etudiant getEtudiantByCne(String cne) {
        return null;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return null;
    }

    @Override
    public void addAbsence(Etudiant etudiant) {

    }

    @Override
    public void updateAbsence(Etudiant etudiant) {

    }

    @Override
    public List<PieceJustificative> getAllDemandes() {
        return null;
    }
    
	public Enseignant getEnseignantById(Long i)
	{
		return enseignantDao.findById(i);
	}
}
