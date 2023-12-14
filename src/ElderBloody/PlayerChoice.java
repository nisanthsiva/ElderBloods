package ElderBloody;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerChoice {
	  public static boolean lightningActive; // determines if you've been struck by lightning or not
	
	  public static void playerChoice(String input, Enemy enemy, Player player, Scanner scanner)throws InterruptedException {
		
	        if (input.equals("1")) {
	            System.out.println("1. Slam\t 2. Lion's Claw");
	            System.out.println("3. Shadow Slash\t 4. Lighting Fury");
	            try {  //  trys it,
	            	int attack = scanner.nextInt(); // takes the user intput as an int
	            if (attack == 1) {
	            	
	            	enemy.performRandomAttack(player); // calls a static method in enemy
	            	Thread.sleep(3000); // waits 3 seconds
	            	player.slam(enemy); // calls a method in player
	            	Thread.sleep(3000); 
	            	
	            } else if (attack == 2) {
	            	enemy.performRandomAttack(player); 
	            	Thread.sleep(3000);
	                player.lionsClaw(enemy);
	                Thread.sleep(3000);
	                
	            } else if (attack == 3) {
	            	enemy.performRandomAttack(player);
	            	Thread.sleep(3000);
	            	player.shadowSlash(enemy);
	            	Thread.sleep(3000);
	 
	            } 
	            
	            if(lightningActive && attack == 4) { 
	            	enemy.performRandomAttack(player);
	            	Thread.sleep(3000);
	                player.lightningFury(enemy);
	                Thread.sleep(3000);
	      
	            }
	            
	            else if(!lightningActive && attack == 4) {
	            		System.out.println("You Musnt Do That Now!"); // if you haven't been struck by lightning
	            		Thread.sleep(1000);
	            	}
	           
	            }
	            catch(InputMismatchException e){ //  if the user doesn't enter an int then it catches the input mismatch
	            	scanner.nextLine();
	            }
	        }
	         else if (input.equals("2")) {
	   			// access inventory
	   			System.out.println("Press 'U' to use an item.");
	   			System.out.println("Press 'X' to drop an item.");
	   			String playerInput = scanner.nextLine();

	    		if(playerInput.equals("U")) {
	    			System.out.println("Which item slot would you like to use?");
	    			int itemSlot = scanner.nextInt();
	    			try {
	    			Inventory.useItem(itemSlot);
	    			}
	    			catch(ArrayIndexOutOfBoundsException e) {
	    				System.out.println("Error");
	    			}
	    		}    		
	    		else if(playerInput.equals("X")) {
	    			System.out.println("Which item slot would you like to drop?");
	    			int itemSlot = scanner.nextInt();
	    			Inventory.dropItem(itemSlot);
	    			}
	        } else if (input.equals("3")) {
	            System.out.println("you seriously thought?");
	        } else {
	        	
	        }
	    }
	  
	  	
	  
	  }


