package ElderBloody;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int currentRow = 0;
	private static int currentRoom = 0;
	private static int gamestate = 0;
	
	private static Room testRoom = new Room(100, false, false, false, false);
	
	private static Room[][] map = {
			{new Room(1, true, false, true, true), new Room(2, true, true, false, true), new Room(3, true, false, true, false)},
			{new Room(4, true, false, false, true), new Room(5, true, false, true, false), new Room(6, false, true, true, true)},
			{new Room(7, true, false, false, false), new Room(8, true, true, true, true), new Room(9, false, false, true, true)}
		};

	public static void main(String[] args) {
		Title.printAbsPath();
		//Room booleansFirstRoom = new Room(1, true, false, true, true); // North, East, South, West
		//booleansFirstRoom.drawRoom();
		
		//map[currentRow][currentRoom].drawRoom();
		
		testRoom.drawRoom();
		
		
//		while(gamestate == 0) {
//			takePlayerInput();
//		}
	}
	
	public static void takePlayerInput() {		
		System.out.println("Enter: W, A, S, D");
		String playerInput = scanner.nextLine();
		if(playerInput.equals("W") && currentRow > 0) { // UP
			currentRow--;
		}
		else if(playerInput.equals("S") && currentRow < 3) { // DOWN
			currentRow++;
		}
		else if(playerInput.equals("A") && currentRoom > 0) { // LEFT
			currentRoom--;
		}
		else if(playerInput.equals("D") && currentRoom < 3) { // RIGHT
			currentRoom++;
		}
		else {
			System.out.println("Invalid number, please enter a valid number");
			return;
		}
		
		map[currentRow][currentRoom].drawRoom();
		System.out.println(map[currentRow][currentRoom].getRoomNumber());
		
	}
	
}