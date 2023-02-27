package com.xworkz.entity;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.Data;

	@Data
	@Entity
	@Table(name = "biscuit_table")
	public class BiscuitEntity {

		@Id
		@Column(name = "b_id")
		private int id;
		
		@Column(name = "b_company")
		private String company;
		
		@Column(name = "b_name")
		private String name;
		
		@Column(name = "b_cost")
		private Double cost;
		
		@Column(name = "b_type")
		private String type;
		
		@Column(name = "b_color")
		private String color;
	}


