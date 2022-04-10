package com.ensah.core.dao;

import com.ensah.core.bo.Notification;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class NotificationDaoImpl extends HibernateSpringGenericDaoImpl<Notification , Long> implements INotificationDao  {

	public NotificationDaoImpl( ) {
		super(Notification.class);
		// TODO Auto-generated constructor stub
	}

}
