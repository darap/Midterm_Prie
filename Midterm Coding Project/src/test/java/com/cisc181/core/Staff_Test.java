package com.cisc181.core;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static ArrayList<Staff> StffList= new ArrayList<Staff>();
	@BeforeClass
	public static void setup() throws Exception{
		//Date deprecated when entered?
		StffList.add(new Staff("Bob","Nile","Charley", new Date(0), "125 Malley Road", "(302)-567-8955", "char133@gmail.com","12 to 8",3,80000.00, new Date(100),eTitle.MR));
		StffList.add(new Staff("Amber","Janey","Cole", new Date(0), "177 Dove Road", "(302)-276-2397", "ambc@gmail.com","5 to 12",4,90000.00, new Date(100),eTitle.MRS));
		StffList.add(new Staff("Ciara","May","Mcqueen", new Date(0), "120 Wayne Drive", "(302)-684-3158","ciaramcq@gmail.com","3 to 5",5,60000.00, new Date(100),eTitle.MS));
		StffList.add(new Staff("John","Newt","Mick", new Date(0), "105 Mallard Lane", "(302)-288-3326", "jmick2@gmail.com","5 to 10",6,50000.00, new Date(100),eTitle.MR));
		StffList.add(new Staff("Sam","Amy","Cullen", new Date(0), "200 Cooley Lane", "(302)-599-1785", "Cullenvamp@gmail.com","10 to 12",7,40000.00, new Date(100),eTitle.MS));
	}
	
	@Test
	public void test() {
		double ttlsal=0.0;
		for (Staff s: StffList){
			ttlsal= ttlsal+ s.getSalary();
		}
		double avsal= (ttlsal/5);
		assertEquals(avsal,64,000);
	}	

}
