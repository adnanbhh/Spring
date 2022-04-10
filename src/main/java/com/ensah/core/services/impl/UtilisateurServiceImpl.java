package com.ensah.core.services.impl;

import com.ensah.core.bo.Utilisateur;
import com.ensah.core.dao.IUtilisateurDao;
import com.ensah.core.services.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UtilisateurServiceImpl  implements IUtilisateurService {

    @Autowired
  private  IUtilisateurDao utilisateurService;

    @Override
    public Utilisateur getUserByIdInscription(String idInscription) {
        List<Utilisateur> u = utilisateurService.getEntityByColValue("Utilisateur", "idInscription", idInscription);
        if (u != null && u.size() != 0) {
            return utilisateurService.getEntityByColValue("Utilisateur", "idInscription", idInscription).get(0);
        }

        return null;
    }


}
