package homework2;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//7
public class G_SortName {
	public static void main(String[] args) throws FileNotFoundException {
		// creates a new file for sorted names.
		File sortedRandomNames = new File("namesList.txt");
		PrintWriter sortedRandomNamesWriter = new PrintWriter(sortedRandomNames);

		// creates a file called randomPeople.txt
		File existingRandomNames = new File("randomPeople.txt");
		Scanner existingRandomNamesScan = new Scanner(existingRandomNames);
		
		//creates a temporary file to hold the sorted names
		File temporaryArray = new File("temporaryList.txt");
		PrintWriter temporaryArrayWriter = new PrintWriter(temporaryArray);
		Scanner temporaryScan = new Scanner(temporaryArray);
		
		// creates three arrays with length of 1000.
		String[] randomNames = new String[1000];
		String[] firstNames = new String[1000];
		String[] lastNames = new String[1000];
		
		// inputs each firstname and lastname in file randomPeople.txt into their respective arrays.
		for (int i = 0; i < 1000; i++) {
			firstNames[i] = existingRandomNamesScan.next();
			lastNames[i] = existingRandomNamesScan.next();
		}
		
		// inputs the lastname and firstname into randomNames array.
		//prints the names into the temporary file.
		for (int i = 0; i < randomNames.length; i++) {
			randomNames[i] = lastNames[i] + " " + firstNames[i];
		}
		
		//sorts randomNames
		Arrays.sort(randomNames);
		
		//prints the contents in randomNames into the temporary file.
		for (int i = 0; i < randomNames.length; i++) {
			temporaryArrayWriter.println(randomNames[i]);
			temporaryArrayWriter.flush();
		}
		temporaryArrayWriter.close();
		
		//updates lastNames and firstNames array from the temporary file
		for(int i = 0; i < 1000; i++) {
			lastNames[i] = temporaryScan.next();
			firstNames[i] = temporaryScan.next();
			
		}
		//swaps the full name so its first name first then last name.
		//Stores it into randomNames
		//prints the sorted-by-lastname array into namesList.txt file
		for (int i = 0; i < randomNames.length; i++) {
			randomNames[i] = firstNames[i] + " " + lastNames[i];
			sortedRandomNamesWriter.println(randomNames[i]);
		}
		//checks for duplicate names.
		int duplicateName = 0;
		int uniqueName = 1000;
		for (int i = 0; i < randomNames.length; i++) {
			for (int j = i + 1; j < randomNames.length; j++) {
				if (randomNames[j].equals(randomNames[i])) {
					duplicateName++;
					
				}
			}
		}
		uniqueName = uniqueName - duplicateName;
		//prints out into the file the total unique names.
		sortedRandomNamesWriter.println("-------------------------" + "\n" + "Number of unique names: " + (uniqueName) + "\n" + "-------------------------");
		sortedRandomNamesWriter.flush();
		sortedRandomNamesWriter.close();
	}

}
