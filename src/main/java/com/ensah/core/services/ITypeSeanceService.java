package com.ensah.core.services;

import com.ensah.core.bo.TypeSeance;

import java.util.List;

public interface ITypeSeanceService {

    public List<TypeSeance> getAllTypes();
	public TypeSeance getTypeSeanceById(Long idTypeSeance);

}
