package com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;

@WebService
public class Hello {
	@WebMethod
	public String tttt(String name) {
		return "Hello, " + name + "\n";
	}

	public static void main(String[] args) {
		Hello hello = new Hello();
		Endpoint.publish("http://localhost:8080/hhhh", hello);
		System.out.print("Server is ready!");
	}
}
