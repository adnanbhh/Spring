package com.ensah.core.dao;

import com.ensah.core.bo.Enseignant;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class EnseignantDaoImpl extends HibernateSpringGenericDaoImpl<Enseignant ,Long> implements IEnseignantDao {

	public EnseignantDaoImpl() {
		super(Enseignant.class);
		// TODO Auto-generated constructor stub
	}


}
