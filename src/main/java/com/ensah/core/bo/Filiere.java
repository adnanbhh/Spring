package com.ensah.core.bo;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Filiere {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idFiliere;

	private String titreFiliere;

	private String codeFiliere;

	private int anneeaccreditation;

	private int anneeFinaccreditation;

	@OneToMany(mappedBy = "filiere" ,  cascade = CascadeType.ALL, targetEntity = Niveau.class)
	private Set<Niveau> niveaux;
	
	@OneToMany(  cascade = CascadeType.ALL, targetEntity = Coordination.class)
	public Set<Coordination> periodeCoordination;

	public Long getIdFiliere() {
		return idFiliere;
	}

	public void setIdFiliere(Long idFiliere) {
		this.idFiliere = idFiliere;
	}

	public String getTitreFiliere() {
		return titreFiliere;
	}

	public void setTitreFiliere(String titreFiliere) {
		this.titreFiliere = titreFiliere;
	}

	public String getCodeFiliere() {
		return codeFiliere;
	}

	public void setCodeFiliere(String codeFiliere) {
		this.codeFiliere = codeFiliere;
	}

	public int getAnneeaccreditation() {
		return anneeaccreditation;
	}

	public void setAnneeaccreditation(int anneeaccreditation) {
		this.anneeaccreditation = anneeaccreditation;
	}

	public int getAnneeFinaccreditation() {
		return anneeFinaccreditation;
	}

	public void setAnneeFinaccreditation(int anneeFinaccreditation) {
		this.anneeFinaccreditation = anneeFinaccreditation;
	}

	public Set<Niveau> getNiveaux() {
		return niveaux;
	}

	public Set<Coordination> getCoordination() {
		return periodeCoordination;
	}
	
	public void setNiveaux(Set<Niveau> niveaux) {
		this.niveaux = niveaux;
	}

	public Set<Coordination> getPeriodeCoordination() {
		return periodeCoordination;
	}

	public void setPeriodeCoordination(Set<Coordination> periodeCoordination) {
		this.periodeCoordination = periodeCoordination;
	}

	
	
}