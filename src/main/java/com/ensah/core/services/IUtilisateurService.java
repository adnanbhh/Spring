package com.ensah.core.services;

import com.ensah.core.bo.Utilisateur;

public interface IUtilisateurService {
    public Utilisateur getUserByIdInscription(String idInscription);
}
