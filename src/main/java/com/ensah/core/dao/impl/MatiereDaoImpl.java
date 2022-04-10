package com.ensah.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensah.core.bo.Matiere;
import com.ensah.core.dao.IMatiereDao;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

@Repository
public class MatiereDaoImpl extends HibernateSpringGenericDaoImpl<Matiere, Long> implements IMatiereDao{
	
	public MatiereDaoImpl() {
		super(Matiere.class);
	}
}
