package com.epam.tddJunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RemoveATest {

   Removefirst2A removeA;
	
	@BeforeEach
	void setup()
	{
		removeA=new Removefirst2A();
	}
	@Test
	void test2charsA() {
		
		
		assertEquals("BC",removeA.remove("AABC"));
	}
	
	@Test
	void test4charsA() {
		
		assertEquals("BAA",removeA.remove("AABAA"));
	}
	
	@Test
	void test1charA() {
		
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void test0charA() {
		
		assertEquals("BCDE",removeA.remove("BCDE"));
	}

}
