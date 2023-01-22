package com.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NonNull
public abstract  class AbstractAuditDTO  implements Serializable{
	
	
	private String createdBy="Vaibhavi";
	private LocalDateTime createdDate;
	private String updatedBy="Sanchu";
	private LocalDateTime updatedDate;

}
