package com.xworkz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Hardwareshop {
	@Autowired()
	@Qualifier("ide")
	private int id;
	@Autowired()
	@Qualifier("names")
	private String name;
	@Autowired()
	@Qualifier("gstNo11")
	private String gstNo1;
	@Autowired()
	@Qualifier("ownerNames")
	private String ownerName;
	@Autowired()
	@Qualifier("addresss")
	private String address;
	
	@Override
	public String toString() {
		return "Hardwareshop [id=" + id + ", name=" + name + ", gstNo=" + gstNo1 + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
