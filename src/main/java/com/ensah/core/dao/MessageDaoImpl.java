package com.ensah.core.dao;

import com.ensah.core.bo.Message;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class MessageDaoImpl extends HibernateSpringGenericDaoImpl<Message , Long> implements IMessageDao {

	public MessageDaoImpl() {
		super(Message.class);
	}

}
