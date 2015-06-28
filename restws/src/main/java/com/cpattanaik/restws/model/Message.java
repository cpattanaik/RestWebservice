package com.cpattanaik.restws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	public Message(){
		
	}
    public Message(long id, String message){
		this.id  = id;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private long id;
	private String message;

}
