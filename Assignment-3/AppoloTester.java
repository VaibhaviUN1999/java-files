package com.xworkz;

import java.util.Scanner;

import com.xworkz.hasa.Appolo;
import com.xworkz.hasa.Patient;
import com.xworkz.hasa.constant.Gender;

public class AppoloTester {

	public static void main(String[] args) 
	{

		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		Appolo ap=new Appolo(size);
		
		for (int i = 0; i < size; i++) 
		{
			Patient patient=new Patient();
			System.out.println("enter the patient name");
			patient.setName(s.next());
			System.out.println("enter the  patient age");
			patient.setAge(s.nextInt());
			System.out.println("enter the gender");
			patient.setGender(Gender.valueOf(s.next()));
			System.out.println("enter the patient address");
			patient.setAddress(s.next());
	
			ap.added(patient);
			
		}
		ap.getPatient();
//		System.out.println("enter patient name to search");
//		ap.getPatientByName(s.next());
//		
//		System.out.println("enter patient age to search");
//		ap.getPatientByAge(s.nextInt());
//		
//		System.out.println("enter patient address to search");
//		ap.getPatientByAddress(s.next());
//		
//		System.out.println("enter patient gender to search");
//		ap.getPatientByGender(Gender.valueOf(s.next()));
//		
//		System.out.println("enter patient gender to search patient name");
//		ap.getPatientNamebyGender(Gender.valueOf(s.next()));
//		
//		System.out.println("enter patient name to search patient gender");
//		ap.getGenderByPatientName(s.next());
//		System.out.println("enter patient name ");
//		System.out.println(ap.updateByPatientName( s.next(),s.next()));
//		System.out.println("enter patient name ");
//		System.out.println(ap.updateByPatientName( s.next(),s.nextInt()));
		//String name(s.next());
		//ap.getPatient();
//		System.out.println("enter delet patient name ");
//		System.out.println(ap.deletByPatientName( s.next()));
		System.out.println("enter delet patient age ");
		System.out.println(ap.deletByPatientName( s.nextInt()));
		System.out.println("enter delet patient gender ");
		System.out.println(ap.deletByPatienGender( Gender.valueOf(s.next())));
		//2
		//ap.getpaitentName();
		
		
	}

}