package one.microstream.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Store
{
	private String			id			= UUID.randomUUID().toString();
	
	private List<Sell>		sells		= new ArrayList<>();
	private List<Employer>	employees	= new ArrayList<>();
	private List<Book>		books		= new ArrayList<>();
	
	private Address			address;
}
