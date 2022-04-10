package com.ensah.core.services;

import java.util.List;

import com.ensah.core.bo.Filiere;
//import com.ensah.core.utils.ExcelExporter;

public interface IFiliereService 
{
	public void addFiliere(Filiere fFiliere);

	public void updateFiliere(Filiere fFiliere);

	public List<Filiere> getAllFiliers();

	public void deleteFiliere(Long id);

	public Filiere getFiliereById(Long id);
	
//	public ExcelExporter preparePersonExport(List<Filiere> filieres);		
}
