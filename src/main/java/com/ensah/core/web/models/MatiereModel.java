package com.ensah.core.web.models;

public class MatiereModel {
	
	private Long roleId;
	
	private Long idMatiere;
	
	private String nom;

	private String code;
	
	public MatiereModel() {
	}

	public MatiereModel(Long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public MatiereModel(Long roleId, Long idMatiere) {
		this.roleId = roleId;
		this.idMatiere = idMatiere;
	}

	public MatiereModel(String nom, String code, Long roleId, Long idMatiere) {
		this.nom = nom;
		this.code = code;
		this.roleId = roleId;
		this.idMatiere = idMatiere;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMatiereId() {
		return idMatiere;
	}

	public void setMatiereId(Long idMatiere) {
		this.idMatiere = idMatiere;
	}


}
