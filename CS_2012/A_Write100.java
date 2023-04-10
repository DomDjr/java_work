package homework2;

import java.io.File;
import java.io.PrintWriter;
//#1
public class A_Write100 {
	public static void main (String [] args) {
		//creates a file called numbersRow.txt
		
		try {
			String textFile = "numbersRow.txt";
			File rowFile = new File(textFile);
			PrintWriter prtout = new PrintWriter(rowFile);
			
			//prints 100 random numbers between 0 to 1000 on the same line into numbersRow.txt
			for (int i = 0; i <= 100; i ++) {
				prtout.print(0 + (int)(Math.random() * 1001) + " ");
				prtout.flush();
			}
			prtout.close();
		
		}
		
		catch (Exception e) {
			System.err.println(e);
		}
	
	
	
	
	}
}
  