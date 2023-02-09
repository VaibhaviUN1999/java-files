package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="hotel_table")
@Data
public class ShantiDto {
	
	@Column(name= "h_namee")
	private String hname;
	@Column(name= "h_onamee")
	private String oname;
	@Column(name= "h_ownamee")
	private String owname;
	@Column(name= "h_marriedd")
	private boolean married;
	@Column(name= "h_sincee")
	@Id
	private int since;
	

}
