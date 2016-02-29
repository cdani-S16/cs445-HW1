package cs445assign1;
//import java.lang.Object;

public class Thing {
	private String nameThing;
	protected String stringRep;
	public String toString()
	{
		return stringRep;
	}
	
	public Thing(String name)
	{
		nameThing = name;
		if(getClass().getSimpleName().equals("Thing"))
		{
			
			stringRep = name;
		}
		else
			stringRep = name + " " + getClass().getSimpleName();
		
	}
}
