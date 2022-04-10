package com.ensah.core.services.impl;

import com.ensah.core.bo.TypeSeance;
import com.ensah.core.dao.ITypeSeanceDao;
import com.ensah.core.services.ITypeSeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TypeSeanceService implements ITypeSeanceService {

    @Autowired
    private ITypeSeanceDao SeanceDao;


    @Override
    public List<TypeSeance> getAllTypes() {
        return SeanceDao.getAll();
    }


	public TypeSeance getTypeSeanceById(Long idTypeSeance) {
		return SeanceDao.findById(idTypeSeance);
	}
}
