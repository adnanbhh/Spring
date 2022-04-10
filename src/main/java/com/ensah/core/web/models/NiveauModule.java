package com.ensah.core.web.models;

import javax.validation.constraints.NotBlank;

public class NiveauModule {


    @NotBlank(message = "This field is required")
    private Long idNiveau;

    private String alias;

    @NotBlank(message = "This field is required")
    private String titre;

    private Integer IdFilier;



    public NiveauModule(Long aLong) {
    }

    public Long getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Long idNiveau) {
        this.idNiveau = idNiveau;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getIdFilier() {
        return IdFilier;
    }

    public void setIdFilier(Integer idFilier) {
        IdFilier = idFilier;
    }

    @Override
    public String toString() {
        return "NiveauModule{" +
            "idNiveau=" + idNiveau +
            ", alias='" + alias + '\'' +
            ", titre='" + titre + '\'' +
            ", IdFilier=" + IdFilier +
            '}';
    }
}
