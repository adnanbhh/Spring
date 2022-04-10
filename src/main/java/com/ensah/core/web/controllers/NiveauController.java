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

import com.ensah.core.bo.Niveau;
import com.ensah.core.services.IFiliereService;
import com.ensah.core.services.INiveauService;
import com.ensah.core.web.models.NiveauModel;

@Controller
@RequestMapping("/cadre")
public class NiveauController {
	
	@Autowired
	private INiveauService niveauService;
	// mon mushibishi 
	
	@Autowired
	private IFiliereService filiereService;

	@RequestMapping(value = "showNiveau", method = RequestMethod.GET)
	public String showNiveau(Model model) {
		NiveauModel Nniveau = new NiveauModel();
		model.addAttribute("NiveauModel", Nniveau);
		model.addAttribute("niveauList", niveauService.getAllNiveau2());
		model.addAttribute("filiereList", filiereService.getAllFiliers());


		return "cadreadmin/niveauform";
	}
	
	@RequestMapping("/addNiveau") 
	public String process(@Valid@ModelAttribute("NiveauModel") Niveau niveau, BindingResult bindingResult, @RequestParam("idFiliere") Long idFiliere, Model model) {
	if (bindingResult.hasErrors()) { return "/cadre/showNiveau"; } 
	 
	  niveauService.addNiveau2(niveau,idFiliere);
	  model.addAttribute("niveauList", niveauService.getAllNiveau2()); return
	  "redirect:/cadre/showNiveau";
	  }
	
	
	@RequestMapping(value = "/updateNiveau/{idNiveau}", method = RequestMethod.GET)
	public String updateNiveauForm(@PathVariable Long idNiveau, Model model) 
	{	
		model.addAttribute("NiveauModel", niveauService.getNiveauById(idNiveau));
		model.addAttribute("filiereList", filiereService.getAllFiliers());

		return "cadreadmin/NiveauList";
	}
	
	
	@RequestMapping("/updateNiveauForm")
	public String updateNiveau(@Valid @ModelAttribute("NiveauModel") Niveau niveau, BindingResult bindingResult,
			@RequestParam("idFiliere") Long idFiliere, Model model) {
		
		if (bindingResult.hasErrors()) { return "/cadre/showNiveau"; } 
		
		niveauService.updateNiveau2(niveau,idFiliere);
		model.addAttribute("niveauList", niveauService.getAllNiveau2());
		model.addAttribute("filiereList", filiereService.getAllFiliers());

		return	"redirect:/cadre/showNiveau";
	}
	
	
	  @RequestMapping(value = "/deleteNiveau/{idNiveau}", method = RequestMethod.GET)
		public String deleteNiveau(@PathVariable Long idNiveau) {

		  	niveauService.deleteNiveau(idNiveau);

			return	"redirect:/cadre/showNiveau";
		}
	  
	
	  
	  
	  
	  
}
