package com.ensah.core.web.models;

public class ModuleModel {
	
	private Long roleId;
	
	private Long idModule;
	
	private String titre;

	private String code;
	
	public ModuleModel() {
	}

	public ModuleModel(Long idModule) {
		this.idModule = idModule;
	}

	public ModuleModel(Long roleId, Long idModule) {
		this.roleId = roleId;
		this.idModule = idModule;
	}

	public ModuleModel(String titre, String code, Long roleId, Long idModule) {
		this.titre = titre;
		this.code = code;
		this.roleId = roleId;
		this.idModule = idModule;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
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

	public Long getModuleId() {
		return idModule;
	}

	public void setModuleId(Long idModule) {
		this.idModule = idModule;
	}

}