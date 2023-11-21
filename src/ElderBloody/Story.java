package ElderBloody;

public class Story {
	
	void introduction() {
		System.out.println("Welcome to the first room! Write 'D' to move through the exit on the right.");
		System.out.println("Later on in the game, you write 'W', 'A', 'S', 'D', to move through exits of your choice.");
	}
	
	void storyline() {
		if(Main.getCurrentRoom() == 0) {
			System.out.println("Start the game by writing 'D'.");
		} else if(Main.getCurrentRoom() == 1) {
			System.out.println("As you move on, you'll find other exits that move to other rooms.");
			System.out.println("Your goal is to find the boss room. You can train to find the boss by searching other rooms for materials or training.");
		} else if(Main.getCurrentRoom() == 2) {
			System.out.println("It seems that there are some materials in another room towards the right."); // Route 1
		} else if(Main.getCurrentRoom() == 3) {
			System.out.println("No materials here."); // Route 1
		} else if(Main.getCurrentRoom() == 4) {
			System.out.println("You've found a stick in this room!"); // Route 1
		} else if(Main.getCurrentRoom() == 5) {
			System.out.println("No materials here."); // Route 1
		} else if(Main.getCurrentRoom() == 6) {
			System.out.println("You've found metal in this room!"); // Route 1
		} else if(Main.getCurrentRoom() == 7) {
			System.out.println("It's very rainy around here."); // Route 1
		} else if(Main.getCurrentRoom() == 8) {
			System.out.println("There's a crafting table here. You used your stick and metal to make a sword!"); // Route 1
		} else if(Main.getCurrentRoom() == 9) {
			System.out.println("No materials here."); 
		} else if(Main.getCurrentRoom() == 10) {
			System.out.println("As you move on, you'll find other exits that move to other rooms.");
			System.out.println("Your goal is to find the boss room. You can train to find the boss by searching other rooms for materials or training.");
		} else if(Main.getCurrentRoom() == 11) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 12) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 13) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 14) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 15) {
			System.out.println("No materials here.");
		} else if(Main.getCurrentRoom() == 16) {
			System.out.println("No materials here.");
		} else if(Main.getCurrentRoom() == 17) {
			System.out.println("Danger! A mob has spawned and wants to fight you! Use your new powers to defeat it!"); // Route 1
			EnemyBattles.startTVBattle(Main.player);
		} else if(Main.getCurrentRoom() == 18) {
			System.out.println("Woah! Lightning struck you and you and your sword have now obtained lightning powers!"); // Route 1
		} else if(Main.getCurrentRoom() == 19) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 20) {
			System.out.println("There seems to be some materials ahead."); // Route 2
		} else if(Main.getCurrentRoom() == 21) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 22) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 23) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 24) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 25) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 26) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 27) {
			System.out.println("Congratulations! You beat the mob! Keep moving forward to adventure through the game.");
		} else if(Main.getCurrentRoom() == 28) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 29) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 30) {
			System.out.println("You found arrows! They might be useful later on."); // Route 2
		} else if(Main.getCurrentRoom() == 31) {
			System.out.println("No materials here."); // Route 2
		} else if(Main.getCurrentRoom() == 32) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 33) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 34) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 35) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 36) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 37) {
			System.out.println("You hear the boss nearby. If you are ready, then move forward, otherwise you can go back.");
		} else if(Main.getCurrentRoom() == 38) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 39) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 40) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 41) {
			System.out.println("A kind man gave you a bow!"); // Route 2
		} else if(Main.getCurrentRoom() == 42) {
			System.out.println("No materials here."); // Route 2
		} else if(Main.getCurrentRoom() == 43) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 44) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 45) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 46) {
			System.out.println("You are just about to enter the boss room! If you are ready, proceed, otherwise, turn back. Once in the boss room, you cannot leave.");
		} else if(Main.getCurrentRoom() == 47) {
			System.out.println("You found some healing items! This may help later when fighting.");
		} else if(Main.getCurrentRoom() == 48) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 49) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 50) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 51) {
			System.out.println("Woah! Your arrows caught on fire from dropping in the lava. You now have equipped fire arrows."); // Route 2
		} else if(Main.getCurrentRoom() == 52) {
			System.out.println("There seems to be lava to the left!"); // Route 2
		} else if(Main.getCurrentRoom() == 53) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 54) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 55) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 56) {
			System.out.println("Welcome to the boss room! Use all the items that you've received to fight the boss. There is no leaving rooms anymore.");
			EnemyBattles.startBossBattle(Main.player);
		} else if(Main.getCurrentRoom() == 57) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 58) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 59) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 60) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 61) {
			System.out.println("Woah! You encountered an enemy. Fight them!"); // Route 2
			EnemyBattles.startSRBattle(Main.player);
		} else if(Main.getCurrentRoom() == 62) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 63) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 64) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 65) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 66) {
			System.out.println("The boss room is above! If you're ready, proceed."); // Route 2
		} else if(Main.getCurrentRoom() == 67) {
			System.out.println("Woah! An enemy is here! Fight them!"); // Route 2
			EnemyBattles.startAOBattle(Main.player);
		} else if(Main.getCurrentRoom() == 68) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 69) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 70) {
			System.out.println("Woah! You encountered an enemy. Fight them!");
			EnemyBattles.startWRTBattle(Main.player);
		} else if(Main.getCurrentRoom() == 71) {
			System.out.println("There's a health station here! Use it if needed."); // Route 2
		} else if(Main.getCurrentRoom() == 72) {
			System.out.println("Woah! You encountered an enemy. Fight them!"); // Route 2
			EnemyBattles.startSRBattle(Main.player);
		} else if(Main.getCurrentRoom() == 73) {
			System.out.println("You found a stone!"); // Route 2
		} else if(Main.getCurrentRoom() == 74) {
			System.out.println("No materials here."); // Route 2
		} else if(Main.getCurrentRoom() == 75) {
			System.out.println("There's a training station here. Train your attacks if needed."); // Route 2
		} else if(Main.getCurrentRoom() == 76) {
			System.out.println("Woah! There's an enemy here! Fight them!"); // Route 2
			EnemyBattles.startAOBattle(Main.player);
		} else if(Main.getCurrentRoom() == 77) {
			System.out.println("No materials here.");
		} else if(Main.getCurrentRoom() == 78) {
			System.out.println("There's a training station here. Train attacks if you'd like."); // Route 2
		} else if(Main.getCurrentRoom() == 79) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 80) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 81) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 82) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 83) {
			System.out.println("There's a healing station here. Use if needed."); // Route 2
		} else if(Main.getCurrentRoom() == 84) {
			System.out.println("There's a training lab here! Train your attacks for later!"); // Route 2
		} else if(Main.getCurrentRoom() == 85) {
			System.out.println("No materials here."); // Route 2
		} else if(Main.getCurrentRoom() == 86) {
			System.out.println("There's some scrap parts here. With these, you can make more weapons! You made an axe and shovel!"); // Route 2
		} else if(Main.getCurrentRoom() == 87) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 88) {
			System.out.println("A boulder fell on you! The force on you allowed for you to gain super strength! Your attacks will be updated due to this."); // Route 2
		} else if(Main.getCurrentRoom() == 89) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 90) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 91) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 92) {
			System.out.println("");
		} else if(Main.getCurrentRoom() == 93) {
			System.out.println("You found a stick of metal! If you have a rock already, you can craft a sword!"); // Route 2
		} else if(Main.getCurrentRoom() == 94) {
			System.out.println("Woah! There's an enemy here! Fight them!"); // Route 2
			EnemyBattles.startWRTBattle(Main.player);
		} else if(Main.getCurrentRoom() == 95) {
			System.out.println("There's a healing station here, use if needed."); // Route 2
		} else if(Main.getCurrentRoom() == 96) {
			System.out.println("There's a healing station here, use if needed."); // Route 2
		} else if(Main.getCurrentRoom() == 97) {
			System.out.println("Woah! There's an enemy here! Fight them!"); // Route 2
			EnemyBattles.startTVBattle(Main.player);
		} else if(Main.getCurrentRoom() == 98) {
			System.out.println("Warning, move up! If you go right, there may be consequences."); // Route 2
		} else if(Main.getCurrentRoom() == 99) {
			System.out.println("OH NO! A PORTAL TO THE BOSS ROOM!"); // Filler Room
		} 
	}
	/* Route 1: 0, 1, 2, 3, 4, 5, 15, 
	 * 16, 6, 7, 8, 18, 17, 27, 37, 47, 46, 56 */
	/* Route 2: 0, 10, 20, 30, 31, 41, 42, 52, 51, 61, 71, 72,
	 * 73, 74, 84, 83, 93, 94, 95, 85, 75, 76, 86, 96, 97, 98,
	   88, 78, 77, 67, 66, 56 */
}
