package homework2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
//8
public class H_FilesValid {
	public static void main (String [] args) {
		Scanner userInput = new Scanner(System.in);
		File [] fileArray = new File [11];
		int missingLength = 11;
		int j = 0;
		int newMissingLength = 0;
		File [] missingFiles = new File [missingLength];
		String userFile;
		int checker = 0;
		
		
		//checks if the .txt activity files exist. (These files include lab and github texts)
		//asks the user to input the txt file activities.
		for (int i = 0; i < fileArray.length; i++) {
			System.out.println("Choose a file from the activity");
			userFile = userInput.nextLine();
			File activity = new File(userFile);
			fileArray[i] = activity;
			System.out.println(fileArray[i]);
				if (fileArray[i].exists()) {
					checker++;
			}
				else if (!fileArray[i].exists()) {
					missingFiles[j] = fileArray[i];
					j++;
					newMissingLength++;
				}
		}
		//Creates a new file array to get rid of null elements
		File[] newMissingFiles = new File[newMissingLength];
		
		for (int i = 0; i < newMissingFiles.length; i++  ) {
			newMissingFiles[i] = missingFiles[i];
				
		}
		
		//prints out "all complete" if all files exist or prints the non existing files.
		if (checker == 11) {
			System.out.println("all complete");
		}
		else {
		System.out.println("The missing files are " + Arrays.toString(newMissingFiles));
		}
		
		userInput.close();
	
	}
}