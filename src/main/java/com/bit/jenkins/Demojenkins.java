package com.bit.jenkins;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Demojenkins {
	
	@Test
	
	public void test1() {
		
	
	ArrayList<Object> ls=new ArrayList<Object>();
	
	ls.add("nazmul");
	ls.add("sheikh");
	ls.add(10);
	ls.add(22.22);
	ls.add(10);
	ls.add(null);
	
	System.out.println(ls);
	Iterator<Object>xyz=ls.iterator();
	
	while(xyz.hasNext()) {
	System.out.println(xyz.next());
	
	
	}
	
	}

}
