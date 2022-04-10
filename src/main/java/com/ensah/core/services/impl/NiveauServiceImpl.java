package com.ensah.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensah.core.bo.Filiere;
//import com.ensah.core.bo.Utilisateur;
import com.ensah.core.bo.Niveau;
import com.ensah.core.dao.INiveauDao;
import com.ensah.core.services.IFiliereService;
import com.ensah.core.services.INiveauService;
//import com.ensah.core.utils.ExcelExporter;

@Service
@Transactional
public class NiveauServiceImpl implements INiveauService {

		@Autowired
		private INiveauDao niveauDao;
		
		@Autowired 
		private IFiliereService FilierService;

		public List<Niveau> getAllNiveau2() {

			return niveauDao.getAll();
		}

		public void deleteNiveau(Long id) {
			niveauDao.delete(id);

		}

		public Niveau getNiveauById(Long id) {
			return niveauDao.findById(id);

		}

		public void addNiveau2(Niveau nNiveau) {			
			niveauDao.create(nNiveau);
		}

		public void updateNiveau(Niveau nNiveau) {
			niveauDao.update(nNiveau);
		}

		@Override
		public void addNiveau2(Niveau niveau, Long idFiliere) {
			Filiere f = FilierService.getFiliereById(idFiliere);
			niveau.setFiliere(f);
			f.getNiveaux().add(niveau);
			niveauDao.create(niveau);
		}
		
		
		public void updateNiveau2(Niveau niveau, Long idFiliere) {
			Filiere f = FilierService.getFiliereById(idFiliere);
			niveau.setFiliere(f);
			f.getNiveaux().add(niveau);
			niveauDao.update(niveau);
		}
		
		public List<Niveau> getNiveauByIdFilier(String Niveau, String pColumnName, String pValue)
		{
			return niveauDao.getEntityByColValue(Niveau, pColumnName, pValue);
		}

}
//public ExcelExporter preparePersonExport(List<Filiere> filiers) {
//String[] columnNames = new String[] { "titreFiliere", "codeFiliere", "anneeaccreditation", "anneeFinaccreditation"};
//String[][] data = new String[filiers.size()][4];
//
//int i = 0;
//for (Filiere f : filiers) {
//	data[i][0] = f.getTitreFiliere();
//	data[i][1] = f.getCodeFiliere();
//	data[i][2] = f.getAnneeaccreditation();
//	data[i][3] = f.getAnneeFinaccreditation();
//	i++;
//}
//
//return new ExcelExporter(columnNames, data, "moduls");
//
//}