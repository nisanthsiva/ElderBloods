package ElderBloody;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int currentRow = 0;
	private static int currentRoom = 0;
	private static int gamestate = 0;
	
	private static Room testRoom = new Room(0, -1, 1, 4, -1); // Top-Left most room
	
//	private static Room[][] map = {
//			{},
//			{},
//			{}
//		};

	public static void main(String[] args) {
		Title.printAbsPath();
		
		testRoom.drawRoom();
		
//		map[currentRow][currentRoom].drawRoom();
				
		
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
		
//		map[currentRow][currentRoom].drawRoom();
//		System.out.println(map[currentRow][currentRoom].getRoomNumber());
		
	}
	
}