/*****************************
 *   Nisanth, Taha, Muhib    *
 *    IntroScreen.java       *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

import java.util.Scanner; // Imports scanner.

public class IntroScreen {
	static String pName; // Used to contain the user's name.

	public static void askName(Scanner scanner) {
		System.out.println("What is your name hero?!"); // Intro message.
		pName = scanner.nextLine();

	}

}
