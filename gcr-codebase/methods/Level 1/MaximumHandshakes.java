import java.util.Scanner;

class MaximumHandshakes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of students: ");
		int stu = sc.nextInt();
		
		int ans = maxHandShake(stu);
		System.out.println("Maximum possible handshakes are: "+ans);
	}
	public static int maxHandShake(int n){
		return (n*(n-1))/2;
	}
}