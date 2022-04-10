package com.ensah.core.dao;

import com.ensah.core.bo.Filiere;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class FiliereDaoImpl extends HibernateSpringGenericDaoImpl< Filiere ,Long> implements IFiliereDao {

	public FiliereDaoImpl() 
	{
		super(Filiere.class);
		// TODO Auto-generated constructor stub
	}

}
