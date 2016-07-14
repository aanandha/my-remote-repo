package com.flp.ems.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validate {
	
	private static Pattern emailNamePtrn = Pattern.compile(
		    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		     
		    public static boolean validateEmailAddress(String EMailid){
		         
		        Matcher mtch = emailNamePtrn.matcher(EMailid);
		        if(mtch.matches()){
		            return true;
		        }
		        return false;
		    }
    		
    		public static boolean validatePhoneNumber(String PhoneNo) {
    	        
    	        if (PhoneNo.matches("\\d{10}")) return true;
    	        
    	        else if(PhoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
    	        
    	        else if(PhoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
    	        
    	        else if(PhoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
    	   
    	        else return false;
    	         
    	    }
    		 private static Pattern dateFrmtPtrn =
    		            Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
    		     
    		    public static boolean validateDateFormat(String dob){
    		         
    		        Matcher mtch = dateFrmtPtrn.matcher(dob);
    		        if(mtch.matches()){
    		        	
    		            return true;
    		            
    		        }
    		        
    		        return false;
    		    }
    		    public boolean validatename(String Name){
    		        String pattern= "^[a-zA-Z0-9]*$";
    		            if(Name.matches(pattern)){
    		                return true;
    		            }
    		            return false;   
    		    }
    		
}

