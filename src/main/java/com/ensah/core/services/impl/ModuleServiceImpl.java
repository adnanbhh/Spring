package com.ensah.core.services.impl;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.ensah.core.bo.Filiere;
//import com.ensah.core.bo.Utilisateur;
import com.ensah.core.bo.Module;
import com.ensah.core.bo.Niveau;
import com.ensah.core.dao.IModuleDao;
//import com.ensah.core.dao.IUtilisateurDao;
import com.ensah.core.services.IModuleService;
import com.ensah.core.services.INiveauService;
//import com.ensah.core.services.IPersonService;
import com.ensah.core.utils.ExcelExporter;

@Service
@Transactional
public class ModuleServiceImpl implements IModuleService 
{

		@Autowired
		private IModuleDao moduleDao;
		
		@Autowired 
		private INiveauService NiveauService;

		public List<Module> getAllModule2() {

			return moduleDao.getAll();
		}

		public void deleteModule(Long id) {
			moduleDao.delete(id);

		}

		public Module getModuleById(Long id) {
			return moduleDao.findById(id);

		}

		public void addModule2(Module mModule) {
			moduleDao.create(mModule);

		}

		public void updateModule(Module mModule) {
			moduleDao.update(mModule);

		}
		
		@Override
		public void addModule2(Module module, Long idNiveau) {
			Niveau f = NiveauService.getNiveauById(idNiveau);
			module.setNiveau(f);
			f.getModules().add(module);
			moduleDao.create(module);
		}

		public ExcelExporter preparePersonExport(List<Module> moduls) {
			String[] columnNames = new String[] { "Code", "Titre"};
			String[][] data = new String[moduls.size()][2];

			int i = 0;
			for (Module m : moduls) {
				data[i][0] = m.getCode();
				data[i][1] = m.getTitre();
				i++;
			}

			return new ExcelExporter(columnNames, data, "moduls");

		}

		public void updateModule2(Module module, Long idNiveau)
		{
			Niveau f = NiveauService.getNiveauById(idNiveau);
			module.setNiveau(f);
			f.getModules().add(module);
			moduleDao.update(module);	
		}
		
		public List<Module> getModuleByIdNiveau(String Module, String pColumnName, String pValue)
		{
			return moduleDao.getEntityByColValue(Module, pColumnName, pValue);
		}

//		public Utilisateur getPersonByCin(String cin) {
//			List<Utilisateur> u = personDao.getEntityByColValue("Utilisateur", "cin", cin);
//			if (u != null && u.size() != 0) {
//				return personDao.getEntityByColValue("Utilisateur", "cin", cin).get(0);
//			}

}
