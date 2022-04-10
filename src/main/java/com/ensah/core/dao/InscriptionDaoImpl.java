package com.ensah.core.dao;

import com.ensah.core.bo.Inscription;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class InscriptionDaoImpl extends HibernateSpringGenericDaoImpl<Inscription ,Long> implements IInscriptionDao {

	public InscriptionDaoImpl() {
		super(Inscription.class);
		// TODO Auto-generated constructor stub
	}

}
