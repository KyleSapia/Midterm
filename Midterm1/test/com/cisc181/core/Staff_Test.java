package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList<Staff> myList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() throws PersonException {
		myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,30000.00,new Date(2003,1,1),eTitle.MR));
		myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,40000.00,new Date(2003,1,1),eTitle.MR));
		myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,20000.00,new Date(2003,1,1),eTitle.MR));
		myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,25000.00,new Date(2003,1,1),eTitle.MR));
		myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,35000.00,new Date(2003,1,1),eTitle.MR));
	}
	
	@Test
	public void test() {
		int count = 0;
		for (Staff staff: myList) {
			count += staff.getSalary();
		}
		int avg = count / 5;
		assertEquals(30000,avg);
	}
	public void numberTest() throws PersonException {
		try {
			myList.add(new Staff("John","Doe","Smith",new Date(1999,1,1),
				"1 Apple Street","631-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,30000.00,new Date(2003,1,1),eTitle.MR));
		}
		catch (PersonException e) {
			System.out.print(e.getPerson().getPhone());
		}
	}
	public void birthTest() throws PersonException {
		try {
			myList.add(new Staff("John","Doe","Smith",new Date(1699,1,1),
				"1 Apple Street","(631)-111-1234","JDoe@udel.edu",
				"Mon.,Tues. 1-3pm",2,30000.00,new Date(2003,1,1),eTitle.MR));
		}
		catch(PersonException e) {
			System.out.print(e.getPerson().getPhone());
		}
	}

}
