package ElderBloody;
import java.util.Scanner;

public class PlayerChoice {

	
	  public static void playerChoice(int num, Enemy enemy, Player player, Scanner scanner) {

	        if (num == 1) {
	            System.out.println("1. Slam\t 2. Lion's Claw");
	            System.out.println("3. Shadow Slash\t 4. Chilling Mist");
	            int attack = scanner.nextInt();
	            if (attack == 1) {
	            	enemy.performRandomAttack(player);
	            	player.slam(enemy);
	            } else if (attack == 2) {
	            	enemy.performRandomAttack(player);
	                player.lionsClaw(enemy);
	            } else if (attack == 3) {
	            	enemy.performRandomAttack(player);
	            	player.shadowSlash(enemy);
	            } else if (attack == 4) {
	            	enemy.performRandomAttack(player);
	                player.chillingMist(enemy);
	            }
	        } else if (num == 2) {
	   			// access inventory
	   			System.out.println("Press 'U' to use an item.");
	   			System.out.println("Press 'X' to drop an item.");
	   			String playerInput = scanner.nextLine();

	    		if(playerInput.equals("U")) {
	    			System.out.println("Which item slot would you like to use?");
	    			int itemSlot = scanner.nextInt();
	    			Inventory.useItem(itemSlot);
	    		}    		
	    		else if(playerInput.equals("X")) {
	    			System.out.println("Which item slot would you like to drop?");
	    			int itemSlot = scanner.nextInt();
	    			Inventory.dropItem(itemSlot);
	    			}
	        } else if (num == 3) {
	            System.out.println("you seriously thought?");
	        } else if (num > 3 || num < 0) {
	            // invalid input
	        }
	    }
}
