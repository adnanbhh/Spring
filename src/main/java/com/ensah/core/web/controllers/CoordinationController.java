//package com.ensah.core.web.controllers;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ensah.core.bo.Coordination;
//import com.ensah.core.bo.Niveau;
//import com.ensah.core.services.ICoordinationService;
//import com.ensah.core.services.IFiliereService;
//import com.ensah.core.services.INiveauService;
//import com.ensah.core.web.models.CoordinationModel;
//import com.ensah.core.web.models.NiveauModel;
//
//@Controller
//@RequestMapping("/cadre")
//public class CoordinationController {
//	
//	@Autowired
//	private ICoordinationService coordinationService;
//	// mon mushibishi 
//	
//	@Autowired
//	private IFiliereService filiereService;
//
//	@RequestMapping(value = "showCoordination", method = RequestMethod.GET)
//	public String showCoordination(Model model) {
//		CoordinationModel cCoordination = new CoordinationModel();
//		model.addAttribute("CoordinationModel", cCoordination);
//		model.addAttribute("coordinationList", coordinationService.getAllCoordination2());
//		model.addAttribute("filiereList", filiereService.getAllFiliers());
//
//		return "cadreadmin/coordinationform";
//	}
//	
//	@RequestMapping("/addCoordination") 
//	public String process(@Valid@ModelAttribute("CoordinationModel") Coordination coordination, BindingResult bindingResult, @RequestParam("idFiliere") Long idFiliere, Model model) {
//	if (bindingResult.hasErrors()) { return "/cadre/showCoordination"; } 
//	 
//	coordinationService.addCoordination2(coordination,idFiliere);
//	  model.addAttribute("coordinationList", coordinationService.getAllCoordination2()); return
//	  "redirect:/cadre/showCoordination";
//	  }
//	
//	
//	@RequestMapping(value = "/updateCoordination/{idCoordination}", method = RequestMethod.GET)
//	public String updateCoordinationForm(@PathVariable Long idCoordination, Model model) 
//	{	
//		model.addAttribute("CoordinationModel", coordinationService.getCoordinationById(idCoordination));
//		model.addAttribute("filiereList", filiereService.getAllFiliers());
//
//		return "cadreadmin/CoordinationList";
//	}
//	
//	
//	@RequestMapping("/updateCoordinationForm")
//	public String updateNiveau(@Valid @ModelAttribute("CoordinationModel") Coordination coordination, BindingResult bindingResult,
//			@RequestParam("idFiliere") Long idFiliere, Model model) {
//		
//		if (bindingResult.hasErrors()) { return "/cadre/showCoordination"; } 
//		
//		coordinationService.updateCoordination2(coordination,idFiliere);
//		model.addAttribute("coordinationList", coordinationService.getAllCoordination2());
//		model.addAttribute("filiereList", filiereService.getAllFiliers());
//
//		return	"redirect:/cadre/showCoordination";
//	}
//	
//	
//	  @RequestMapping(value = "/deleteCoordination/{idCoordination}", method = RequestMethod.GET)
//		public String deleteCoordination(@PathVariable Long idCoordination) {
//
//		  coordinationService.deleteCoordination(idCoordination);
//
//			return	"redirect:/cadre/showCoordination";
//		}
//	  
//}
