package com.cpattanaik.restws.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
    private String eMessage;
    private int eId;
    private String docLink;
    
    public ErrorMessage(){
    	
    }
    
    public ErrorMessage(String eMessage, int eId, String docLink){
    	this.eMessage = eMessage;
    	this.eId = eId;
    	this.docLink = docLink;
    }

	public String geteMessage() {
		return eMessage;
	}

	public void seteMessage(String eMessage) {
		this.eMessage = eMessage;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getDocLink() {
		return docLink;
	}

	public void setDocLink(String docLink) {
		this.docLink = docLink;
	}
   
   
    
}
