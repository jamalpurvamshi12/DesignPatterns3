package structural;

public class Main {

	public static void main(String[] args)
	{
		Busadapter();

	}

	private static void Busadapter() 
	{
		
		
			Busadapter sockAdapter = new Busadapter();
			Stop v3 = getStop(sockAdapter,3);
			Stop v12 = getStop(sockAdapter,12);
			Stop v120 = getStop(sockAdapter,120);
			System.out.println("v3 stop using Object Adapter="+v3.getStop());
			System.out.println("v12 stop using Object Adapter="+v12.getStop());
			System.out.println("v120 stop using Object Adapter="+v120.getStop());
		}
		
		
		private static Stop getStop(structural.Busadapter sockAdapter, int i)
		{
			
			switch (i)
			{
			case 3: return sockAdapter.getV1();
			case 12: return sockAdapter.getV21();
			case 120: return sockAdapter.getV2();
			default: return sockAdapter.getV1();
			}
		
	}

		
	
	}

