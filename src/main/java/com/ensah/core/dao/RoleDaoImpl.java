package com.ensah.core.dao;

import com.ensah.core.bo.Role;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class RoleDaoImpl extends HibernateSpringGenericDaoImpl<Role , Long> implements IRoleDao {

	public RoleDaoImpl() {
		super(Role.class);
		// TODO Auto-generated constructor stub
	}


}
