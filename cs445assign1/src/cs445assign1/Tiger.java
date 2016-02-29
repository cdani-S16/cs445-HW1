package cs445assign1;

public class Tiger extends Creature {

	@Override
	void move() {
		// TODO Auto-generated method stub
		//{name} {class} has just pounced.
		System.out.println(stringRep + " has just pounced.");
	}
	public Tiger(String name)
	{
		super(name);
	}
}
