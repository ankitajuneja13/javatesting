package com.epam.tddJunitTask;

public class Removefirst2A {

	public Object remove(String string) {
	    String res=string;
	    char firstpos='\0';
	    char secondpos='\0';
	    
	    int n=string.length();
	    if(n==1)
	    {
	    	firstpos=string.charAt(0);
	    	if(firstpos=='A')
	    	{
	    		res="";
	    	}
	    }
	    else
	    {
	    	firstpos=string.charAt(0);
	    	secondpos=string.charAt(1);
	    	if(firstpos=='A' && secondpos=='A')
	    	{
	    		res=string.substring(2,n);
	    	}
	    	else if(firstpos=='A')
	    	{
	    		res=string.substring(1,n);
	    	}
	    	else if(secondpos=='A')
	    	{
	    		res=string.substring(0,1)+string.substring(2,n);
	    	}
	    }
		return res;
	}

}
