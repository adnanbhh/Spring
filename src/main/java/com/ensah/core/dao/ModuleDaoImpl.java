package com.ensah.core.dao;

import com.ensah.core.bo.Module;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class ModuleDaoImpl extends HibernateSpringGenericDaoImpl<Module , Long> implements IModuleDao {

	public ModuleDaoImpl() {
		super(Module.class);
	}

}
