package one.microstream.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Company
{
	private String			id			= UUID.randomUUID().toString();
	
	private List<Store>		stores		= new ArrayList<>();
	private List<Customer>	customers	= new ArrayList<>();
	private Address			address;
	
	private List<Book>		books		= new ArrayList<>();
	private List<Author>	authors		= new ArrayList<>();
}
