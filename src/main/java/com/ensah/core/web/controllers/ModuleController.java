
	package com.ensah.core.web.controllers;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;

import com.ensah.core.services.IModuleService;
import com.ensah.core.services.INiveauService;
import com.ensah.core.web.models.ModuleModel;
import com.ensah.core.bo.Module;
	@Controller
	@RequestMapping("/cadre")
	public class ModuleController {
		
		@Autowired
		private IModuleService moduleService;
		// mon mushibishi 
		
		@Autowired
		private INiveauService niveauService;

		@RequestMapping(value = "showModule", method = RequestMethod.GET)
		public String showModule(Model model) {
			ModuleModel Mmodule = new ModuleModel();
			model.addAttribute("ModuleModel", Mmodule);
			model.addAttribute("moduleList", moduleService.getAllModule2());
			model.addAttribute("niveauList", niveauService.getAllNiveau2());


			// Nous avons choisit d'utiliser une classe modèle personnalisée
			// définie par PersonModel pour une meilleur flexibilité

			/*List<Filiere> filiers = filiereService.getAllFiliers();
			List<FiliereModel> filiereModules = new ArrayList<FiliereModel>();
			
			// On copie les données des personnes vers le modèle
			for (int i = 0; i < filiers.size(); i++) {
				FiliereModel ff = new FiliereModel();
				if (filiers.get(i) instanceof Filiere) {
					// permet de copier les données d'un objet à l'autre à codition
					// d'avoir les meme attributs (getters/setters)
					BeanUtils.copyProperties((Filiere) filiers.get(i), ff);
					// On fixe le type (cet attribut ne sera pas copié automatiquement)
					//mm.setTypePerson(PersonModel.TYPE_STUDENT);

					// Mettre la personne dans le modèle
					filiereModules.add(ff);
				}		*/
			return "cadreadmin/moduleform";
		}
		
		@RequestMapping("/addModule") 
		  public String process(@Valid@ModelAttribute("ModuleModel") com.ensah.core.bo.Module module, BindingResult bindingResult, @RequestParam("idNiveau") Long idNiveau, Model model) {
		  
		  if (bindingResult.hasErrors()) { return "/cadre/showModule"; } 
		 
		  moduleService.addModule2(module,idNiveau);
return 		  "redirect:/cadre/showModule";
		  }
		
		
		
		
		  @RequestMapping(value = "/deleteModule/{idModule}", method = RequestMethod.GET)
			public String deleteModule(@PathVariable Long idModule) {

			  moduleService.deleteModule(idModule);

				return	"redirect:/cadre/showModule";
			}
		  
		
		  
		  
		  
		  @RequestMapping(value = "/updateModule/{idModule}", method = RequestMethod.GET)
			public String updateModuleForm(@PathVariable Long idModule, Model model) {

				model.addAttribute("ModuleModel", moduleService.getModuleById(idModule));
				model.addAttribute("niveauList", niveauService.getAllNiveau2());

				return "cadreadmin/ModuleList";
			}
		  

		  @RequestMapping("/updateModuleForm")
			public String updateNiveau(@Valid @ModelAttribute("ModuleModel") Module module, BindingResult bindingResult,
					@RequestParam("idNiveau") Long idNiveau, Model model) {

			  if (bindingResult.hasErrors()) { return "/cadre/showModule"; } 
			  
			  moduleService.updateModule2(module, idNiveau);
			  model.addAttribute("moduleList", moduleService.getAllModule2()); 
				model.addAttribute("niveauList", niveauService.getAllNiveau2());

			  return
			  "redirect:/cadre/showModule";
			}
		  
	}

