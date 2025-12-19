import java.util.*;

public class MultiToOneDimension{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j] = sc.nextInt();
		
		int linearArr[] = new int[row*col];
		
		int cnt =0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				linearArr[cnt] = arr[i][j];
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(linearArr));
	}
}