package cs445assign1;

public abstract class Creature extends Thing {
	protected String lastAte = null;
	public Creature(String name)
	{
		super(name);
	}
	 void eat(Thing aThing)
	 {
		 //{this object} has just eaten a {a Thing}
		 System.out.println(this + " has just eaten a " + aThing.toString());
		 lastAte = aThing.toString();
	 }
     //Creatures may be asked to eat various Things.
	 abstract  void	move();
     //Tell the Creature to move.
		void whatDidYouEat()
		{
	    if(lastAte == null)
	   	 {
	   		 System.out.println(stringRep + " has had nothing to eat!");
	   	 }
	   	 else
	   		 System.out.println(stringRep + " has eaten a " + lastAte);
	    }
}
