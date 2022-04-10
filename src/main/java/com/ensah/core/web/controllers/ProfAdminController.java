package com.ensah.core.web.controllers;


import com.ensah.core.bo.Absence;
import com.ensah.core.bo.Etudiant;

import com.ensah.core.bo.Inscription;
import com.ensah.core.bo.Matiere;
import com.ensah.core.bo.Utilisateur;
import com.ensah.core.dao.IEnseignantDao;
import com.ensah.core.services.*;
import com.ensah.core.services.impl.InscriptionService;
import com.ensah.core.web.models.AbsenceModel;
import com.ensah.core.web.models.NiveauModule;
import com.ensah.core.web.models.PersonModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/prof")
public class ProfAdminController {

    @Autowired
    private IEnseignantDao EnseignantService;

    @Autowired
    private ITypeSeanceService seanceService;

    @Autowired
    private IModuleService moduleService;

    @Autowired
    private INiveauServiceImpl niveauService;

    @Autowired
    private IetudiantService etudiantService;


    @Autowired
    private IUtilisateurService utilisateurService;


    @Autowired
    private IinscreptionsService inscriptionService;

    @Autowired
    private IAbsenceService absenceService;

    @Autowired
    private IMatierService matierService;


    public ProfAdminController() {
    }

    @RequestMapping(value = "searchClass",method = RequestMethod.GET)
    private String searchClass(Model model){


        model.addAttribute("NiveauList",niveauService.getAllNiveau());



        return "prof/searchClass";
    }
    
    
    @RequestMapping(value = "showForm",method = RequestMethod.GET)
    private String showForm(Model model){


        model.addAttribute("inscriptions",inscriptionService.getAllInscriptions());

        return "prof/absenceHistory";
    }
    
    

    @RequestMapping(value = "getListEtudiants/{idNiveau}",method = RequestMethod.GET)
    private String listEtudiant(@Valid@ModelAttribute("AbsenceModel") Absence absence,BindingResult bindingResult,@PathVariable Long idNiveau, Model model){

            NiveauModule niveauModule = new NiveauModule(Long.valueOf(idNiveau));


            model.addAttribute("niveauModule",niveauModule);

         

           List<Inscription>  inscriptions = inscriptionService.getInscriptionByIdNiveau(String.valueOf(idNiveau));
//           List<Matiere> matieres = matierService.getAllMatiers();
//
//            model.addAttribute("matieres", matieres );
            model.addAttribute("inscriptions",inscriptions);
            model.addAttribute("matieres", matierService.getAllMatiers());

            model.addAttribute("sceances", seanceService.getAllTypes());

        return "prof/ListEtudiant";
    }

    @RequestMapping(value = "absenceForm", method = RequestMethod.GET)
    public String absenceForm(@RequestParam Long idInscription, Model model,BindingResult bindingResult) {


        AbsenceModel amodel = new AbsenceModel();
        amodel.setIdInscription(idInscription);

        model.addAttribute("absenceModel",amodel);


        model.addAttribute("matiers",matierService.getAllMatiers());


        return "prof/absenceForm";
    }

    @RequestMapping(value = "setAbsence")
    public String setAbsence(@Valid @ModelAttribute("absenceModel") AbsenceModel amodel, Model model, BindingResult bindingResult, HttpServletRequest rq){


        if (bindingResult.hasErrors()) {

            return "prof/ListEtudiant";
        }

         Absence absence = new Absence();

         BeanUtils.copyProperties(amodel, absence);
         absenceService.createAbsence(absence);



        model.addAttribute("message","absence submitted succesfully");


        return "prof/showForm";
    }






    @RequestMapping("getListEtudiants/addabsents")
    public String addabsents(@Valid@ModelAttribute("AbsenceModel") Absence absence,@RequestParam("idMatiere")Long idMatiere,@RequestParam("idTypeSeance") Long idTypeSeance, BindingResult bindingResult, Model model, HttpServletRequest rq){
      if(bindingResult.hasErrors()) {return "prof/showForm";}
      

   for(String idInsc:rq.getParameterValues("idInsc")) 
   {	  
      absenceService.addAbsence(absence,idMatiere,Long.valueOf(1),idTypeSeance,Long.valueOf(10));
   }

   model.addAttribute("absenceList",absenceService.getAllAbsence());
   
        return "prof/showForm";
   
    }

    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @RequestMapping(value = "serachEtudiant", method = RequestMethod.GET)
    public String serachPerson(@RequestParam String cne, Model model) {

        Utilisateur utl = etudiantService.getEtudiantByCNE(cne);
        if (utl == null) {

            model.addAttribute("personModel", new ArrayList<PersonModel>());
        } else {

            PersonModel pm = new PersonModel();


                BeanUtils.copyProperties((Etudiant) utl, pm);
                pm.setTypePerson(PersonModel.TYPE_PROF);

            List<PersonModel> modelPersons = new ArrayList<PersonModel>();
            modelPersons.add(pm);
            model.addAttribute("personList", modelPersons);
        }
        return "prof/etudiantFiche";
    }

//    @RequestMapping(value = "showForm", method = RequestMethod.GET)
//    public String AbsenceFiche(@RequestParam(value = "idInscription", required = false) Long idInscription, Model model){
//
//
//            AbsenceModel absenceModel = new AbsenceModel(idInscription);
//            model.addAttribute("absenceModel", absenceModel);
//
//            // Nous avons choisit d'utiliser une classe modèle personnalisée
//            // définie par PersonModel pour une meilleur flexibilité
//
//            List<Absence> absences = absenceService.getEtudiantAbsenceByIdInscription(String.valueOf(idInscription));
//            List<AbsenceModel> absenceModels = new ArrayList<AbsenceModel>();
//            // On copie les données des personnes vers le modèle
//            for (int i = 0; i < absences.size(); i++) {
//                AbsenceModel pm = new AbsenceModel();
//                if (absences.get(i) instanceof Absence) {
//                    // permet de copier les données d'un objet à l'autre à codition
//                    // d'avoir les meme attributs (getters/setters)
//                    BeanUtils.copyProperties((Absence) absences.get(i), pm);
//                    // On fixe le type (cet attribut ne sera pas copié automatiquement)
//                    pm.setIdInscription(idInscription);
//
//                    // Mettre la personne dans le modèle
//                    absenceModels.add(pm);
//                }
//            }
//
//            // Mettre la liste des personnes dans le modèle de Spring MVC
//            model.addAttribute("absenceModel", absenceModel);
//
//            return "prof/etudiantFiche";
//        }
    
    
    
    
    @RequestMapping(value = "absenceHistory", method = RequestMethod.GET)
    public String absenceHistory(@RequestParam Long idInscription, Model model) {

       List<Absence> absencesList =absenceService.getEtudiantAbsenceByIdInscription(String.valueOf(idInscription));
       AbsenceModel abs=new AbsenceModel();
       model.addAttribute("absModel",absencesList);
        return "prof/absenceHistory";
    }
    }


