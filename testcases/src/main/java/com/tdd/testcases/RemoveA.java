package com.tdd.testcases;

public class RemoveA {

	public String removing(String string) {
		// TODO Auto-generated method stub
		if(string.length()==0)
			return "";
		if(string.length()==1) {
			if(string.equals("A"))
				return "";
			else
				return string;
		}
		if(string.length()>1) {
		if(string.charAt(0)=='A' && string.charAt(1)=='A')
			return string.substring(2);
		else if(string.charAt(0)!='A' && string.charAt(1)=='A')
			return string.charAt(0)+string.substring(2);
		else if(string.charAt(0)=='A' && string.charAt(1)!='A')
			return string.substring(1);
		else
			return string;
			
		}
		return "";
	}

}
