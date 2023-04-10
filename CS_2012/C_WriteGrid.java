package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//3
public class C_WriteGrid {
	public static void main (String [] args) throws FileNotFoundException {
		//creates a file called numberGrid.txt
		String fileName = "numberGrid.txt";
		File createdFile = new File(fileName);
		
		PrintWriter fileContents = new PrintWriter(fileName);
		//creates a 2D array thats 10 x 10.
		int [][] gridArray = new int [10][10];
		//inputs a random integer from 0 to 20 arranged in a 10 line containing 10 numbers order.
		for (int i = 0; i < gridArray.length; i++) {
			System.out.println();
			fileContents.println();
			fileContents.flush();
			for (int j = 0; j < gridArray[i].length; j++) {
				gridArray[i][j] = (0 + (int)(Math.random() * 21));
				if (gridArray[i][j] >= 10) {
					fileContents.print(gridArray[i][j] + " " + " ");
				}
				else {
					fileContents.print(gridArray[i][j] + " " + " " + " ");
				}
				fileContents.flush();
				
			}
			
		}
		fileContents.close();
	}

}
