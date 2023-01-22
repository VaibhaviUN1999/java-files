package com.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {
	
	@NotNull
	@NotBlank
	@Size(min=3,max=30,message="Name must be >3  and  <20")
	private String name;
	@Min(0)
	@Max(10000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String country;

}
