package ElderBloody;

public class Room {

	private int roomNumber;
	private boolean exitNorth; 
	private boolean exitEast;
	private boolean exitSouth;
	private boolean exitWest;
		
	public Room(int roomNumber, boolean exitNorth, boolean exitEast, boolean exitSouth, boolean exitWest) {
		this.roomNumber = roomNumber;
		this.exitNorth = exitNorth;
		this.exitEast = exitEast;
		this.exitSouth = exitSouth;
		this.exitWest = exitWest;
	}
	
	public void drawRoom() {
		if(exitNorth && exitEast && exitSouth && exitWest) {
	    //if(ID == 0) {
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
		else if(!exitNorth && exitEast && exitSouth && exitWest) {
		//else if(ID == 1) {
			System.out.println("                  ");
			System.out.println("                  ");
			System.out.println("__________________");
			System.out.println(" 		   	  	  ");
			System.out.println("______      ______");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
		}
		else if(exitNorth && !exitEast && exitSouth && exitWest) {
		//else if(ID == 2) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |      ");
			System.out.println("           |  	  ");
			System.out.println("______     |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		else if(exitNorth && exitEast && !exitSouth && exitWest) {
		//else if(ID == 3) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |______");
			System.out.println(" 			  	  ");
			System.out.println("__________________");
			System.out.println("            	  ");
			System.out.println("                  ");
			System.out.println("                  ");
		}
		else if(exitNorth && exitEast && exitSouth && !exitWest) {
		//else if(ID == 4) {
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
		else if(exitNorth && !exitEast && !exitSouth && exitWest) {
		//else if(ID == 5) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("______|    |      ");
			System.out.println("           |  	  ");
			System.out.println("___________|      ");
			System.out.println(" 	        	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		}
		else if(exitNorth && exitEast && !exitSouth && !exitWest) {
		//else if(ID == 6) {
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |    |______");
			System.out.println("      |  	  	  ");
			System.out.println("      |___________");
			System.out.println("	        	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		}
		else if(!exitNorth && exitEast && exitSouth && !exitWest) {
		//else if(ID == 7) {
			System.out.println("                  ");
			System.out.println(" 	        	  ");
			System.out.println("       ___________");
			System.out.println("      | 	  	  ");
			System.out.println("      |     ______");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		else if(!exitNorth && !exitEast && exitSouth && exitWest) {
		//else if(ID == 8) {
			System.out.println("                  ");
			System.out.println("	     	   	  ");
			System.out.println("___________       ");
			System.out.println("           |  	  ");
			System.out.println("______     |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		else if(!exitNorth && exitEast && !exitSouth && exitWest) {
		//else if(ID == 9) {
			System.out.println("                  ");
			System.out.println("	   			  ");
			System.out.println("__________________");
			System.out.println(" 			  	  ");
			System.out.println("__________________");
			System.out.println("	  	      	  ");
			System.out.println("	  	          ");
			System.out.println("                  ");
		}
		else if(exitNorth && !exitEast && exitSouth && !exitWest) {
		//else if(ID == 10) {
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
		else if(exitNorth && !exitEast && !exitSouth && !exitWest) {
		//else if(ID == 11) {
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |____|      ");
		}
		else if(!exitNorth && !exitEast && exitSouth && !exitWest) {
		//else if(ID == 12) {
			System.out.println("       ____       ");
			System.out.println("      |    |      ");
			System.out.println("      |	   |	  ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |      ");
			System.out.println("      |    |	  ");
			System.out.println("      |	   |      ");
			System.out.println("      |    |      ");
		}
		else if(!exitNorth && !exitEast && !exitSouth && exitWest) {
		//else if(ID == 13) {
			System.out.println("                  ");
			System.out.println(" 	         	  ");
			System.out.println("_________________ ");
			System.out.println("                 |");
			System.out.println("_________________|");
			System.out.println("            	  ");
			System.out.println(" 	              ");
			System.out.println("                  ");
		}
		else if(!exitNorth && exitEast && !exitSouth && !exitWest) {
		//else if(ID == 14) {
			System.out.println("                  ");
			System.out.println("        	   	  ");
			System.out.println(" _________________");
			System.out.println("|       	      ");
			System.out.println("|_________________");
			System.out.println("    	          ");
			System.out.println("                  ");
			System.out.println("                  ");
		}
		
	}		
	
}