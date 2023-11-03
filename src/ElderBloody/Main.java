package ElderBloody;

public class Main {

	public static void main(String[] args) {
		Title.printAbsPath();
		Room booleansFirstRoom = new Room(1, true, false, true, true); // North, East, South, West
		booleansFirstRoom.drawRoom();
	}
}