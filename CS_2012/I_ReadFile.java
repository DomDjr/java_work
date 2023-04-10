package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//9
public class I_ReadFile {
	public static void main (String [] args) throws FileNotFoundException {
		//asks the user to input a file
		Scanner userInput = new Scanner(System.in);
		System.out.println("What file would you like to analyze?");
		String fileChoice = userInput.nextLine();
		File userFile = new File(fileChoice);
		//prints the chosen file
		System.out.println("-----------------------------------");
		System.out.println("Anaylyzing File: " + userFile);
		System.out.println("-----------------------------------");
		//calls the FileReader method
		FileReader(userFile);
	}
	//computes the total characters, lines, words.
	public static void FileReader(File chosenFile) throws FileNotFoundException {
		Scanner fileScan = new Scanner(chosenFile);
		
		int characterCount = 0;
		int lineCount = 0;
		int wordCount = 0;
		int lengthOfSplit;
		String characterScan;
		while (fileScan.hasNext()) {
			characterScan = fileScan.nextLine();
			//counts the total lines
			lineCount++;
			if (!characterScan.isEmpty()) {
				//counts the total characters
				characterCount = characterScan.length() + characterCount;
				//splits the text line into strings of words
				String riddingSpaces = characterScan.trim();
				String [] splittingLine = riddingSpaces.split(" ");
				lengthOfSplit = splittingLine.length;
				//counts the total words
				wordCount = wordCount + lengthOfSplit;
			}
		}
		//prints the total characters, lines, and words.
		System.out.print("Total characters: ");
		System.out.println(characterCount);
		
		System.out.print("Total lines: ");
		System.out.println(lineCount);
		
		System.out.print("Total words: ");
		System.out.println(wordCount);
	}






}
