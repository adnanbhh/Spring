package com.ensah.core.services;

import com.ensah.core.bo.Absence;

import java.util.List;

import javax.validation.Valid;

public interface IAbsenceService {

    public void createAbsence(Absence absence);
    public List<Absence> getEtudiantAbsenceByIdInscription(String idInscription);
	public void addAbsence(@Valid Absence absence, Long idMatiere, Long idInscription, Long idTypeSeance, Long i);
	public List<Absence> getAllAbsence();
}
