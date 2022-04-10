package com.ensah.core.dao;

import com.ensah.core.bo.Compte;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;


public class CompteDaoImpl extends HibernateSpringGenericDaoImpl<Compte, Long> implements ICompteDao {

	public CompteDaoImpl() {
		super(Compte.class);
	}

    @Override
    public Compte findByUsername(String username) {
        return null;
    }
}
