	package com.ensah.core.services;

	import java.util.List;

import javax.validation.Valid;

import com.ensah.core.bo.Module;
import com.ensah.core.bo.Niveau;
import com.ensah.core.utils.ExcelExporter;

public interface IModuleService 
{
		//public void addModule(Module mModule);

		public void updateModule(Module module);

		public List<Module> getAllModule2();

		public void deleteModule(Long id);

		public Module getModuleById(Long id);
		
		public ExcelExporter preparePersonExport(List<Module> modules);
		
		void updateModule2(Module module, Long idNiveau);


		void addModule2(Module module, Long idNiveau);

		public List<Module>  getModuleByIdNiveau(String string, String string2, String s);

}
