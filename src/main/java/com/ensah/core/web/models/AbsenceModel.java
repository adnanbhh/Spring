package com.ensah.core.web.models;

import java.util.Date;
import java.util.Objects;

import com.ensah.core.bo.Inscription;

public class AbsenceModel {

    private Long idInscription;
    private Long idEnseignant;
    private  Long idMatiere;

    private Long idAbsence;

    private Date dateHeureDebutAbsence;

    private Date dateHeureFinAbsence;


    private String typeSaisie;

    public AbsenceModel() {

    }
    
    

    public AbsenceModel(Long idInscription) {
        this.idInscription = idInscription;
    }

    public AbsenceModel(Long idInscription, Long idMatiere) {
        this.idInscription = idInscription;
        this.idMatiere = idMatiere;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInscription, idEnseignant, idMatiere, idAbsence, dateHeureDebutAbsence, dateHeureFinAbsence, typeSaisie);
    }

    @Override
    public String toString() {
        return "AbsenceModel{" +
            "idInscription=" + idInscription +
            ", idEnseignant=" + idEnseignant +
            ", idAbsence=" + idAbsence +
            ", dateHeureDebutAbsence=" + dateHeureDebutAbsence +
            ", dateHeureFinAbsence=" + dateHeureFinAbsence +
            ", typeSaisie='" + typeSaisie + '\'' +
            '}';
    }

    public AbsenceModel(Long idInscription, Long idEnseignant, Long idMatiere, Long idAbsence, Date dateHeureDebutAbsence, Date dateHeureFinAbsence, String typeSaisie) {
        this.idInscription = idInscription;
        this.idEnseignant = idEnseignant;
        this.idMatiere = idMatiere;
        this.idAbsence = idAbsence;
        this.dateHeureDebutAbsence = dateHeureDebutAbsence;
        this.dateHeureFinAbsence = dateHeureFinAbsence;
        this.typeSaisie = typeSaisie;
    }

    public Long getIdInscription() {
        return idInscription;
    }
    
    public void setIdInscription(Long idInscription) {
        this.idInscription = idInscription;
    }

    public Long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Long getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Long idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Long getIdAbsence() {
        return idAbsence;
    }

    public void setIdAbsence(Long idAbsence) {
        this.idAbsence = idAbsence;
    }

    public Date getDateHeureDebutAbsence() {
        return dateHeureDebutAbsence;
    }

    public void setDateHeureDebutAbsence(Date dateHeureDebutAbsence) {
        this.dateHeureDebutAbsence = dateHeureDebutAbsence;
    }

    public Date getDateHeureFinAbsence() {
        return dateHeureFinAbsence;
    }

    public void setDateHeureFinAbsence(Date dateHeureFinAbsence) {
        this.dateHeureFinAbsence = dateHeureFinAbsence;
    }

    public String getTypeSaisie() {
        return typeSaisie;
    }

    public void setTypeSaisie(String typeSaisie) {
        this.typeSaisie = typeSaisie;
    }
}
