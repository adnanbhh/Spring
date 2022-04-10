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

import com.ensah.core.bo.Filiere;
import com.ensah.core.services.IFiliereService;
import com.ensah.core.web.models.FiliereModel;

@Controller
@RequestMapping("/cadre")
public class FiliereController {
	
	@Autowired
	private IFiliereService filiereService;
	// mon mushibishi 
	
	@RequestMapping(value = "showFiliere", method = RequestMethod.GET)
	public String showModule(Model model) {
		FiliereModel Ffiliere = new FiliereModel();
		model.addAttribute("FiliereModel", Ffiliere);
		model.addAttribute("filiereList", filiereService.getAllFiliers());

		
		return "cadreadmin/filiereform";
	}
	
	@RequestMapping("/addFiliere") 
	  public String process(@Valid@ModelAttribute("filiereModel") Filiere filiere, BindingResult bindingResult, Model model) {
	  
	  if (bindingResult.hasErrors()) { return "/cadre/showFiliere"; } 
	  
	  filiereService.addFiliere(filiere);
	  model.addAttribute("filiereList", filiereService.getAllFiliers()); return
	  "redirect:/cadre/showFiliere";
	  }
	
	  @RequestMapping(value = "/deleteFiliere/{idFiliere}", method = RequestMethod.GET)
		public String deleteFiliere(@PathVariable Long idFiliere) {

			filiereService.deleteFiliere(idFiliere);

			return	"redirect:/cadre/showFiliere";
		}
	  
	  @RequestMapping(value = "/updateFiliere/{idFiliere}", method = RequestMethod.GET)
		public String updateFiliereForm(@PathVariable Long idFiliere, Model model) {

			model.addAttribute("FiliereModel", filiereService.getFiliereById(idFiliere));

			return "cadreadmin/FiliereList";
		}
	  
//	  @RequestMapping("/updateFiliere")
//		public String updateFiliere(@Valid @ModelAttribute("FiliereModel") Filiere filiere, BindingResult bindingResult,
//				Model model) {
//
//			if (bindingResult.hasErrors()) {
//
//				return "cadre/showFiliereForm";
//			}
//
//			filiereService.updateFiliere(filiere);
//			model.addAttribute("filiereList", filiereService.getAllFiliers());
//
//			return "/cadre/showFiliere";
//		}
//	  @RequestMapping("/updateFiliere")
//		public String manageFiliere(Model model) {
//
//			model.addAttribute("FiliereList", filiereService.getAllFiliers());
//
//			return "FiliereList";
//		}
	  
	  @RequestMapping("/updateFiliereForm")
		public String updateFiliere(@Valid @ModelAttribute("FiliereModel") Filiere filiere, BindingResult bindingResult,
				Model model) {

		  if (bindingResult.hasErrors()) { return "/cadre/showFiliere"; } 
		  
		  filiereService.updateFiliere(filiere);
		  model.addAttribute("filiereList", filiereService.getAllFiliers()); return
		  "redirect:/cadre/showFiliere";
		}
	  
}
