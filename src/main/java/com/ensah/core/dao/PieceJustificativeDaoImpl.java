package com.ensah.core.dao;

import com.ensah.core.bo.PieceJustificative;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class PieceJustificativeDaoImpl extends HibernateSpringGenericDaoImpl<PieceJustificative , Long> implements IPieceJustificativeDao {

	public PieceJustificativeDaoImpl( ) {
		super(PieceJustificative.class);
		// TODO Auto-generated constructor stub
	}

}
