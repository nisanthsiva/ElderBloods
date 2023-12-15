/*****************************
 *   Nisanth, Taha, Muhib    *
 *        Story.java         *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

public class Story {

	static void introduction() { // introduces how to move and what the room look like and for example a room
							// with a exit North will have the top line be empty indicating that you can
							// move through it
		System.out.println("Welcome to the first room! Write 'D' to move through the exit on the right.");
		System.out.println("Later on in the game, you write 'W', 'A', 'S', 'D', to move through exits of your choice.");
	}

	static void storyline() throws InterruptedException {
		if (Main.getCurrentRoom() == 0) { // if room is 0 its the first room teaching you how to move
			System.out.println("Start the game by writing 'D'.");
		} else if (Main.getCurrentRoom() == 1) { // if room is 1 you can see exits
			System.out.println("As you move on, you'll find other exits that move to other rooms.");
			System.out.println(
					"Your goal is to find the boss room. You can train to find the boss by searching other rooms for materials or training.");
		} else if (Main.getCurrentRoom() == 2) {
			System.out.println("There seems to be something to the right.");
		} else if (Main.getCurrentRoom() == 3) {
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) { // goes to the map array and see if the rooms
																		// alreadyexplored variable is true
				System.out.println("Wow! You found your first weapon! A sword!"); // Item.
				Item sword = new Item("Sword", 5, "weapon"); // makes a sword object, with the parameter name damage
																// multiplier and item type
				Inventory.addItem(sword); // adds sword to array, if there is room
				sword.addDamage(); // buffs the player by getting their damage and adding the multiplier
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true); // determines the room youre in right now and
																			// sets the value of alreadyExplored to true
			}
		} else if (Main.getCurrentRoom() == 4) {
			System.out.println("Continue moving right."); // directionals determine the main storyline you don't have to
															// follow but its recommended
		} else if (Main.getCurrentRoom() == 5) {
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				System.out.println("An old man tells you that there is an evil creature later on. Watch out for that.");
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 15) {
			if (EnemyBattles.titan.getAlreadyFought() == false) { // gets the enemy alreadyfought variable and checks if
																	// true or false
				EnemyBattles.startTVBattle(Main.player);
			} else {
				System.out.println("Keep going Warrior!");
			}
		} else if (Main.getCurrentRoom() == 16) {
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				System.out.println("Good job! You beat the enemy! Continue up.");
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 6) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 7) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 8) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 9) {
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				System.out.println("Woah, you found a bow and arrows!"); // Item.
				System.out.println("A kind man gave you a bow!"); // Route 2
				Item bow = new Item("Bow", 20, "weapon");
				Inventory.addItem(bow);
				bow.addDamage();
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 19) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 29) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 28) {
			if (EnemyBattles.fallen.getAlreadyFought() == false) {
				EnemyBattles.startSRBattle(Main.player);
			} else {
				System.out.println("Keep going Warrior!");
			}
		} else if (Main.getCurrentRoom() == 27) {
			System.out.println("You hear roars from a larger boss in the distance. Continue left.");
		} else if (Main.getCurrentRoom() == 25) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 24) {
			System.out.println("Continue up.");
		} else if (Main.getCurrentRoom() == 14) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 13) {
			System.out.println("There seems to be something on the left.");
		} else if (Main.getCurrentRoom() == 12) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 11) {
			System.out.println("Woah! You found an axe! Continue left."); // Item.
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				Item axe = new Item("Axe", 20, "weapon");
				Inventory.addItem(axe);
				axe.addDamage();
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 10) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 20) {
			if (EnemyBattles.zoomstalker.getAlreadyFought() == false) {
				EnemyBattles.startWRTBattle(Main.player);
			} else {
				System.out.println("Keep going Warrior!");
			}
		} else if (Main.getCurrentRoom() == 30) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 40) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 41) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 42) {
			System.out.println("You found another sword! Continue down."); // Item.
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				Item sword = new Item("Sword", 20, "weapon");
				Inventory.addItem(sword);
				sword.addDamage();
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 52) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 51) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 61) {
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				System.out.println("YOU'VE BEEN STRUCK BY LIGHTNING!!");
				PlayerChoice.lightningActive = true;
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 71) {
			System.out.println("Continue left.");
		} else if (Main.getCurrentRoom() == 70) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 80) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 81) {
			if (EnemyBattles.berserker.getAlreadyFought() == false) {
				EnemyBattles.startAOBattle(Main.player);
			} else {
				System.out.println("Keep going Warrior!");
			}
		} else if (Main.getCurrentRoom() == 91) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 92) {
			System.out.println("The boss's roars are starting to get louder. Continue up.");
		} else if (Main.getCurrentRoom() == 82) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 83) {
			System.out.println("You found a crossbow! Continue down."); // Item
			if (!Main.map[Main.currentRoom].getRoomAlreadyExplored()) {
				System.out.println("Woah, you found a crossbow and arrows!"); // Item.
				Item crossbow = new Item("Crossbow", 15, "weapon");
				Inventory.addItem(crossbow);
				crossbow.addDamage();
				Main.map[Main.currentRoom].setRoomAlreadyExplored(true);
			}
		} else if (Main.getCurrentRoom() == 93) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 94) {
			System.out.println("The weather is quite good outside. Continue right.");
		} else if (Main.getCurrentRoom() == 95) {
			System.out.println("Continue up.");
		} else if (Main.getCurrentRoom() == 86) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 85) {
			System.out.println("Continue up.");
		} else if (Main.getCurrentRoom() == 75) {
			System.out.println("It starts to rain. Continue right.");
		} else if (Main.getCurrentRoom() == 76) {
			System.out.println("You hear the boss above you, continue down.");
		} else if (Main.getCurrentRoom() == 96) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 97) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 98) {
			System.out.println("A bystander lets you know that the room to your right is very dangerous. Continue up.");
		} else if (Main.getCurrentRoom() == 88) {
			System.out.println("Continue right.");
		} else if (Main.getCurrentRoom() == 79) {
			System.out.println("It seems you're getting close to the boss. Continue up.");
		} else if (Main.getCurrentRoom() == 69) {
			System.out.println("Continue up.");
		} else if (Main.getCurrentRoom() == 59) {
			System.out.println("Continue left. Make sure you're healed up.");
		} else if (Main.getCurrentRoom() == 58) {
			System.out.println("Continue down.");
		} else if (Main.getCurrentRoom() == 68) {
			System.out.println("The ground shakes as the boss roams. You are close. Continue left.");
		} else if (Main.getCurrentRoom() == 67) {
			System.out.println("The boss hears your footsteps. Continue left.");
		} else if (Main.getCurrentRoom() == 66) {
			System.out.println("You lock eyes with the boss in the room above. It is time. Continue up.");
		} else if (Main.getCurrentRoom() == 56) {
			if (EnemyBattles.bossEnemy.getAlreadyFought() == false) { // if boss hasn't been beaten
				EnemyBattles.startBossBattle(Main.player);
			} else { // if boss has been beaten
				Main.gameState = 1; // stops taking player input since the while condition in main is not true
				for (int i = 0; i < 50; i++) {
					System.out.println(""); // cleans the console up
				}

				Title.printTitle(); // shows our game logo
				System.out.println("Congratulations you've defeated all the elders! You've Claimed their blood!"); // lore
			}
		}
	}
}
