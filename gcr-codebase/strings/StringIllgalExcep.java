import java.util.*;

public class StringIllgalExcep{
	public static void main(String args[]){
		try{
			illegalExcep(5,4);
		}
		catch(IllegalArgumentException e){
			System.out.print("Exception generated: "+e);
		}
			
	}
	public static void illegalExcep(int st, int ed) throws IllegalArgumentException{
		
		if(st>ed)
			throw new IllegalArgumentException();	
	}
}