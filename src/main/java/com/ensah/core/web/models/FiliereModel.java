package com.ensah.core.web.models;

public class FiliereModel {
	
	private Long roleId;
	
	private Long idFiliere;
	
	private String titreFiliere;

	private String codeFiliere;
	
	private int anneeaccreditation;

	private int anneeFinaccreditation;
	
	public FiliereModel() {
	}

	public FiliereModel(Long idFiliere) {
		this.idFiliere = idFiliere;
	}

	
	public FiliereModel(Long roleId, Long idFiliere) {
		this.roleId = roleId;
		this.idFiliere = idFiliere;
	}

	public FiliereModel(String titreFiliere, String codeFiliere, Long roleId, Long idFiliere,int anneeaccreditation , int anneeFinaccreditation) {
		this.titreFiliere = titreFiliere;
		this.codeFiliere = codeFiliere;
		this.roleId = roleId;
		this.idFiliere = idFiliere;
		this.anneeaccreditation = anneeaccreditation;
		this.anneeFinaccreditation = anneeFinaccreditation;
	}

	public String getTitreFiliere() {
		return titreFiliere;
	}

	public void setTitreFiliere(String titreFiliere) {
		this.titreFiliere = titreFiliere;
	}

	public String getcodeFiliere() {
		return codeFiliere;
	}

	public void setcodeFiliere(String codeFiliere) {
		this.codeFiliere = codeFiliere;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getFiliereId() {
		return idFiliere;
	}

	public void setFiliereId(Long idFiliere) {
		this.idFiliere = idFiliere;
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

}