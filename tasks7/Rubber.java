package com.xworkz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired()
	@Qualifier("name12")
	private String name;
	@Autowired()
	@Qualifier("type12")
	private String type;
	@Autowired()
	@Qualifier("price12")
	private Integer price;
	@Autowired()
	@Qualifier("color12")
	private String color;
	@Autowired()
	@Qualifier("shape12")
	private String shape;
	@Autowired()
	@Qualifier("stolen12")
	private Boolean stolen;
	@Autowired()
	@Qualifier("size")
	private Double size;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
}
