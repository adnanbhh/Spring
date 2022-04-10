package com.ensah.core.services;

import java.util.List;

import javax.validation.Valid;

import com.ensah.core.bo.Niveau;
//import com.ensah.core.utils.ExcelExporter;

public interface INiveauService 
{
	//public void addNiveau(Niveau nNiveau);

	public void updateNiveau(Niveau nNiveau);

//	public List<Niveau> getAllNiveau();

	public List<Niveau> getAllNiveau2();
	
	public void deleteNiveau(Long id);

	public Niveau getNiveauById(Long id);

	public void addNiveau2( Niveau niveau, Long idFiliere);
	
	public void updateNiveau2(Niveau nNiveau, Long idFiliere);

	public List<Niveau> getNiveauByIdFilier(String Niveau, String pColumnName, String pValue);

//	public Module getModuleById(Long idModule);
	
//	public ExcelExporter preparePersonExport(List<Filiere> filieres);		
}
