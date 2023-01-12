package com.xworkz.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	    
	@Value("10")
	private int id;
	private String name;
	private String ownerName;
	@Value("English")
	private String language;
	private double price;
	
	public NewsPaper( @Qualifier("name")String name,@Qualifier("name") String ownerName ){
		super();
		this.name = name;
		this.ownerName = ownerName;
	}
	
	@Autowired
	@Qualifier("pricee")
	public void setPrice(double price)
	{
		this.price=price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}
	
	
}