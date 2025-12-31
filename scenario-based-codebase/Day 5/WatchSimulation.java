import java.util.*;

public class WatchSimulation{
	public static void main(String args[]){
		
		for(int hour=0;hour<24;hour++){
			
			for(int min = 0;min<60;min++){
				if(hour==13 && min==1)
					break;
				if(hour<10){
					if(min<10)
						System.out.println("Time: 0"+hour+" : 0"+min);
					else
						System.out.println("Time: 0"+hour+" : "+min);
				}
				else{
					if(min<10)
						System.out.println("Time: "+hour+" : 0"+min);
					else
						System.out.println("Time: "+hour+" : "+min);
				}
			}
			if(hour==13)
				break;
		}
	}
}