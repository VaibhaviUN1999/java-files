package com.xworkz.dto;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mobiledto {
private String mobileName;
private int numberOfApllications;
private String mostUsedApllication;
private LocalDate mobileBroughtDate;
private int internalStorage;
}
