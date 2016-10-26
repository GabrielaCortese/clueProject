import java.util.ArrayList;

public class Computer 
{
private static ArrayList hand;

public Computer(ArrayList hand) 
{

this.hand = hand;
}

public static ArrayList getHand() {
	return hand;
}

public void setHand(ArrayList newhand) {
	this.hand = newhand;
}

public void addToHand(String object)
{
this.hand.add(object);
}

}
