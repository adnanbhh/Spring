package com.ensah.core.services;

import java.util.List;

import javax.validation.Valid;

import com.ensah.core.bo.Matiere;
import com.ensah.core.utils.ExcelExporter;

public interface IMatiereService {
	
	public void updateMatiere(Matiere matiere);

	public List<Matiere> getAllMatiere2();

	public void deleteMatiere(Long id);

	public Matiere getMatiereById(Long id);
	
//	public ExcelExporter preparePersonExport(List<Matiere> matieres);

	void addMatiere2(Matiere matiere, Long idModule);

	public void updateMatiere2(Matiere matiere, Long idModule);

	public List<Matiere> getMatiereByIdModule(String string, String string2, String s);
	
}
