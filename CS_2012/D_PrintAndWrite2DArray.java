package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//4
public class D_PrintAndWrite2DArray {
	public static void main (String [] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		//creates a 2D array and asks for the amount of rows and columns from the user.
		int rows;
		int columns;
		System.out.println("How many rows should the 2D array have?");
		rows = userInput.nextInt();
		while (rows < 5 || rows > 10) {
			System.out.println("Sorry the minimum rows is 5 and the maximum is 10. Please input another integer");
			rows = userInput.nextInt();
		}
		
		System.out.println("How many columns should the 2D array have?");
		columns = userInput.nextInt();
		while (columns < 5 || columns > 10) {
			System.out.println("Sorry the minimum column is 5 and the maximum is 10. Please input another integer");
			columns = userInput.nextInt();
		}
		int [][] twoDArray = new int [columns][rows];
		//assigns a random integer from 100 to 999 to each index of the array.
		for (int i = 0; i < twoDArray.length; i ++) {
			System.out.println();
			for (int j = 0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = 100 + (int)(Math.random() * 900);
				System.out.print(twoDArray[i][j] + " ");
				
			}
		}
		//creates a file and copies the array into the txt file.
		String twoDArrayCopy = "randomTable.txt";
		File twoDArrayCopyFile = new File(twoDArrayCopy);
		
		PrintWriter twoDArrayContent = new PrintWriter(twoDArrayCopyFile);
		for (int i = 0; i < twoDArray.length; i ++) {
			twoDArrayContent.println();
			twoDArrayContent.flush();
			for (int j = 0; j < twoDArray[i].length; j++) {
				twoDArrayContent.print(twoDArray[i][j] + " ");
				twoDArrayContent.flush();
			}
		}
		twoDArrayContent.close();
	
	}

}
