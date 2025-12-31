import java.util.*;

public class OnlineQuizApplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------Online Quiz Application-----------------------------");
		
		String question[] = new String[5];
		String [][] options = new String[5][4];
				
		question[0] = "1) Which of the following is used to define a class in Java?";
		options[0][0] = "a) function";
		options[0][1] = "b) class";
		options[0][2] = "c) define";
		options[0][3] = "d) struct";
		
		question[1] = "2) What does OOP stand for in programming?";
		options[1][0] = "a) Order of Processing";
		options[1][1]= "b) Object Oriented Programming";
		options[1][2] = "c) Open Operation Platform";
		options[1][3] = "d) Original Object Program";
		
		question[2] ="3) Which data structure follows the FIFO (First In, First Out) principle?";
		options[2][0] = "a) Stack";
		options[2][1] = "b) Tree";
		options[2][2] = "c) Queue";
		options[2][3] = "d) Graph";
		
		question[3] = "4) Which symbol is used for single-line comments in Python?";
		options[3][0] = "a) //";
		options[3][1] = "b) /* */";
		options[3][2] = "c) #";
		options[3][3] = "d) --";
		
		question[4] = "5) What is a marker interface in Java?";
		options[4][0] = "a) An interface with only default methods";
		options[4][1] = "b) An interface with only static methods";
		options[4][2] = "c) An interface with no methods";
		options[4][3] = "d) An abstract class";
		
		char[] ans = {'b','b','c','c','c'};
		
		int marks=0;
		
		for(int i=0;i<5;i++){
			System.out.println(question[i]);
			for(int j=0;j<4;j++)
				System.out.println(options[i][j]);
			System.out.print("\nEnter your choice (a,b,c,d): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			System.out.println();
			if(choice ==ans[i])
				marks++;
		}
		
		System.out.println("You obtained: "+marks+" marks");
	}
}