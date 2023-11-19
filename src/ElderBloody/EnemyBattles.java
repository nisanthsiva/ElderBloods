package ElderBloody;
import java.util.Scanner;

public class EnemyBattles {
	
	private static Scanner scanner;


	public EnemyBattles(Scanner scanner)
	  {
		  EnemyBattles.scanner = scanner;
		  
	  }
    public static void startTVBattle(Player player) {
    	 
    	Enemy titan = new Enemy(40, 10, 30, "Titan Vanguard");  
     
      
    	System.out.println("In the vast expanse of the forbidden land, you encounter an ancient being – the Titan.");
    	
        System.out.println("The ground trembles beneath its colossal footsteps, and the air thickens with an eerie silence.\n");
    

       
        while (player.getHealth() > 0 && titan.getHealth() > 0) {
            System.out.println(titan.getName() + " has " + titan.getHealth() + " health remaining");
            System.out.println("1:Fight\t 2:Bag\t 3:Run");
            int num = scanner.nextInt();

            PlayerChoice.playerChoice(num, titan, player, scanner);
        }
    }
    
    public static void startSRBattle(Player player) {
   	 
    	  Enemy fallen = new Enemy(35, 10, 35, "Sentinel Revenant");
     
    	  System.out.println("The Sentinel Revenant manifests, an enigmatic entity dancing amidst the shadows.");
    	    System.out.println("Its presence flickers, a specter that defies the laws of space and time.\n");

       
        while (player.getHealth() > 0 && fallen.getHealth() > 0) {
            System.out.println(fallen.getName() + " has " + fallen.getHealth() + " health remaining");
            System.out.println("1:Fight\t 2:Bag\t 3:Run");
            int num = scanner.nextInt();

            PlayerChoice.playerChoice(num, fallen, player, scanner);
        }
    }
    
    public static void startWRTBattle(Player player) {
    	
    	 Enemy zoomstalker = new Enemy(30, 40, 10, "Windrunner Titan");

    	 	System.out.println("...");

     
      while (player.getHealth() > 0 && zoomstalker.getHealth() > 0) {
          System.out.println(zoomstalker.getName() + " has " + zoomstalker.getHealth() + " health remaining");
          System.out.println("1:Fight\t 2:Bag\t 3:Run");
          int num = scanner.nextInt();

          PlayerChoice.playerChoice(num, zoomstalker, player, scanner);
      }
  }
    
    public static void startAOBattle(Player player) {
      	 
      Enemy berserker = new Enemy(45, 5, 30, "Ashen Overlord");
   
      
    
      System.out.println("You've faced the Titan Vanguard, unwavering in strength, the First of the Titans,");
      System.out.println("A colossus whose thunderous steps quake the very earth beneath your feet.\n");

      System.out.println("The Sentinel Revenant, an elusive specter dancing in shadows, the Second founding Titan,");
      System.out.println("Whispers of its presence weave tales of haunting darkness, lurking beyond sight.\n");

      System.out.println("The Windrunner Titan, swift as the gale, the Third Titan,");
      System.out.println("Its silhouette blurs through tempests, a force unmatched in its lightning-speed assaults.\n");

      System.out.println("Now, here you stand before me - the Ashen Overlord,");
      System.out.println("A being of fire and ash, a sovereign standing before your final challenge.\n");
      
      System.out.println("The flames of destiny bring you to me, mortal, after vanquishing my kin.\n");


     
      while (player.getHealth() > 0 && berserker.getHealth() > 0) {
          System.out.println(berserker.getName() + " has " + berserker.getHealth() + " health remaining");
          System.out.println("1:Fight\t 2:Bag\t 3:Run");
          int num = scanner.nextInt();

         PlayerChoice.playerChoice(num, berserker, player, scanner);
      }
    }
  
    
    public static void startBossBattle(Player player) {
        Enemy bossEnemy = new Enemy(50, 50, 50, "இந்திரன");

        System.out.println("Prepare to face a formidable opponent: " + bossEnemy.getName());
        System.out.println("You believe yourself ready for this challenge, " + player.getName() + "?");
        String playerResponse = scanner.nextLine();
        System.out.println(playerResponse);
        System.out.println("Bravery will be tested against overwhelming strength. Let the clash begin!");

        while (player.getHealth() > 0 && bossEnemy.getHealth() > 0) {
            System.out.println(bossEnemy.getName() + " currently has " + bossEnemy.getHealth() + " health.");
            System.out.println("Choose your action: 1:Fight  2:Bag  3:Run");
            int num = scanner.nextInt();

            PlayerChoice.playerChoice(num, bossEnemy, player, scanner);
        }
    }

  
}
