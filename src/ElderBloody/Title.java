package ElderBloody;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Title{
	public static void printTitle() throws IOException{
		final BufferedReader bob = new BufferedReader(new FileReader("D:\\eclipseworkspace\\ElderBloods\\src\\ElderBloody"));
		final String purpleBg = "\\u001B[45m";
		String titleText;
		while((titleText = bob.readLine()) != null) {
			System.out.println(titleText);
		}
	}
}