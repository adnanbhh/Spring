package com.ensah.core.dao;

import com.ensah.core.bo.Niveau;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class NiveauDaoImpl extends HibernateSpringGenericDaoImpl<Niveau , Long> implements INiveauDao {

	public NiveauDaoImpl() {
		super(Niveau.class);
	}

}
