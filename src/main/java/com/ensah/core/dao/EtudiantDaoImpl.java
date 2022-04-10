package com.ensah.core.dao;

import com.ensah.core.bo.Etudiant;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class EtudiantDaoImpl extends HibernateSpringGenericDaoImpl<Etudiant ,Long> implements IEtudiantDao {

	public EtudiantDaoImpl() {
		super(Etudiant.class);
		// TODO Auto-generated constructor stub
	}

}
