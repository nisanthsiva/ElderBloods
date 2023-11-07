package ElderBloody;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Title.printAbsPath();
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
	}
}