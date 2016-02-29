package cs445assign1;
/*
import cs445assign1.Ant;
import cs445assign1.Bat;
import cs445assign1.Creature;
import cs445assign1.Fly;
import cs445assign1.Flyer;
import cs445assign1.Thing;
import cs445assign1.Tiger;
*/


public class TestCreature {

	static int	CREATURE_COUNT = 3; 
    static int	THING_COUNT = 4; 
	
    public static void	main(java.lang.String[] args) 
	{

    	
    	Thing[] thingArray = new Thing[THING_COUNT];
    	/*
    	Thing Table = new Thing("Table");
    	Thing Chair = new Thing("Chair");
    	*/
    	thingArray[0] = new Tiger("Sherkk");
    	thingArray[1] = new Thing("Chair");
    	thingArray[2] = new Tiger("Tira");
    	thingArray[3] = new Thing("Talb");
    	
    	
    	System.out.println("Thing:");
    	for(int j = 0; j< THING_COUNT; j++)
    		System.out.println(thingArray[j]);
    	

    	System.out.println("\nCreatures:");
    	
    	Creature[] creatureArray = new Creature[CREATURE_COUNT];
    	/*
    	Fly flyObj = 
    	Ant antObj = 
    	Bat batObj = */
    	creatureArray[0] = new Fly("Housefly");
    	creatureArray[1] = new Ant("Hesit");
    	creatureArray[2] = new Bat("Flappy-Squeak");
    	

    	for(int j = 0; j< CREATURE_COUNT; j++)
    		System.out.println(creatureArray[j].toString());
    	
    	Bat batObj = new Bat("Flappy Squeak");
    	Fly flyObj = new Fly("Housefly");
    			
    	creatureArray[1].move();
    	batObj.eat(flyObj);
    	batObj.fly();
    	batObj.whatDidYouEat();
    	System.out.println(batObj.toString());
    	creatureArray[1].eat(batObj);
    	
    	
	}
	
}
