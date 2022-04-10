package com.ensah.core.services;


import com.ensah.core.bo.Etudiant;

import java.util.List;

public interface IetudiantService {

    public List<Etudiant> getEtudiantsByIdInscription(String idInscription);

    public Etudiant getEtudiantByCNE(String cne);

}
