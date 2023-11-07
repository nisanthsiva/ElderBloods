// Nisanth's Code
/*package ElderBloody;

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
	
}*/

// Muhib's Code
package ElderBloody;

import java.util.Scanner;

public class Main {
	
	static Room[] booleansRoom = new Room[16];
	
	public static void main(String[] args) {
		Title.printAbsPath();
		initializeRooms();
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
		booleansRoom[14].drawRoom();
		Scanner scanner = new Scanner(System.in);
		String askInput;
		System.out.println("Welcome to the first room! Write 'Right' to move through the exit on the right.");
		System.out.println("Later on in the game, you write 'Left', 'Right', 'Up', 'Down', to move through exits of your choice.");
		askInput = scanner.nextLine();
		if (askInput.matches("Right")) {
			secondRoom();
		} else {
			System.out.println("Wrong input, try again.");
			firstRoom();
		}
	}

	public static void secondRoom() {
		booleansRoom[5].drawRoom();
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
		booleansRoom[4].drawRoom();
	}
	
	public static void initializeRooms() {
		booleansRoom[0] = new Room(1, true, true, true, true);
		booleansRoom[1] = new Room(2, false, true, true, true);
		booleansRoom[2] = new Room(3, true, false, true, true);
		booleansRoom[3] = new Room(4, true, true, false, true);
		booleansRoom[4] = new Room(5, true, true, true, false);
		booleansRoom[5] = new Room(6, true, false, false, true);
		booleansRoom[6] = new Room(7, true, true, false, false);
		booleansRoom[7] = new Room(8, false, true, true, false);
		booleansRoom[8] = new Room(9, false, false, true, true);
		booleansRoom[9] = new Room(10, false, true, false, true);
		booleansRoom[10] = new Room(11, true, false, true, false);
		booleansRoom[11] = new Room(12, true, false, false, false);
		booleansRoom[12] = new Room(13, false, false, true, false);
		booleansRoom[13] = new Room(14, false, false, false, true);
		booleansRoom[14] = new Room(15, false, true, false, false);
		booleansRoom[15] = new Room(16, false, false, false, false);
	}
}