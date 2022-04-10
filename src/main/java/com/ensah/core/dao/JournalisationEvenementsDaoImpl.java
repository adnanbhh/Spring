package com.ensah.core.dao;

import com.ensah.core.bo.JournalisationEvenements;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class JournalisationEvenementsDaoImpl extends HibernateSpringGenericDaoImpl<JournalisationEvenements ,Long> implements IJournalisationEvenementsDao {

	public JournalisationEvenementsDaoImpl() {
		super(JournalisationEvenements.class);
		// TODO Auto-generated constructor stub
	}

}
