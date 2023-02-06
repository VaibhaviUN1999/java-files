package com.xworkz.dto;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Educationdto {
private String collegeName;
private String collegeAddress;
private String degree;
private String course;
private int duration;
private int joinedYear;
private int CompletedYear;
private float CGPA;
private int numberOfBacklogs;
private boolean isBacklogsCleared;
}
