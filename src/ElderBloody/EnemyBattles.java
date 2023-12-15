/*****************************
 *   Nisanth, Taha, Muhib    *
 *    EnemyBattles.java      *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;


public class EnemyBattles {
	
		// Instantiates all the enemies.
		public static Enemy titan = new Enemy(30, "Titan Vanguard",false); 
		public static Enemy fallen = new Enemy(35, "Sentinel Revenant",false);
		public static Enemy zoomstalker = new Enemy(10, "Windrunner Titan",false);
		public static  Enemy berserker = new Enemy(30, "Ashen Overlord",false);
		public static  Enemy bossEnemy = new Enemy(50, "இந்திரன",false);

    public static void startTVBattle(Player player) throws InterruptedException { // Method used to visualize a battle scene in the console. (works the same for methods below)
    	 
    	 
     

    	System.out.println("In the vast expanse of the forbidden land, you encounter an ancient being – the Titan."); // lore
    	
        System.out.println("The ground trembles beneath its colossal footsteps, and the air thickens with an eerie silence.\n");
    

       
        while (player.getHealth() > 0 && titan.getHealth() > 0) { // if the user and the enemy both have remaining hp
            System.out.println(titan.getName() + " has " + titan.getHealth() + " health remaining"); // tells the user the hp levels
           System.out.println("1:Fight\t 2:Bag\t 3:Run");
            String input = Main.scanner.nextLine(); // takes user input
            for(int i =0; i < 50; i++) {
            System.out.println(); //  cleans the console up by adding blank space
            }
            PlayerChoice.playerChoice(input, titan, player, Main.scanner); // takes the input and decides what to do with it to which enemy
            
      
        }
        	titan.alreadyFought = true; // means the enemy has been defeated
      
    }
    
    public static void startSRBattle(Player player) throws InterruptedException {
   	  
    	
     
    	  System.out.println("The Sentinel Revenant manifests, an enigmatic entity dancing amidst the shadows."); // Lore.
    	    System.out.println("Its presence flickers, a specter that defies the laws of space and time.\n");

       
        while (player.getHealth() > 0 && fallen.getHealth() > 0) { // Used to make sure both beings are alive.
            System.out.println(fallen.getName() + " has " + fallen.getHealth() + " health remaining"); // Informs the user of the enemies health.
            System.out.println("1:Fight\t 2:Bag\t 3:Run"); // Asks the user what they want to do.
            String input = Main.scanner.nextLine(); 
            for(int i =0; i < 50; i++) { // Used to seperate the text from before so that the console is clean.
                System.out.println();
                }
            PlayerChoice.playerChoice(input, fallen, player, Main.scanner); // Used for attacks.
            
        }
        fallen.alreadyFought = true; // Sets alreadyFought to true for that enemy so that it is no longer applicable.
    }
    
    public static void startWRTBattle(Player player) throws InterruptedException {
    	
    

    	 	System.out.println("..."); // Lore.

     
      while (player.getHealth() > 0 && zoomstalker.getHealth() > 0) { // Used to make sure both beings are alive.
          System.out.println(zoomstalker.getName() + " has " + zoomstalker.getHealth() + " health remaining"); // Informs the user of the enemies health.
          System.out.println("1:Fight\t 2:Bag\t 3:Run"); // Asks the user what they want to do.
          String input = Main.scanner.nextLine();
          for(int i =0; i < 50; i++) { // Used to seperate the text from before so that the console is clean.
              System.out.println();
              }
          PlayerChoice.playerChoice(input, zoomstalker, player, Main.scanner); // Used for attacks.
          
      }
      zoomstalker.alreadyFought = true; // Sets alreadyFought to true for that enemy so that it is no longer applicable.
  }
    
    public static void startAOBattle(Player player) throws InterruptedException {
      	 
 
      
    
      System.out.println("You've faced the Titan Vanguard, unwavering in strength, the First of the Titans,"); // Lore.
      System.out.println("A colossus whose thunderous steps quake the very earth beneath your feet.\n");

      System.out.println("The Sentinel Revenant, an elusive specter dancing in shadows, the Second founding Titan,");
      System.out.println("Whispers of its presence weave tales of haunting darkness, lurking beyond sight.\n");

      System.out.println("The Windrunner Titan, swift as the gale, the Third Titan,");
      System.out.println("Its silhouette blurs through tempests, a force unmatched in its lightning-speed assaults.\n");

      System.out.println("Now, here you stand before me - the Ashen Overlord,");
      System.out.println("A being of fire and ash, a sovereign standing before your final challenge.\n");
      
      System.out.println("The flames of destiny bring you to me, mortal, after vanquishing my kin.\n");


     
      while (player.getHealth() > 0 && berserker.getHealth() > 0) { // Used to make sure both beings are alive.
          System.out.println(berserker.getName() + " has " + berserker.getHealth() + " health remaining"); // Informs the user of the enemies health.
          System.out.println("1:Fight\t 2:Bag\t 3:Run"); // Asks the user what they want to do.
          String input = Main.scanner.nextLine();
          PlayerChoice.playerChoice(input, berserker, player, Main.scanner); // Used for attacks.
          
      }
      berserker.alreadyFought = true; // Sets alreadyFought to true for that enemy so that it is no longer applicable.
    }
  
    
    public static void startBossBattle(Player player) throws InterruptedException {
      

        System.out.println("Prepare to face a formidable opponent: " + bossEnemy.getName()); // Lore.
        System.out.println("You believe yourself ready for this challenge, " + player.getName() + "?"); // Interacts with the user.
        String playerResponse = Main.scanner.nextLine();
        System.out.println(playerResponse);
        System.out.println("Bravery will be tested against overwhelming strength. Let the clash begin!");

        while (player.getHealth() > 0 && bossEnemy.getHealth() > 0) { // Used to make sure both beings are alive.
            System.out.println(bossEnemy.getName() + " currently has " + bossEnemy.getHealth() + " health."); // Informs the user of the enemies health.
            System.out.println("Choose your action: 1:Fight  2:Bag  3:Run"); // Asks the user what they want to do.
            String input = Main.scanner.nextLine();
            for(int i =0; i < 50; i++) { // Used to seperate the text from before so that the console is clean.
                System.out.println();
                }
            PlayerChoice.playerChoice(input, bossEnemy, player, Main.scanner); // Used for attacks.
            
        }
        bossEnemy.alreadyFought = true; // Sets alreadyFought to true for that enemy so that it is no longer applicable.
    }

  
}
