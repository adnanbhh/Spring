package com.ensah.core.dao;

import com.ensah.core.bo.CadreAdministrateur;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class CadreAdministrateurDaoImpl extends HibernateSpringGenericDaoImpl<CadreAdministrateur ,Long> implements ICadreAdministrateurDao {

	public CadreAdministrateurDaoImpl() {
		super(CadreAdministrateur.class);
		// TODO Auto-generated constructor stub
	}

}
