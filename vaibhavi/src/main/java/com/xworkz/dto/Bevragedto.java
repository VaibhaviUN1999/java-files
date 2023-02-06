package com.xworkz.dto;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Bevragedto {
private String nameofMostDrinkedBeverage;
private String mostLikedBreverage;
private int numberofTimesBreverageHadinDay;
private double price;
private LocalDate expireDate;
}