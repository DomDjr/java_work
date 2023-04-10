package homework2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
//5
public class E_WriteStats {
	public static void main (String [] args) {
		Scanner userInput = new Scanner(System.in);
		int numberGridGrandTotal = 0;
		try {
			File numberGridFile = new File("numberGrid.txt");
			Scanner gridScan = new Scanner(numberGridFile);
		
			File gridStatsFile = new File("gridStats.txt");
			PrintWriter gridStatsContent = new PrintWriter(gridStatsFile);
			
			int [][] gridStatsArray = new int [10][10];
			for (int i = 0; i < gridStatsArray.length; i++) {
				for (int j = 0; j < gridStatsArray[i].length; j++) {
					gridStatsArray[i][j] = gridScan.nextInt();
				}
			}
			//prints the grand total of numberGrid.txt into gridStats.txt.
			gridStatsContent.println("\n");
			for (int i = 0; i < gridStatsArray.length; i++) {
				for (int j = 0; j < gridStatsArray[i].length; j++) {
					numberGridGrandTotal = gridStatsArray[i][j] + numberGridGrandTotal;
				}
			}
			gridStatsContent.print("The grand total in numberGrid.txt is: " + numberGridGrandTotal);
			gridStatsContent.flush();
			
			//prints the total by row of numberGrid.txt into gridStats.txt
			gridStatsContent.println("\n");
			for (int i = 0; i < 10; i++) {
				int rowTotal = RowTotal(gridStatsArray, i);
				gridStatsContent.print("The " + i + " column total in numberGrid.txt is: " + rowTotal + "\n");
				gridStatsContent.flush();
			}
			//prints the total by column of numberGrid.txt into gridStats.txt
			gridStatsContent.println();
			for (int i = 0; i < 10; i++) {
				int columnTotal = ColumnTotal(gridStatsArray, i);
				gridStatsContent.print("The " + i + " row total in numberGrid.txt is: " + columnTotal + "\n");
				gridStatsContent.flush();
			}
			//prints the average value of numberGrid.txt into gridStats.txt
			gridStatsContent.println();
			double average = AverageValue(gridStatsArray);
			gridStatsContent.print("The average of all values in numberGrid.txt is: " + average + "\n");
			
			//prints the occurrence of the number 17 in numberGrid.txt into gridStats.txt
			gridStatsContent.println();
			int occurenceOfSeventeen = Occurence(gridStatsArray);
			gridStatsContent.println("The number of occurrences of 17 in numberGrid.txt is: " + occurenceOfSeventeen);
			gridStatsContent.close();
		}
		catch (Exception e) {
			System.err.println(e);
			
		}
	userInput.close();
	
	}
	//computes the total of each row in numberGrid.txt
	public static int RowTotal(int[][] rowArray, int rowIndex) {
		int total = 0;
		for (int i = rowIndex; i <= rowIndex; i++ ) {
			for (int j = 0; j <= 9; j++) {
				total = rowArray[i][j] + total;
			}
		}
		return total;
		
	}
	//computes the total of each column in numberGrid.txt
	public static int ColumnTotal(int[][] columnArray, int columnIndex) {
		int total = 0;
		for (int j = columnIndex; j <= columnIndex; j++) {
			for (int i = 0; i <= 9; i++) {
				total = columnArray[i][j] + total;
			}
		}
		return total;
	}
	//computes the average value of all numbers in numberGrid.txt
	public static double AverageValue(int[][] averageArray) {
		double total = 0;
		for (int i = 0; i < averageArray.length; i++) {
			for (int j = 0; j < averageArray[i].length; j++) {
			 total = averageArray[i][j] + total;			
			}
		}
	double average = total/(averageArray.length * 10);
	return average;
	}
	//counts how many times the number 17 is in the list.
	public static int Occurence(int[][] occurenceArray) {
		int occurenceSeventeen = 0;
		for (int i = 0; i < occurenceArray.length; i++) {
			for (int j = 0; j < occurenceArray[i].length; j++) {
				if (occurenceArray[i][j] == 17) {
					occurenceSeventeen++;
				}
			}
		}
		return occurenceSeventeen;
	}



}
