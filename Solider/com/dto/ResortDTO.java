package com.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component

public class ResortDTO extends AbstractAuditDTO{
	
	@NotNull
	@NotBlank
	@Size(min=3,max=100)
	String name;
	@Min(0)
	@Max(1000)
	int cost;
	@NonNull
	@NotBlank
	@Size(min=3,max=100)
	String country;

}
