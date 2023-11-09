// Nisanth's Code
package ElderBloody;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int currentRoom = 0;
	private static int gameState = 0;
	
	
	private static Room[] map = {
			new Room(0, 0, 1, 10, 0), new Room(1, 1, 2, 11, 0), new Room(2, 2, 3, 12, 1), new Room(3, 3, 4, 3, 2), new Room(4, 4, 5, 14, 3), new Room(5, 5, 5, 15, 4), new Room(6, 6, 7, 16, 6), new Room(7, 7, 8, 7, 6), new Room(8, 8, 9, 18, 7), new Room(9, 9, 9, 19, 8), //
			new Room(10, 0, 11, 20, 10), new Room(11, 1, 12, 21, 10), new Room(12, 2, 13, 12, 11), new Room(13, 13, 14, 23, 12), new Room(14, 4, 14, 24, 14), new Room(15, 5, 16, 15, 15), new Room(16, 6, 16, 16, 15), new Room(17, 17, 18, 27, 17), new Room(18, 8, 18, 18, 17), new Room(19, 9, 19, 29, 19), 
			new Room(20, 10, 20, 30, 20), new Room(21, 11, 21, 31, 21), new Room(22, 22, 23, 32, 22), new Room(23, 13, 24, 33, 22), new Room(24, 14, 25, 34, 23), new Room(25, 25, 26, 25, 24), new Room(26, 26, 27, 36, 25), new Room(27, 17, 28, 37, 26), new Room(28, 28, 29, 28, 27), new Room(29, 19, 29, 39, 29),
			new Room(30, 20, 31, 40, 30), new Room(31, 21, 32, 41, 30), new Room(32, 22, 33, 32, 31), new Room(33, 23, 33, 33, 32), new Room(34, 24, 34, 44, 34), new Room(35, 35, 36, 45, 35), new Room(36, 26, 36, 36, 35), new Room(37, 27, 37, 47, 36), new Room(38, 38, 39, 48, 38), new Room(39, 29, 39, 49, 38),
	};

	public static void main(String[] args) {
		Title.printAbsPath();
		
		map[currentRoom].drawRoom();
		takePlayerInput();
	}
	
	public static void takePlayerInput() {		
		System.out.println("Enter: W, A, S, D");
		String playerInput = scanner.nextLine();
	}
	
}

// Muhib's Code
/*package ElderBloody;

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
		// Will continue.
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
}*/