package com.ensah.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.bo.Matiere;
import com.ensah.core.dao.IMatiereDao;
import com.ensah.core.dao.IModuleDao;
import com.ensah.core.services.IMatiereService;
import com.ensah.core.services.IModuleService;
import com.ensah.core.utils.ExcelExporter;

@Service
@Transactional
public class MatiereServiceImpl implements IMatiereService  {

	@Autowired
	private IMatiereDao matiereDao;
	
	@Autowired 
	private IModuleService ModuleService;
	
	public void updateMatiere(Matiere matiere)
	{
		matiereDao.update(matiere);	}

	public List<Matiere> getAllMatiere2()
	{
		return matiereDao.getAll();
	}
	
	public void deleteMatiere(Long id)
	{
		matiereDao.delete(id);
	}

	public Matiere getMatiereById(Long id)
	{
		return matiereDao.findById(id);

	}
	
//	public ExcelExporter preparePersonExport(List<Matiere> matieres)
//	{
//		
//	}
	
	@Override
	public void addMatiere2(Matiere matiere, Long idModule)
	{	
		com.ensah.core.bo.Module f = ModuleService.getModuleById(idModule);
		matiere.setModule(f);
		f.getMatieres().add(matiere);
		matiereDao.create(matiere);
	}
	
	public void updateMatiere2(Matiere matiere, Long idModule)
	{
		com.ensah.core.bo.Module f = ModuleService.getModuleById(idModule);
		matiere.setModule(f);
		f.getMatieres().add(matiere);
		matiereDao.update(matiere);
	}
	
	public List<Matiere> getMatiereByIdModule(String Matiere, String pColumnName, String pValue)
	{
		return matiereDao.getEntityByColValue(Matiere, pColumnName, pValue);
	}

}
