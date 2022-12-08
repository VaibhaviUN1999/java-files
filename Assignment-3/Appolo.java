package com.xworkz.hasa;

import com.xworkz.hasa.constant.Gender;

public class Appolo  {

	//boolean isPatientAdded;
	int index;
	Patient[] patients;
	Patient[] newpatients;
	public Appolo(int size)
	{
		patients=new Patient[size];
	}

	public boolean added(Patient patient)
	{
		boolean isPatientAdded=false;
		//	System.out.println("not added");
		if(patient != null)
		{
			System.out.println("adding");

			patients[index++]=patient;
			isPatientAdded=true;
		}
		return isPatientAdded;
	}

	public void getPatient()
	{
		for(int j=0 ; j < patients.length ; j++)
		{

			System.out.println(this.patients[j].getName());
			System.out.println(this.patients[j].getAge());
			System.out.println(this.patients[j].getGender());
			System.out.println(this.patients[j].getAddress());
			System.out.println("================================");

		}
	}
	public void getPatientByName(String name)
	{
		System.out.println("inside get patient name");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}

		}
	}
	public void getPatientByAge(int age)
	{
		System.out.println("inside get patient age");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getAge()==age)
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}}


	}
	public void getPatientByAddress(String address)
	{
		System.out.println("inside get patient address");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getAddress().equals(address))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}

		}
	}
	public void getPatientByGender(Gender gender)
	{
		System.out.println("inside get gender  ");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getGender().equals(gender))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
			}}

	}
	public void getPatientNamebyGender(Gender gender)
	{
		System.out.println("inside get patient name by gender");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getGender().equals(gender))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getName());

			}
		}

	}
	public void getGenderByPatientName(String name)
	{
		System.out.println("inside get gender by name ");
		for (int i = 0; i < patients.length; i++) {

			if(patients[i].getName().equals(name))
			{
				System.out.println("patient found ");
				System.out.println(this.patients[i].getGender());

			}

		}
	}


	public boolean updateByPatientName(String name,String patientAdsress)
	{
		boolean isUpdate=false;
		System.out.println("isupdate patiemnt name");

		for (int i = 0; i < patients.length; i++) 
		{

			if(patients[i].getName().equals(name))
			{
				System.out.println("patient name is mathed..process address is updating ");
				patients[i].setAddress(patientAdsress);
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				isUpdate=true;

			}
			else {
				System.out.println("patien name not found");
			}

		}
		return isUpdate;
	}
	public boolean updateByPatientName(String name,int age)
	{
		boolean isUpdate=false;
		System.out.println("isupdate patiemnt name");

		for (int i = 0; i < patients.length; i++) 
		{

			if(patients[i].getName().equals(name))
			{
				System.out.println("patient name is mathed..process address is updating ");
				patients[i].setAge(age);
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				isUpdate=true;

			}
			else 
			{
				System.out.println("patien name not found");
			}

		}
		return isUpdate;
	}

	public boolean deletByPatientName(String name)
	{
		boolean isUpdate=false;
		newpatients=new Patient[patients.length-1];
		System.out.println("isupdate patiemnt name");

		for (int i = 0,k=0; i < newpatients.length; i++) 
		{

			if(!patients[i].getName().equals(name))
			{
				System.out.println("patient name is mathed..process address is updating ");
				newpatients[k++]=patients[i];
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				isUpdate=true;

			}
		}
		return isUpdate;
	}
	public void getpaitentName()
	{
		for (int i = 0; i < newpatients.length; i++)
		{
			System.out.println(this.patients[i].getName());
			System.out.println(this.patients[i].getAge());
			System.out.println(this.patients[i].getGender());
			System.out.println(this.patients[i].getAddress());

		}
	}

	public boolean deletByPatientName(int age)
	{
		boolean isUpdate=false;
		newpatients=new Patient[patients.length-1];
		System.out.println("isupdate patiemnt name");

		for (int i = 0,k=0; i < newpatients.length; i++) 
		{

			if(!patients[i].getName().equals(age))
			{
				System.out.println("patient name is mathed..process address is updating ");
				newpatients[k++]=patients[i];
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				isUpdate=true;

			}
		}
		return isUpdate;
	}
	public void getpaitenAge()
	{
		for (int i = 0; i < newpatients.length; i++)
		{
			System.out.println(this.patients[i].getName());
			System.out.println(this.patients[i].getAge());
			System.out.println(this.patients[i].getGender());
			System.out.println(this.patients[i].getAddress());

		}
	}
	public boolean deletByPatienGender(Gender gender)
	{
		boolean isUpdate=false;
		newpatients=new Patient[patients.length-1];
		System.out.println("isupdate patiemnt name");

		for (int i = 0,k=0; i < newpatients.length; i++) 
		{

			if(!patients[i].getName().equals(gender))
			{
				System.out.println("patient name is mathed..process address is updating ");
				newpatients[k++]=patients[i];
				System.out.println(this.patients[i].getName());
				System.out.println(this.patients[i].getAge());
				System.out.println(this.patients[i].getGender());
				System.out.println(this.patients[i].getAddress());
				isUpdate=true;

			}
		}
		return isUpdate;
	}
	public void getpaitengender()
	{
		for (int i = 0; i < newpatients.length; i++)
		{
			System.out.println(this.patients[i].getName());
			System.out.println(this.patients[i].getAge());
			System.out.println(this.patients[i].getGender());
			System.out.println(this.patients[i].getAddress());

		}
	}

}

