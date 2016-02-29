package cs445assign1;

public class Bat extends Creature  implements Flyer {
	
	public Bat(String name)
	{
		super(name);
		
	}
	@Override
	void move() {
			fly();
	}
	void eat(Thing aThing)
	{
		if(aThing instanceof Creature)
			lastAte = aThing.toString();
		else if(! (aThing instanceof Creature))
			System.out.println(stringRep + " won't eat a " + aThing + ".");
		
	}
    //A Bat eats only Creatures in the same way that any Creature eats.
    public void	fly()
    {
    	System.out.println(stringRep + " is swooping through the dark.");
    }

}
