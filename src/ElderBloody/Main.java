package ElderBloody;

import java.util.Scanner;

public class Main {
	Enemy titan = new Enemy(40, 10, 30, "titan");  
        Enemy fallen = new Enemy(35, 10, 35, "fallen"); 
        Enemy berserker = new Enemy(45, 5, 30, "berserker"); 
        Enemy zoomstalker = new Enemy(30, 40, 10, "zoomstalker");
        Enemy bossEnemy = new Enemy(50, 50, 50, "இந்திரன");
        Player player = new Player(10,50,10, pName);
	private static Scanner scanner = new Scanner(System.in);
	
	private static int currentRoom = 0;
	private static int gameState = 0;
	
	
	private static Room[] map = {
			new Room(0, 0, 1, 10, 0), new Room(1, 1, 2, 11, 0), new Room(2, 2, 3, 12, 1), new Room(3, 3, 4, 3, 2), new Room(4, 4, 5, 14, 3), new Room(5, 5, 5, 15, 4), new Room(6, 6, 7, 16, 6), new Room(7, 7, 8, 7, 6), new Room(8, 8, 9, 18, 7), new Room(9, 9, 9, 19, 8), //
			new Room(10, 0, 11, 20, 10), new Room(11, 1, 12, 21, 10), new Room(12, 2, 13, 12, 11), new Room(13, 13, 14, 23, 12), new Room(14, 4, 14, 24, 14), new Room(15, 5, 16, 15, 15), new Room(16, 6, 16, 16, 15), new Room(17, 17, 18, 27, 17), new Room(18, 8, 18, 18, 17), new Room(19, 9, 19, 29, 19), 
			new Room(20, 10, 20, 30, 20), new Room(21, 11, 21, 31, 21), new Room(22, 22, 23, 32, 22), new Room(23, 13, 24, 33, 22), new Room(24, 14, 25, 34, 23), new Room(25, 25, 26, 25, 24), new Room(26, 26, 27, 36, 25), new Room(27, 17, 28, 37, 26), new Room(28, 28, 29, 28, 27), new Room(29, 19, 29, 39, 29),
			new Room(30, 20, 31, 40, 30), new Room(31, 21, 32, 41, 30), new Room(32, 22, 33, 32, 31), new Room(33, 23, 33, 33, 32), new Room(34, 24, 34, 44, 34), new Room(35, 35, 36, 45, 35), new Room(36, 26, 36, 36, 35), new Room(37, 27, 37, 47, 37), new Room(38, 38, 39, 48, 38), new Room(39, 29, 39, 49, 38),
			new Room(40, 30, 41, 50, 40), new Room(41, 31, 42, 41, 40), new Room(42, 42, 42, 52, 41), new Room(43, 43, 44, 53, 43), new Room(44, 34, 44, 44, 43), new Room(45, 35, 45, 55, 45), new Room(46, 46, 47, 56, 46), new Room(47, 37, 47, 47, 46), new Room(48, 38, 48, 58, 48), new Room(49, 39, 49, 59, 49),
			new Room(50, 40, 50, 60, 50), new Room(51, 51, 52, 61, 51), new Room(52, 42, 53, 52, 51), new Room(53, 43, 53, 63, 52), new Room(54, 54, 55, 64, 54), new Room(55, 45, 56, 55, 54), new Room(56, 56, 56, 56, 56), new Room(57, 57, 58, 57 ,56), new Room(58, 48, 59, 68, 57), new Room(59, 49, 59, 69, 58),
			new Room(60, 50, 60, 70, 60), new Room(61, 51, 61, 71, 61), new Room(62, 62, 63, 72, 62), new Room(63, 53, 63, 63, 62), new Room(64, 54, 64, 74, 64), new Room(65, 65, 66, 75, 65), new Room(66, 56, 67, 76, 65), new Room(67, 67, 68, 77, 66), new Room(68, 58, 68, 68, 67), new Room(69, 59, 69, 79, 69),
			new Room(70, 60, 71, 80, 70), new Room(71, 61, 72, 71, 70), new Room(72, 62, 73, 72, 71), new Room(73, 73, 74, 73, 72), new Room(74, 64, 75, 84, 73), new Room(75, 65, 76, 85, 74), new Room(76, 66, 76, 86, 75), new Room(77, 67, 78, 87, 77), new Room(78, 78, 78, 88, 77), new Room(79, 69, 79, 89, 79),
			new Room(80, 70, 81, 80, 80), new Room(81, 81, 81, 91, 80), new Room(82, 82, 83, 92, 82), new Room(83, 83, 84, 93, 82), new Room(84, 74, 84, 84, 83), new Room(85, 75, 85, 95, 85), new Room(86, 76, 86, 96, 86), new Room(87, 77, 87, 97, 87), new Room(88, 78, 89, 98, 88), new Room(89, 79, 89, 89, 88),
			new Room(90, 90, 91, 90, 90), new Room(91, 81, 92, 91, 90), new Room(92, 82, 92, 92, 91), new Room(93, 83, 94, 93, 93), new Room(94, 94, 95, 94, 93), new Room(95, 85, 95, 95, 94), new Room(96, 86, 97, 96, 96), new Room(97, 87, 98, 97, 96), new Room(98, 88, 99, 98, 97), new Room(99, 56, 56, 56, 56)
	};
	
	static Story story = new Story();

	public static void main(String[] args) {
		Title.printTitle();
		String pName = scanner.nextLine;
		map[currentRoom].drawRoom();
		story.introduction();
		while(gameState == 0) {
			takePlayerInput();
		}
	}
	
	public static void takePlayerInput() {	
		if(currentRoom != 56) {
		System.out.println("Enter: W, A, S, D");
		}
		String playerInput = scanner.nextLine();
		moveRoom(playerInput);
		
		map[currentRoom].drawRoom();
		
		story.storyline();
		System.out.println("Room " + currentRoom);
	}
	
	public static void moveRoom(String playerInput) {
		if(playerInput.equals("W")) {
			currentRoom = map[currentRoom].getRoomNorth();
		}
		else if(playerInput.equals("D")) {
			currentRoom = map[currentRoom].getRoomEast();
		}
		else if(playerInput.equals("S")) {
			currentRoom = map[currentRoom].getRoomSouth();
		}
		else if(playerInput.equals("A")) {
			currentRoom = map[currentRoom].getRoomWest();
		}
		else {
			System.out.println("Invalid input");
		}
	}
	
	public static int getCurrentRoom() {
		return currentRoom;
	}
}
