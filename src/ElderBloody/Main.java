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
<<<<<<< HEAD
		startGame();
	}

	public static void startGame() {
		Scanner scanner = new Scanner(System.in);
		String askInput;
		System.out.println("Welcome to Elder Bloods! Write 'Start' to start playing.");
		askInput = scanner.nextLine();
		if (askInput.matches("Start")) {
			firstRoom();
		} else {
			System.out.println("Wrong input, try again.");
			startGame();
		}
	}

	public static void firstRoom() {
		Room booleansFirstRoom = new Room(1, false, true, false, false); // North, East, South, West
		booleansFirstRoom.drawRoom();
		Scanner scanner = new Scanner(System.in);
		String askInput;
		System.out.println(
				"Welcome to the first room! Write 'Right' to move through the exit on the right. Later on in the game, you write 'Left', 'Right', 'Up', 'Down', to move through exits of your choice.");
		askInput = scanner.nextLine();
		if (askInput.matches("Right")) {
			secondRoom();
		} else {
			System.out.println("Wrong input, try again.");
			firstRoom();
		}
	}

	public static void secondRoom() {
		Room booleansSecondRoom = new Room(2, true, false, false, true); // North, East, South, West
		booleansSecondRoom.drawRoom();
		Scanner scanner = new Scanner(System.in);
		String askInput;
		System.out.println(
				"Keep going through exits. Some rooms will have quests for you to find and upgrade weapons, while some may have opponents to fight.");
		System.out.println("Write 'Left' or 'Up' to advance.");
		askInput = scanner.nextLine();
		if (askInput.matches("Left")) {
			firstRoom();
		} else if (askInput.matches("Up")) {
			thirdRoom();
		} else {
			System.out.println("Wrong input, try again.");
			secondRoom();
		}
	}
	
	public static void thirdRoom() {
		Room booleansThirdRoom = new Room(3, true, true, true, false); // North, East, South, West
		booleansThirdRoom.drawRoom();
=======
		
		testRoom.drawRoom();
		
//		map[currentRow][currentRoom].drawRoom();
				
		
//		while(gamestate == 0) {
//			takePlayerInput();
//		}
>>>>>>> 1b9c57ef9102251460aee20760a1dd5663d92d8a
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