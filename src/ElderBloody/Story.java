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
			System.out.println("There seems to be something to the right.");
		} else if(Main.getCurrentRoom() == 3) {
			System.out.println("Wow! You found your first weapon! A sword!"); // Item.
		} else if(Main.getCurrentRoom() == 4) {
			System.out.println("Continue moving right.");
		} else if(Main.getCurrentRoom() == 5) {
			System.out.println("An old man tells you that there is an evil creature later on. Watch out for that.");
		} else if(Main.getCurrentRoom() == 15) {
			System.out.println("An enemy! Fight them using your sword."); // Battle.
		} else if(Main.getCurrentRoom() == 16) {
			System.out.println("Good job! You beat the enemy! Continue up.");
		} else if(Main.getCurrentRoom() == 6) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 7) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 8) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 9) {
			System.out.println("Woah, you found a bow and arrows!"); // Item.
		} else if(Main.getCurrentRoom() == 19) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 29) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 28) {
			System.out.println("Another enemy! Fight them!"); // Battle.
		} else if(Main.getCurrentRoom() == 27) {
			System.out.println("You hear roars from a larger boss in the distance. Continue left.");
		} else if(Main.getCurrentRoom() == 26) {
			System.out.println("An old man gives you a healing potion! This can be useful later. Continue left."); // Potion.
		} else if(Main.getCurrentRoom() == 25) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 24) {
			System.out.println("Continue up.");
		} else if(Main.getCurrentRoom() == 14) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 13) {
			System.out.println("There seems to be something on the left.");
		} else if(Main.getCurrentRoom() == 12) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 11) {
			System.out.println("Woah! You found an axe! Continue left."); // Item.
		} else if(Main.getCurrentRoom() == 10) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 20) {
			System.out.println("An enemy! Fight them!"); // Battle.
		} else if(Main.getCurrentRoom() == 30) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 40) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 41) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 42) {
			System.out.println("You found another sword! Continue down."); // Item.
		} else if(Main.getCurrentRoom() == 52) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 51) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 61) {
			System.out.println("An old man gave you a healing potion! Continue down."); // Potion.
		} else if(Main.getCurrentRoom() == 71) {
			System.out.println("Continue left.");
		} else if(Main.getCurrentRoom() == 70) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 80) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 81) {
			System.out.println("An enemy! Fight them!"); // Battle.
		} else if(Main.getCurrentRoom() == 91) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 92) {
			System.out.println("The boss's roars are starting to get louder. Continue up.");
		} else if(Main.getCurrentRoom() == 82) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 83) {
			System.out.println("You found a crossbow! Continue down."); // Item
		} else if(Main.getCurrentRoom() == 93) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 94) {
			System.out.println("The weather is quite good outside. Continue right.");
		} else if(Main.getCurrentRoom() == 95) {
			System.out.println("Continue up.");
		} else if(Main.getCurrentRoom() == 85) {
			System.out.println("Continue up.");
		} else if(Main.getCurrentRoom() == 75) {
			System.out.println("It starts to rain. Continue right.");
		} else if(Main.getCurrentRoom() == 76) {
			System.out.println("You hear the boss above you, continue down.");
		} else if(Main.getCurrentRoom() == 86) {
			System.out.println("Another enemy! Fight them!"); // Battle.
		} else if(Main.getCurrentRoom() == 96) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 97) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 98) {
			System.out.println("A bystander lets you know that the room to your right is very dangerous. Continue up."); 
		} else if(Main.getCurrentRoom() == 99) {
			System.out.println("OH NO! A PORTAL TO THE BOSS ROOM!"); // Filler Room.
		} else if(Main.getCurrentRoom() == 88) {
			System.out.println("Continue right.");
		} else if(Main.getCurrentRoom() == 89) {
			System.out.println("An old man gave you a healing potion!"); // Potion.
		} else if(Main.getCurrentRoom() == 79) {
			System.out.println("It seems you're getting close to the boss. Continue up.");
		} else if(Main.getCurrentRoom() == 69) {
			System.out.println("Continue up.");
		} else if(Main.getCurrentRoom() == 59) {
			System.out.println("Continue left. Make sure you're healed up.");
		} else if(Main.getCurrentRoom() == 58) {
			System.out.println("Continue down.");
		} else if(Main.getCurrentRoom() == 68) {
			System.out.println("The ground shakes as the boss roams. You are close. Continue left.");
		} else if(Main.getCurrentRoom() == 67) {
			System.out.println("The boss hears your footsteps. Continue left.");
		} else if(Main.getCurrentRoom() == 66) {
			System.out.println("You lock eyes with the boss in the room above. It is time. Continue up.");
		} else if(Main.getCurrentRoom() == 56) {
			System.out.println("WELCOME TO THE BOSS ROOM! IT IS LIFE OR DEATH NOW!"); // Boss Room.
		} else {
			System.out.println("It seems that you are roaming off the main storyline. Get back on track please.");
		}
	} 
}
