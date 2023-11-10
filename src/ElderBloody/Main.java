package ElderBloody;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int currentRoom = 0;
	private static int gamestate = 0;
	
	
	private static Room[] map = {
			new Room(0, 0, 1, 10, 0), new Room(1, 1, 2, 11, 0), new Room(2, 2, 3, 12, 1), new Room(3, 3, 4, 3, 2), new Room(4, 4, 5, 14, 3), new Room(5, 5, 5, 15, 4), new Room(6, 6, 7, 16, 6), new Room(7, 7, 8, 7, 6), new Room(8, 8, 9, 18, 7), new Room(9, 9, 9, 19, 8), //
			new Room(10, 0, 11, 20, 10), new Room(11, 1, 12, 21, 10), new Room(12, 2, 13, 12, 11), new Room(13, 13, 14, 23, 12), new Room(14, 4, 14, 24, 14), new Room(15, 5, 16, 15, 15), new Room(16, 6, 16, 16, 15), new Room(17, 17, 18, 27, 17), new Room(18, 8, 18, 18, 17), new Room(19, 9, 19, 29, 19), 
			new Room(20, 10, 20, 30, 20), new Room(21, 11, 21, 31, 21), new Room(22, 22, 23, 32, 22), new Room(23, 13, 24, 33, 22), new Room(24, 14, 25, 34, 23), new Room(25, 25, 26, 25, 24), new Room(26, 26, 27, 36, 25), new Room(27, 17, 28, 37, 26), new Room(28, 28, 29, 28, 27), new Room(29, 19, 29, 39, 29),
			new Room(30, 20, 31, 40, 30), new Room(31, 21, 32, 41, 30), new Room(32, 22, 33, 32, 31), new Room(33, 23, 33, 33, 32), new Room(34, 24, 34, 44, 34), new Room(35, 35, 36, 45, 35), new Room(36, 26, 36, 36, 35), new Room(37, 27, 37, 47, 36), new Room(38, 38, 39, 48, 38), new Room(39, 29, 39, 49, 38),
	};

	public static void main(String[] args) {
		Title.printAbsPath();
		
		map[currentRoom].drawRoom();
		
		while(gamestate == 0) {
			takePlayerInput();
		}
	}
	
	public static void takePlayerInput() {	
		System.out.println(map[currentRoom].getRoomNumber());
		System.out.println("Enter: N, E, S, W");
		String playerInput = scanner.nextLine();
		moveRoom(playerInput);
		
		map[currentRoom].drawRoom();
	}
	
	public static void moveRoom(String playerInput) {
		if(playerInput.equals("N")) {
			currentRoom = map[currentRoom].getRoomNorth();
		}
		else if(playerInput.equals("E")) {
			currentRoom = map[currentRoom].getRoomEast();
		}
		else if(playerInput.equals("S")) {
			currentRoom = map[currentRoom].getRoomSouth();
		}
		else if(playerInput.equals("W")) {
			currentRoom = map[currentRoom].getRoomWest();
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
