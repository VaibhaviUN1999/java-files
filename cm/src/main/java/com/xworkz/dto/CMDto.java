package com.xworkz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cm_table")
@NoArgsConstructor
public class CMDto {
	
	@Id
	@Column(name="c_id")
	private int id;
	
	@NotNull(message="cm name cannot be null or blank")
	@Size(min = 3,max=20,message="CM Should be more 3 and less than 20")
	@Column(name="c_name")
	private String name;
	
	@NotNull(message="PARTY cannot be null or blank")
	@Column(name="c_parties")
	private String parties;
	
	@NotNull(message="State cannot be null or blank")
	@Column(name="c_state")
	private String state;
	
	@NotNull(message="tenure cannot be null or blank")
	@Column(name="c_tenure")
	private Integer tenure;
	
	@NotNull(message="portfolio cannot be null or blank")
	@Column(name="c_portfolio")
	private String portfolio;
	
	

}
