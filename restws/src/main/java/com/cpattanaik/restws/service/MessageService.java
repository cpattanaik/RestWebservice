package com.cpattanaik.restws.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cpattanaik.restws.model.Message;

public class MessageService {
	private Map<Long, Message> map = new HashMap<Long, Message>();
	private static MessageService messageService = new MessageService();
	
	public static MessageService getInstance(){
		return messageService;
	}
	
	public List<Message> getAllMessages(){
		Message m1 =  new Message(1L, "Chandra");
		Message m2 =  new Message(2L, "Madhab");	
		map.put(m1.getId(), m1);
		map.put(m2.getId(), m2);
		
		return new ArrayList<Message>(map.values());
	}

	public Message getMessages(long id) throws Exception {
		Message m = map.get(id);
		if(m == null){
			throw new Exception("DataNotFound");
		}
		return m;
	}

	public Message postMessages(Message msg) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllMessages(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllMessages(int start, int size) {
		// TODO Auto-generated method stub
		return null;
	}
}
