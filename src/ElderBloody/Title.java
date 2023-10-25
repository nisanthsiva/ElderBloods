package ElderBloody;
import java.io.File;
import java.nio.file.Files;

	public class Title {
		static File asciiArt = new File("src\\ElderBloody\\AsciiArt.txt");
		final static String ANSI_PURPLE = "\u001B[45m";
		//String textString = Files.readString(src\ElderBloody\AsciiArt.txt);
		
		public static void printAbsPath() {
			System.out.println(asciiArt.getPath());
		}
		
		public static void printString() {
		}
		
	}