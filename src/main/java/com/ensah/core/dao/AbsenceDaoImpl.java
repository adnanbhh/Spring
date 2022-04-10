package com.ensah.core.dao;

import com.ensah.core.bo.Absence;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class AbsenceDaoImpl extends HibernateSpringGenericDaoImpl<Absence ,Long> implements IAbsenceDao{

	public AbsenceDaoImpl() {
		super(Absence.class);
	}

}
