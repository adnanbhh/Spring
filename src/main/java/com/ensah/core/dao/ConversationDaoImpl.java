package com.ensah.core.dao;

import com.ensah.core.bo.Conversation;
import com.ensah.genericdao.HibernateSpringGenericDaoImpl;

public class ConversationDaoImpl extends HibernateSpringGenericDaoImpl<Conversation ,Long> implements IConversationDao {

	public ConversationDaoImpl() {
		super(Conversation.class);
		// TODO Auto-generated constructor stub
	}

}
