import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PPMImageManipulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter relative path of a PPM file: ");
		String filepath = input.nextLine().trim();

		try {
			PPMImage img = new PPMImage(filepath);

			System.out.println("How would you like to manipulate this file?");
					System.out.println("\t[G] Convert to grayscale.");
			System.out.println("\t[S] Convert it sepia.");
			System.out.println("\t[N] Convert it to its negative.");
			System.out.println("\t[C] Copy without altering.");
			System.out.println("\t[R] Convert it to a RandomFilter.");
			char operation = input.nextLine().charAt(0);
			operation = Character.toUpperCase(operation);
			switch (operation) {
				case 'G': img.grayscale(); break;
				case 'S': img.sepia(); break;
				case 'N': img.negative(); break;
				case 'C': /* do nothing... */ break;
				case 'I': img.iceFilter(); break;
				case 'B': img.blueFilter(); break;
				case 'P': img.purpleBlueFilter(); break;
				default:
					System.out.println(operation + " is not a recognized command.");
							System.out.println("Exiting.");
					System.exit(1);
			}


			System.out.print("Enter filepath for the manipulated image: ");
			filepath = input.nextLine().trim();
			img.writeFile(filepath);

			System.out.println("Thank you for using PPMImageManipulator!");
		} catch (FileNotFoundException e) {
			System.out.println(filepath + " does not exist.");
		} catch (IOException e) {
			System.out.println("Could not complete request.");
			e.printStackTrace();
		}
	}
}
