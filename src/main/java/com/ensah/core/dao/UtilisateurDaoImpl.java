package com.ensah.core.dao;


import com.ensah.core.bo.Utilisateur;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class UtilisateurDaoImpl extends HibernateSpringGenericDaoImpl<Utilisateur, Long> implements IUtilisateurDao{

//	public UtilisateurDaoImpl(Class<Utilisateur> pPersistentClass) {
//		super(pPersistentClass);
//		// TODO Auto-generated constructor stub
//	}
	public UtilisateurDaoImpl() {
		super(Utilisateur.class);
	}

}
