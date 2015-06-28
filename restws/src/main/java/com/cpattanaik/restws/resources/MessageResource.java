package com.cpattanaik.restws.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cpattanaik.restws.model.Message;
import com.cpattanaik.restws.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService ms =  MessageService.getInstance();
	
    @GET 
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Message> getJsonMessages(@QueryParam("year") int year,
										 @QueryParam("start") int start,
										 @QueryParam("size") int size)
										 {
    	if(year > 0){
    		return ms.getAllMessages(year);
    	}
    	
    	if(start > 0  && size > 0){
    		return ms.getAllMessages(start, size);
    	}	
    	
		return ms.getAllMessages();
	}


	@GET 
    @Path("/json/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
	public Message getJsonMessage(@PathParam("messageId") long id) throws Exception{
    	return ms.getMessages(id);
	}
	
	@DELETE
    @Path("/json/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message deleteJsonMessage(@PathParam("messageId") long id) throws Exception{
    	return ms.getMessages(id);
	}
	
	@PUT 
    @Path("/json/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message putJsonMessage(@PathParam("messageId") long id) throws Exception{
    	return ms.getMessages(id);
	}
	
	@POST 
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postJsonMessage(Message msg){
    	return ms.postMessages(msg);
	}
    
    
    @GET 
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
	public List<Message> getXmlMessage(){
		return ms.getAllMessages();
	}	
    
//    @Path("/{messageId}/Commnets")
//    public CommnetResource abcd(){
//    	return new CommnetResource();
//    }
}
