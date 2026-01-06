package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReadLineByLine {
	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("welcome.txt");
			fr.write("Welcome this is my Nageshwar file\n");
			fr.write("This is second line\n");
			fr.write("This is third line in this file\n");
			
			fr.close();
			
			BufferedReader br =new BufferedReader( new FileReader("welcome.txt"));
			String line;
			while((line =br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
