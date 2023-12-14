/*****************************
 *   Nisanth, Taha, Muhib    *
 *        Title.java         *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

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
