package com.ensah.core.services;


import com.ensah.core.bo.Enseignant;
import com.ensah.core.bo.Etudiant;
import com.ensah.core.bo.PieceJustificative;

import java.util.List;

public interface IEnseignantService {
    public Etudiant getEtudiantByCne(String cne);

    public List<Etudiant> getAllEtudiants();

    public void addAbsence(Etudiant etudiant);

    public void updateAbsence(Etudiant etudiant);

    public List<PieceJustificative> getAllDemandes();

	public Enseignant getEnseignantById(Long i);
}
