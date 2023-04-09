package fileReaderPrograms;

import java.util.Scanner;

import java.io.File;
import java.io.PrintWriter;

public class VersionOneFileReader {
	public static void main (String [] args)  {
		Scanner text = new Scanner(System.in);
		PrintWriter prtout = null;
	
		try {
			File testFile = new File("TestTextFile.txt");
			prtout = new PrintWriter(testFile);
			
			prtout.println("Hello text to file writing world!");
			System.out.println("What other messages would you like to input in the text file?");
			
			for (int i = 0; i <= 10; i++) {
				String messages = text.nextLine();
				prtout.println(messages);
				prtout.flush();
				
			}
			
		System.out.println("Thank you for using the editor.");
		
			}
		catch (Exception e) {
			System.err.println(e);
		}
		
		}
	}


