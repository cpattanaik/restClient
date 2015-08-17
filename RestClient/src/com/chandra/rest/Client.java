package com.chandra.rest;


import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.ClientResponse;


public class Client {
      
	  public String push(String data) {
	    ClientResponse response = 
	    		ClientFactory.getClient().resource("http://jsonplaceholder.typicode.com/posts/1")
	    		.accept("application/json").get(ClientResponse.class); 
	    		if (response.getStatus() > 201) { 
	    			System.out.println("Failed : HTTP error code : " + response.getStatus());
	    		    return null;
	    		}
	    		System.out.println("Passed : HTTP  code : " + response.getStatus());
	    		return response.getEntity(String.class);
	  }
	  
	  public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException{
		  Message st = new Message("Adriana", "Barrer", 12, 9);
		  ObjectMapper mapper = new ObjectMapper(); 
		  String json = mapper.writeValueAsString(st);
		  Client c = new Client();
		  String s  = c.push(json);
		  System.out.println(s);
		  Message m = mapper.readValue(s, Message.class);
		  System.out.println(m);
	  }
}
