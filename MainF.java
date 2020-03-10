package behav;

public class MainF {

	public static void main(String[] args) 
	{
		
		
	    Flight sportsCar = new ArmyF(new BasicFlight()); 
		sportsCar.assemble();
		System.out.println("\n*****"); 
		 Flight sportsLuxuryCar = new LuxurylF(new ArmyF(new BasicFlight()));
		sportsLuxuryCar.assemble(); 
		}  
		

	}


