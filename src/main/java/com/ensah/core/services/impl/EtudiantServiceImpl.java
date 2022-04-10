package com.ensah.core.services.impl;


import com.ensah.core.bo.Etudiant;
import com.ensah.core.dao.IEtudiantDao;
import com.ensah.core.dao.IInscriptionDao;
import com.ensah.core.dao.IUtilisateurDao;
import com.ensah.core.services.IetudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EtudiantServiceImpl implements IetudiantService {

    @Autowired
    private IEtudiantDao etudiantservice;

    @Autowired
    private IInscriptionDao inscriptionService;

    private IUtilisateurDao personDao;

    public Etudiant getEtudiantByCNE(String cne) {
        List<Etudiant> u = etudiantservice.getEntityByColValue("Etudiant", "cne", cne);
        if (u != null && u.size() != 0) {
            return etudiantservice.getEntityByColValue("Etudiant", "CNE", cne).get(0);
        }

        return null;

    }

    @Override
    public List<Etudiant> getEtudiantsByIdInscription(String IdInscription) {

        List<Etudiant> u = etudiantservice.getEntityByColValue("Etudiant", "idInscription", IdInscription);
        if (u != null && u.size() != 0) {
            return (List<Etudiant>) etudiantservice.getEntityByColValue("Etudiant", "idInscription", IdInscription);
        }

        return null;
    }

}
