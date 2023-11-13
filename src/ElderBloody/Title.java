package ElderBloody;

// Broken code remember to ask mr P for help
/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Title{
	public static void printTitle() throws IOException{ 
		final BufferedReader bob = new BufferedReader(new FileReader("art.txt"));
		final String purpleBg = "\u001B[45m";
		String titleText;
		while((titleText = bob.readLine()) != null) {
			System.out.println(purpleBg + titleText);
		}
	}
}
*/

public class Title{
	private static final String yellowFg = "\u001B[33m"; // ANSI color code for a yellow foreground
	private static final String art = 
			  "▓█████  ██▓    ▓█████▄ ▓█████  ██▀███              \r\n"
			+ "▓█   ▀ ▓██▒    ▒██▀ ██▌▓█   ▀ ▓██ ▒ ██▒            \r\n"
			+ "▒███   ▒██░    ░██   █▌▒███   ▓██ ░▄█ ▒            \r\n"
			+ "▒▓█  ▄ ▒██░    ░▓█▄   ▌▒▓█  ▄ ▒██▀▀█▄              \r\n"
			+ "░▒████▒░██████▒░▒████▓ ░▒████▒░██▓ ▒██▒            \r\n"
			+ "░░ ▒░ ░░ ▒░▓  ░ ▒▒▓  ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░            \r\n"
			+ " ░ ░  ░░ ░ ▒  ░ ░ ▒  ▒  ░ ░  ░  ░▒ ░ ▒░            \r\n"
			+ "   ░     ░ ░    ░ ░  ░    ░     ░░   ░             \r\n"
			+ "   ░  ░    ░  ░   ░       ░  ░   ░                 \r\n"
			+ "                ░                                  \r\n"
			+ " ▄▄▄▄    ██▓     ▒█████   ▒█████  ▓█████▄   ██████ \r\n"
			+ "▓█████▄ ▓██▒    ▒██▒  ██▒▒██▒  ██▒▒██▀ ██▌▒██    ▒ \r\n"
			+ "▒██▒ ▄██▒██░    ▒██░  ██▒▒██░  ██▒░██   █▌░ ▓██▄   \r\n"
			+ "▒██░█▀  ▒██░    ▒██   ██░▒██   ██░░▓█▄   ▌  ▒   ██▒\r\n"
			+ "░▓█  ▀█▓░██████▒░ ████▓▒░░ ████▓▒░░▒████▓ ▒██████▒▒\r\n"
			+ "░▒▓███▀▒░ ▒░▓  ░░ ▒░▒░▒░ ░ ▒░▒░▒░  ▒▒▓  ▒ ▒ ▒▓▒ ▒ ░\r\n"
			+ "▒░▒   ░ ░ ░ ▒  ░  ░ ▒ ▒░   ░ ▒ ▒░  ░ ▒  ▒ ░ ░▒  ░ ░\r\n"
			+ " ░    ░   ░ ░   ░ ░ ░ ▒  ░ ░ ░ ▒   ░ ░  ░ ░  ░  ░  \r\n"
			+ " ░          ░  ░    ░ ░      ░ ░     ░          ░  \r\n"
			+ "      ░                            ░               ";
	
	public static void printTitle() {
		System.out.println(yellowFg + art); // Concatenates the ANSI yellow foreground code
	}
}