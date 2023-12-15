/*****************************
 *   Nisanth, Taha, Muhib    *
 *        Room.java          *
 *                           *
 *         ICS 4U1           *
 *                           *
 *       Elder Bloods        *
 *    December 14, 2023      *
 ****************************/

package ElderBloody;

public class Room {

	// Int variables that track rooms next to one another.
	private int roomNumber;
	private int roomNorth;
	private int roomEast;
	private int roomSouth;
	private int roomWest;
	private boolean alreadyExplored = false; // Important when going through the story and not having things repeat.

	public Room(int roomNumber, int roomNorth, int roomEast, int roomSouth, int roomWest) { // Constructor.
		this.roomNumber = roomNumber;
		this.roomNorth = roomNorth;
		this.roomEast = roomEast;
		this.roomSouth = roomSouth;
		this.roomWest = roomWest;
	}

	public void drawRoom() { // Method used to draw the rooms.
		boolean exitNorth = this.roomNorth != roomNumber;
		boolean exitEast = this.roomEast != roomNumber;
		boolean exitSouth = this.roomSouth != roomNumber;
		boolean exitWest = this.roomWest != roomNumber;

		if (exitNorth && exitEast && exitSouth && exitWest) { // 4 exits.
			// if(ID == 0) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |______");
			System.out.println(" 			  	  ");
			System.out.println("______      ______");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		// Three Ways
		else if (!exitNorth && exitEast && exitSouth && exitWest) { // 3 exits.
			// else if(ID == 1) {
			System.out.println("                  ");
			System.out.println("                  ");
			System.out.println("__________________");
			System.out.println(" 		   	  	  ");
			System.out.println("______      ______");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
		} else if (exitNorth && !exitEast && exitSouth && exitWest) {
			// else if(ID == 2) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |      ");
			System.out.println("           |  	  ");
			System.out.println("______     |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		} else if (exitNorth && exitEast && !exitSouth && exitWest) {
			// else if(ID == 3) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |______");
			System.out.println(" 			  	  ");
			System.out.println("__________________");
			System.out.println("            	  ");
			System.out.println("                  ");
			System.out.println("                  ");
		} else if (exitNorth && exitEast && exitSouth && !exitWest) {
			// else if(ID == 4) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |______");
			System.out.println("      |	     	  ");
			System.out.println("      |     ______");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		// Two Ways
		else if (exitNorth && !exitEast && !exitSouth && exitWest) { // 2 exits.
			// else if(ID == 5) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |      ");
			System.out.println("           |  	  ");
			System.out.println("___________|      ");
			System.out.println(" 	        	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		} else if (exitNorth && exitEast && !exitSouth && !exitWest) {
			// else if(ID == 6) {
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |    |______");
			System.out.println("      |  	  	  ");
			System.out.println("      |___________");
			System.out.println("	        	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		} else if (!exitNorth && exitEast && exitSouth && !exitWest) {
			// else if(ID == 7) {
			System.out.println("                  ");
			System.out.println(" 	        	  ");
			System.out.println("       ___________");
			System.out.println("      | 	  	  ");
			System.out.println("      |     ______");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		} else if (!exitNorth && !exitEast && exitSouth && exitWest) {
			// else if(ID == 8) {
			System.out.println("                  ");
			System.out.println("	     	   	  ");
			System.out.println("___________       ");
			System.out.println("           |  	  ");
			System.out.println("______     |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		} else if (!exitNorth && exitEast && !exitSouth && exitWest) { // 1 exit.
			// else if(ID == 9) {
			System.out.println("                  ");
			System.out.println("	   			  ");
			System.out.println("__________________");
			System.out.println(" 			  	  ");
			System.out.println("__________________");
			System.out.println("	  	      	  ");
			System.out.println("	  	          ");
			System.out.println("                  ");
		} else if (exitNorth && !exitEast && exitSouth && !exitWest) {
			// else if(ID == 10) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |      ");
			System.out.println("      |	   |      ");
			System.out.println("      |	   |   	  ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		// One Way
		else if (exitNorth && !exitEast && !exitSouth && !exitWest) {
			// else if(ID == 11) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |____|      ");
		} else if (!exitNorth && !exitEast && exitSouth && !exitWest) {
			// else if(ID == 12) {
			System.out.println("       ____       ");
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		} else if (!exitNorth && !exitEast && !exitSouth && exitWest) {
			// else if(ID == 13) {
			System.out.println("                  ");
			System.out.println(" 	         	  ");
			System.out.println("_________________ ");
			System.out.println("                 |");
			System.out.println("_________________|");
			System.out.println("            	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		} else if (!exitNorth && exitEast && !exitSouth && !exitWest) {
			// else if(ID == 14) {
			System.out.println("                  ");
			System.out.println("        	   	  ");
			System.out.println(" _________________");
			System.out.println("|       	      ");
			System.out.println("|_________________");
			System.out.println("    	          ");
			System.out.println("                  ");
			System.out.println("                  ");
		} else if (!exitNorth && !exitEast && !exitSouth && !exitWest) { // 0 exits. (the boss room)
			System.out.println(" ________________ ");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|                |");
			System.out.println("|   	         |");
			System.out.println("|                |");
			System.out.println("|________________|");
		}
	}

	// Getters and setters
	public int getRoomNumber() {
		return this.roomNumber;
	}

	public int getRoomNorth() {
		return this.roomNorth;
	}

	public int getRoomEast() {
		return this.roomEast;
	}

	public int getRoomSouth() {
		return this.roomSouth;
	}

	public int getRoomWest() {
		return this.roomWest;
	}

	public boolean getRoomAlreadyExplored() {
		return this.alreadyExplored;
	}

	public void setRoomAlreadyExplored(boolean alreadyExplored) {
		this.alreadyExplored = alreadyExplored;
	}

}
