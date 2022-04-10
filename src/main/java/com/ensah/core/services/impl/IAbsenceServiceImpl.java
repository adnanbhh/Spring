package com.ensah.core.services.impl;

import com.ensah.core.bo.Absence;
import com.ensah.core.bo.Enseignant;
import com.ensah.core.bo.Inscription;
import com.ensah.core.bo.Matiere;
import com.ensah.core.bo.TypeSeance;
import com.ensah.core.dao.IAbsenceDao;
import com.ensah.core.services.IAbsenceService;
import com.ensah.core.services.IEnseignantService;
import com.ensah.core.services.IMatierService;
import com.ensah.core.services.ITypeSeanceService;
import com.ensah.core.services.IinscreptionsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.validation.Valid;

@Service
@Transactional
public class IAbsenceServiceImpl  implements IAbsenceService {


    @Autowired
    private IAbsenceDao absenceDao;
    
    @Autowired
    private IMatierService MatiereService;

    @Autowired
    private IinscreptionsService InscriptionService;
    
    @Autowired
    private ITypeSeanceService TypeSeanceService;
    
    
    @Autowired
    private IEnseignantService EnseignantService;    
    
    @Override
    public void createAbsence(Absence absence) {
        absenceDao.create(absence);

    }

    @Override
    public List<Absence> getEtudiantAbsenceByIdInscription(String idInscription) {
        List<Absence> u = absenceDao.getEntityByColValue("Absence", "idInscription", idInscription);
        if (u != null && u.size() != 0) {
            return (List<Absence>) absenceDao.getEntityByColValue("Absence", "idInscription", idInscription);
        }

        return null;
    }
    
	public List<Absence> getAllAbsence()
	{
		return absenceDao.getAll();
	}

    
    
    @Override
	public void addAbsence(@Valid Absence absence, Long idMatiere, Long idInscription, Long idTypeSeance, Long i)
	{
    	
    	Matiere m = MatiereService.getMatiereById(idMatiere);
    	absence.setMatiere(m);
    	m.getAbsences().add(absence);
    	
    	
    	Inscription ii = InscriptionService.getInscriptionById(idInscription);
    	absence.setInscription(ii);
    	ii.getAbsences().add(absence);

    	
    	TypeSeance ts = TypeSeanceService.getTypeSeanceById(idTypeSeance);
    	absence.setTypeSeance(ts);
    	ts.getAbsences().add(absence);

    	
    	Enseignant es = EnseignantService.getEnseignantById(i);
    	absence.setObservateur(es);
    	es.getAbsencesMarquees().add(absence);
    	
    	absenceDao.create(absence);

}
