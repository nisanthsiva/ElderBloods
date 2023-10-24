package ElderBloody;

	public class Title {
		
		// This string is made by an online generator, just a good font for ASCII art that I found
		final static String titleText = 
				"▓█████  ██▓    ▓█████▄ ▓█████  ██▀███     \r\n"
				+ "▓█   ▀ ▓██▒    ▒██▀ ██▌▓█   ▀ ▓██ ▒ ██▒   \r\n"
				+ "▒███   ▒██░    ░██   █▌▒███   ▓██ ░▄█ ▒   \r\n"
				+ "▒▓█  ▄ ▒██░    ░▓█▄   ▌▒▓█  ▄ ▒██▀▀█▄     \r\n"
				+ "░▒████▒░██████▒░▒████▓ ░▒████▒░██▓ ▒██▒   \r\n"
				+ "░░ ▒░ ░░ ▒░▓  ░ ▒▒▓  ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░   \r\n"
				+ " ░ ░  ░░ ░ ▒  ░ ░ ▒  ▒  ░ ░  ░  ░▒ ░ ▒░   \r\n"
				+ "   ░     ░ ░    ░ ░  ░    ░     ░░   ░    \r\n"
				+ "   ░  ░    ░  ░   ░       ░  ░   ░        \r\n"
				+ "                ░                         \r\n"
				+ " ▄▄▄▄    ██▓     ▒█████   ▒█████  ▓█████▄ \r\n"
				+ "▓█████▄ ▓██▒    ▒██▒  ██▒▒██▒  ██▒▒██▀ ██▌\r\n"
				+ "▒██▒ ▄██▒██░    ▒██░  ██▒▒██░  ██▒░██   █▌\r\n"
				+ "▒██░█▀  ▒██░    ▒██   ██░▒██   ██░░▓█▄   ▌\r\n"
				+ "░▓█  ▀█▓░██████▒░ ████▓▒░░ ████▓▒░░▒████▓ \r\n"
				+ "░▒▓███▀▒░ ▒░▓  ░░ ▒░▒░▒░ ░ ▒░▒░▒░  ▒▒▓  ▒ \r\n"
				+ "▒░▒   ░ ░ ░ ▒  ░  ░ ▒ ▒░   ░ ▒ ▒░  ░ ▒  ▒ \r\n"
				+ " ░    ░   ░ ░   ░ ░ ░ ▒  ░ ░ ░ ▒   ░ ░  ░ \r\n"
				+ " ░          ░  ░    ░ ░      ░ ░     ░    \r\n"
				+ "      ░                            ░      ";
		
		// String ANSI_PURPLE contains the color code for a purple background in text form 
		final static String ANSI_PURPLE = "\u001B[45m";
		
		/* String elderBlood concatenates the String ANSI_PURPLE with the ASCII art, which gives us our
		 * ASCII art title with a purple background, and the default foreground (text) color, which is white.
		 */
		final static String elderBlood = ANSI_PURPLE + titleText;
	}
