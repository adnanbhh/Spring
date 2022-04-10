package com.ensah.core.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import com.ensah.core.bo.Utilisateur;
import com.ensah.core.bo.Filiere;
import com.ensah.core.dao.IFiliereDao;
import com.ensah.core.services.IFiliereService;
//import com.ensah.core.utils.ExcelExporter;

@Service
@Transactional
public class FiliereServiceImpl implements IFiliereService {

		@Autowired
		private IFiliereDao filiereDao;

		public List<Filiere> getAllFiliers() {

			return filiereDao.getAll();
		}

		public void deleteFiliere(Long id) {
			filiereDao.delete(id);

		}

		public Filiere getFiliereById(Long id) {
			return filiereDao.findById(id);

		}

		public void addFiliere(Filiere fFiliere) {
			filiereDao.create(fFiliere);
		}

		public void updateFiliere(Filiere fFiliere) {
			filiereDao.update(fFiliere);

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