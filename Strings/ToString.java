package Strings;

public class ToString {
	
	
	/*
	 * toString() is the method of Object class. This method returns a string that
	 * is the representation of the object, which contain name of the class of which
	 * the object is an instance. The returned string is in the following form:-
	 * getClass().getName() + '@' + Integer.toHexString(hashCode())
	 * 
	 * 
	 * hashCode() is the method of Object class. This method returns a hash code value for the object. This method is supported for 
	 * the benefit of hash tables such as those provided by HashMap.
	 */


	static int max_num = 100;    
    int num;   
    // Constructor   
    ToString()   
    {   
        num = max_num;   
        max_num++;   
    }   
    
    // Driver code   
    public static void main(String args[])   
    {   
    	ToString s = new ToString();    
        System.out.println(s.toString());   
    }    

}
