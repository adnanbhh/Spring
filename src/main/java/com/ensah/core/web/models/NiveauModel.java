package com.ensah.core.web.models;


public class NiveauModel {
	
	private Long roleId;
	
	private Long idNiveau;
	
	private String titre;

	private String alias;
			
	
	public NiveauModel() {
	}

	public NiveauModel(Long idNiveau) {
		this.idNiveau = idNiveau;
	}

	
	public NiveauModel(Long roleId, Long idNiveau) {
		this.roleId = roleId;
		this.idNiveau = idNiveau;
	}

	public NiveauModel(String titre, String alias, Long roleId, Long idNiveau) {
		this.titre = titre;
		this.alias = alias;
		this.roleId = roleId;
		this.idNiveau = idNiveau;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	

	public Long getNiveauId() {
		return idNiveau;
	}

	public void setNiveauId(Long idNiveau) {
		this.idNiveau = idNiveau;
	}

}