package org.meb.play.sample.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.meb.play.sample.ejb.SampleService;

public class RemoteClient {

	private static String address = "ejb:sample-app/sample-ejb/SampleServiceBean!org.meb.play.sample.ejb.SampleService";

	public static void main(String[] args) throws NamingException {
		InitialContext context = new InitialContext();
		SampleService ss = (SampleService) context.lookup(address);
		System.out.println("counter: " + ss.getCounter());
	}
}
