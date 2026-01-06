package filehandling;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordInFile {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("welcome.txt"));
			String line;
			int cnt =0;
			Pattern pattern = Pattern.compile("This", Pattern.CASE_INSENSITIVE);
			
			while((line=br.readLine())!=null) {
				Matcher match = pattern.matcher(line);
				
				while(match.find())
					cnt+=1;
			}
			
			System.out.println("given word is present "+cnt+" time in the file");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
