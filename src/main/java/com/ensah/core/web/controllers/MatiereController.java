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

import com.ensah.core.bo.Matiere;
import com.ensah.core.bo.Niveau;
import com.ensah.core.services.IMatiereService;
import com.ensah.core.services.IModuleService;
import com.ensah.core.web.models.MatiereModel;

@Controller
@RequestMapping("/cadre")
public class MatiereController {

	@Autowired
	private IMatiereService matiereService;
	
	@Autowired 
	private IModuleService moduleService;
	
	@RequestMapping(value = "showMatiere", method = RequestMethod.GET)
	public String showMatiere(Model model) {
		MatiereModel Mmatiere = new MatiereModel();
		model.addAttribute("MatiereModel", Mmatiere);
		model.addAttribute("matiereList", matiereService.getAllMatiere2());
		model.addAttribute("moduleList", moduleService.getAllModule2());

		return "cadreadmin/matiereform";
	}
	
	@RequestMapping("/addMatiere") 
	  public String process(@Valid@ModelAttribute("MatiereModel") com.ensah.core.bo.Matiere matiere, BindingResult bindingResult, @RequestParam("idModule") Long idModule, Model model) {
	  
	  if (bindingResult.hasErrors()) { return "/cadre/showMatiere"; } 
	 
	  matiereService.addMatiere2(matiere,idModule);
	  		return 		  "redirect:/cadre/showMatiere";
	  }
	
	  @RequestMapping(value = "/deleteMatiere/{idMatiere}", method = RequestMethod.GET)
		public String deleteMatiere(@PathVariable Long idMatiere) {

		  matiereService.deleteMatiere(idMatiere);

		return	"redirect:/cadre/showMatiere";
		}
	
	  @RequestMapping(value = "/updateMatiere/{idMatiere}", method = RequestMethod.GET)
		public String updateMatiereForm(@PathVariable Long idMatiere, Model model) {

			model.addAttribute("MatiereModel", matiereService.getMatiereById(idMatiere));
			model.addAttribute("moduleList", moduleService.getAllModule2());

			return "cadreadmin/MatiereList";
		}
	  
		@RequestMapping("/updateMatiereForm")
		public String updateNiveau(@Valid @ModelAttribute("MatiereModel") Matiere matiere, BindingResult bindingResult,
				@RequestParam("idModule") Long idModule, Model model) {
			
			if (bindingResult.hasErrors()) { return "/cadre/showMatiere"; } 
			
			matiereService.updateMatiere2(matiere, idModule);
			model.addAttribute("matiereList", matiereService.getAllMatiere2());
			model.addAttribute("moduleList", moduleService.getAllModule2());

			return	"redirect:/cadre/showMatiere";
		}
	  
}
