package com.ensah.core.dao;

import com.ensah.core.bo.Coordination;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class CoordinationDaoImpl extends HibernateSpringGenericDaoImpl<Coordination ,Long> implements ICoordinationDao {

	public CoordinationDaoImpl() {
		super(Coordination.class);
		// TODO Auto-generated constructor stub
	}

}
