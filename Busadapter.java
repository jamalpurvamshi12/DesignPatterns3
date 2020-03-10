package structural;




public class Busadapter implements Bus{

	//Using Composition for adapter pattern
	private Place sc = new Place();
	

	public Stop getV1() 
	{
		return sc.getStop();
	}

	public Stop getV21()
	{
		Stop s=sc.getStop();
		return convertStop(s,10);
	}

	private Stop convertStop(Stop s, int i) 
	{
		return new Stop(s.getStop()/i);
	}

	public Stop getV2()
	{
		Stop s=sc.getStop();
		return convertStop(s,10);
		
	
	}
}

