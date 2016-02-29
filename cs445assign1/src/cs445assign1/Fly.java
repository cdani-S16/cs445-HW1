package cs445assign1;

public class Fly extends Creature implements Flyer {
	public Fly(String name)
	{
		super(name);
	}
	@Override
	void move() {
			fly();
	}
	void eat(Thing aThing)
	{
		if(aThing.getClass().getSimpleName().equals("Thing"))
			lastAte = aThing.toString();
		else if(! (aThing.getClass().getSimpleName().equals("Thing")))
			System.out.println(stringRep + " won't eat a " + aThing);
	}
    
    public void	fly()
    {
    	System.out.println(stringRep + " is buzzing around in flight.");
    }

     
}
