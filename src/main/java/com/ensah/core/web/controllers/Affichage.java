package com.ensah.core.web.controllers;

import java.util.List;

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
import com.ensah.core.bo.Niveau;
import com.ensah.core.services.IFiliereService;
import com.ensah.core.services.IMatiereService;
import com.ensah.core.services.IModuleService;
import com.ensah.core.services.INiveauService;
import com.ensah.core.web.models.FiliereModel;
import com.ensah.core.web.models.MatiereModel;
import com.ensah.core.web.models.ModuleModel;
import com.ensah.core.web.models.NiveauModel;

@Controller
@RequestMapping("/cadre")
public class Affichage {
	
	@Autowired
	private IFiliereService filiereService;
	
	@Autowired
	private INiveauService niveauService;
	
	@Autowired
	private IModuleService moduleService;

	@Autowired
	private IMatiereService matiereService;
	
	@RequestMapping(value = "showAll", method = RequestMethod.GET)
	public String showModule(Model model) {
		FiliereModel Ffiliere = new FiliereModel();
		model.addAttribute("FiliereModel", Ffiliere);
		model.addAttribute("filiereList", filiereService.getAllFiliers());

		return "cadreadmin/show";
	}

	
	
	 @RequestMapping(value = "/showF/{idFiliere}", method = RequestMethod.GET)
		public String showF(@PathVariable Long idFiliere,Model model) {
			NiveauModel Nniveau = new NiveauModel();
			String s=Long.toString(idFiliere);
			model.addAttribute("NiveauModel", Nniveau);
			model.addAttribute("niveauList", niveauService.getNiveauByIdFilier("Niveau", "idFiliere", s));
			
			return	"cadreadmin/showNiv";
		}	
	 @RequestMapping(value = "showF/showN/{idNiveau}", method = RequestMethod.GET)
		public String showN(@PathVariable Long idNiveau,Model model) {
			ModuleModel Mmodule = new ModuleModel();
			String s=Long.toString(idNiveau);
			model.addAttribute("ModuleModel", Mmodule);
			model.addAttribute("moduleList", moduleService.getModuleByIdNiveau("Module", "idNiveau", s));
			
			return	"cadreadmin/showMod";
		}	
	 @RequestMapping(value = "showF/showN/showM/{idModule}", method = RequestMethod.GET)
		public String showM(@PathVariable Long idModule,Model model) {
			MatiereModel Mmatiere = new MatiereModel();
			String s=Long.toString(idModule);
			model.addAttribute("MatiereModel", Mmatiere);
			model.addAttribute("matiereList", matiereService.getMatiereByIdModule("Matiere", "idModule", s));
			
			return	"cadreadmin/showMat";
		}	
}
