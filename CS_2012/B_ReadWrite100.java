package homework2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
//#2
public class B_ReadWrite100 {
	public static void main (String [] args) {
		//creates a String called columnContent and rowContent.
		String columnContent = "numbersColumn.txt";
		String rowContent;
		
		try {
			//creates a new file 
			File columnFile = new File(columnContent);
			PrintWriter prtout = new PrintWriter(columnFile);
			
			File initialFile = new File("numbersRow.txt");
			Scanner fileScan = new Scanner(initialFile);
			
			//prints the numbersColumn into numbersRow file.
			while (fileScan.hasNext()) {
				rowContent = fileScan.next();
				prtout.println(rowContent);
				prtout.flush();
			}
			prtout.close();
		}
		catch (Exception e) {
			System.err.print(e);
			
		}
	
	}
}
