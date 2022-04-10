package com.ensah.core.services;

import com.ensah.core.bo.Matiere;

import java.util.List;

public interface IMatierService {

    public List<Matiere> getMatierByIdModul(String id);
    public  List<Matiere> getAllMatiers();
    
    //
    public Matiere getMatiereById(Long id);
}
