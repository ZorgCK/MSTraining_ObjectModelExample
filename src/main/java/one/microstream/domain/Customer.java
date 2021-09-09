package one.microstream.domain;

import java.util.UUID;


public class Customer
{
	private String	id	= UUID.randomUUID().toString();
	
	private Address	address;
}
