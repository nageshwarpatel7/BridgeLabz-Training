import java.util.*;

class MeanHeight{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double height[] = new double[11];
		
		System.out.print("Enter height of 11 players: ");
		double sumHeight=0;
		for(int i=0;i<11;i++){
			height[i] = sc.nextDouble();
			sumHeight+= height[i];
		}
		
		double meanHeight = sumHeight/11;
		System.out.println("Mean height of players in football team is: "+meanHeight);
	}
}