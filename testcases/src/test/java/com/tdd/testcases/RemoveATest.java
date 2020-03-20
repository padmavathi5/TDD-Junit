package com.tdd.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveATest {
/*
 * ABCD=>BCD
 * AACD=>CD
 * BACD=>BCD
 * BBAA=>BBAA
 * AABAA=>BAA
 * AA=>"
 * empty string=>""
 */
	@Test
	void testcase1() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("ABCD");
		assertEquals("BCD",actual);
	}
	@Test
	void testcase2() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("AACD");
		assertEquals("CD",actual);
	}
	@Test
	void testcase3() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("BACD");
		assertEquals("BCD",actual);
	}
	@Test
	void testcase4() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("BBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testcase5() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("AABBAA");
		assertEquals("BBAA",actual);
	}
	@Test
	void testcase6() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("AA");
		assertEquals("",actual);
	}
	@Test
	void testcase7() {
		RemoveA obj=new RemoveA();
		String actual=obj.removing("");
		assertEquals("",actual);
	}

}
