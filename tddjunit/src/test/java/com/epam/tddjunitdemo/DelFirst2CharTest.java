package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DelFirst2CharTest {
	/*
	 * 1.A at 1stposition:"ABCD"=>"BCD" -success
	 * 2.2 A's at both positions:"AACD"=>"CD"-success
	 * 3.A at 2ndposition:"BACD"=>"BCD"-success
	 * 4.No A at any position:"BBAA"=>"BBAA"-success
	 * 5.empty char:"" =>""-success
	 * */
	DeleteACharacter ob;
	
	@BeforeEach
	void setUp()
	{
		 ob=new DeleteACharacter();
	}

	@Test
	void oneAtest() {
		
		assertEquals("BCD",ob.deleteA("ABCD"));
	}
	@Test
	void twoAtest() {
		
		
		assertEquals("CD",ob.deleteA("AACD"));
	}
	@Test
	void oneAAt2positiontest() {
		
		
		assertEquals("BCD",ob.deleteA("BACD"));
	}
	@Test
	void noAAtAnypositiontest() {
		
	
		assertEquals("BBAA",ob.deleteA("BBAA"));
	}
	@Test
	void emptyString() {
		
		
		assertEquals("",ob.deleteA(""));
	}
	
	
	

}
