package behav;

public class FlightDec  implements Flight
{

	
	
	protected Flight flight; 
	
	public FlightDec(Flight c)
	{
		this.flight=c;
    }
	public void assemble()
	{
		this.flight.assemble();
		
	}
	
	

}
