package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.*;
import org.junit.Test;

public class PersonException extends Exception {
	private Person person;
	
	public PersonException(Person person){
		super();
		this.person=person;
	}
	
	@Test(expected=PersonException.class)
	public void TestinvalidDOB() throws PersonException{
		Staff Azeez=new Staff(com.cisc181.eNums.eTitle.MR);
		Calendar c=Calendar.getInstance();
		c.add(Calendar.YEAR, 2000);
		Date wrongDOB= c.getTime();
		try{ 
			Azeez.setDOB(c.getTime());
		}catch (Exception e){
			System.out.println("Date invalid");
			System.out.println("Caught Exception");
			e.printStackTrace();
		}
	}
	@Test(expected=PersonException.class)
	public void TestinvalidPhoneNum() throws PersonException{
		Staff Ashley=new Staff(com.cisc181.eNums.eTitle.MS);
		try{
			Ashley.setPhone("356987658");
		}catch (Exception e){
			System.out.println("Phone Number Invalid");
			System.out.println("Caught Exception");
			e.printStackTrace();
		}
	}
}