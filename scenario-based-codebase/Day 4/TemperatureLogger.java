import java.util.*;

public class TemperatureLogger{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature of 7 days: ");
		
		double temp[] = new double[7];
		for(int i=0;i<7;i++)
			temp[i] = sc.nextDouble();
		
		System.out.println("Maximum temperature of week: "+maxTemp(temp));
		System.out.println("Average temperature of week: "+avgTemp(temp));
		
	}
	public static double maxTemp(double arr[]){
		double ans = arr[0];
		for(double i: arr)
			if(i>ans)
				ans =i;
			
		return ans;
	}
	public static double avgTemp(double temp[]){
		int n = temp.length;
		double sum = 0;
		
		for(double i:temp)
			sum+=i;
		
		return sum/n;		
	}
}