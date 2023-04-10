package homework2;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
//6
public class F_WriteName {
	public static void main (String [] args) throws FileNotFoundException {
		//creates a file called firstNames.txt
		File firstNameContents = new File("firstNames.txt");
		Scanner firstNameScanner = new Scanner(firstNameContents);
		//creates an array that stores all the firstnames in firstNames.txt file.
		int firstNameIndex = 0;
		String[] firstNameArray = new String [100];		
		while (firstNameScanner.hasNext()) {
			firstNameArray[firstNameIndex] = firstNameScanner.next();
			firstNameIndex++;	
		}
		System.out.println();
		//creates a file called lastNames.txt
		File lastNameContents = new File("lastNames.txt");
		Scanner lastNameScanner = new Scanner(lastNameContents);
		//creates an array that stores all the lastnames in lastNames.txt.
		int lastNameIndex = 0;
		String [] lastNameArray = new String [100];
		while (lastNameScanner.hasNext()) {
			lastNameArray[lastNameIndex] = lastNameScanner.next();
			lastNameIndex++;
		}
		//creates a file called randomPeople.txt that stores random full names. (firstname + lastname).
		File fullNames = new File("randomPeople.txt");
		PrintWriter fullNameWriter = new PrintWriter(fullNames);
		String[] fullNameArray = new String [1000];
		for (int i = 0; i < 1000; i++) {
			firstNameIndex = 0 + (int)(Math.random() * 100);
			lastNameIndex = 0 +(int)(Math.random() * 100);
			fullNameArray[i] = firstNameArray[firstNameIndex] + " " + lastNameArray[lastNameIndex];
			fullNameWriter.println(fullNameArray[i]);
			fullNameWriter.flush();
		}
		fullNameWriter.close();
	}

}
