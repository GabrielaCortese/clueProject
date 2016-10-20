import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class clueProject
	{
		static ArrayList <String> mullenPeople = new ArrayList <String>();
		static ArrayList <String> mullenLocations = new ArrayList <String>();
		static ArrayList <String> weapons = new ArrayList <String>();
		static ArrayList <String> allTogether = new ArrayList <String>();
		static ArrayList <String> playerHand = new ArrayList <String>();
		static ArrayList <String> computerHand1 = new ArrayList <String>();
		static ArrayList <String> computerHand2 = new ArrayList <String>();
		
		static String confidentialPerson;
		static String confidentialPlace;
		static String confidentialWeapon;
		
		
		public static void main(String[] args)
			{
			System.out.println("Welcome to Clue!\nThere are two other players.\n");
			
			
			people();
			locations();
			weapons();
			allTogether();
			removeConfidential();
			deal();
			playerOptions();
			getCards();
			//confidentialFileReveal();
			}
			
			public static void people()
			{
					
			mullenPeople.add(new String("Joseph"));
			mullenPeople.add(new String("Devon"));
			mullenPeople.add(new String("Mr. McGuire"));
			mullenPeople.add(new String("Mr. Welling"));
			mullenPeople.add(new String("Erin"));
			mullenPeople.add(new String("Tramy"));
			
			Collections.shuffle(mullenPeople);
			
			confidentialPerson = mullenPeople.get(0);
			
					
			}
			
			public static void locations()
			{
					
			mullenLocations.add(new String("C-1"));
			mullenLocations.add(new String("Mr. Welling's office"));
			mullenLocations.add(new String("Spiessbach's classroom"));
			mullenLocations.add(new String("the baseball dugout"));
			mullenLocations.add(new String("the Rilko"));
			mullenLocations.add(new String("that shed next to the soccer fields"));
			mullenLocations.add(new String("the pond"));
			mullenLocations.add(new String("the cage"));
			mullenLocations.add(new String("the wrestling room"));
			
			Collections.shuffle(mullenLocations);
			
			confidentialPlace = mullenLocations.get(0);
			
			
			
			}
					
			public static void weapons()
			{
					
			weapons.add(new String("club car"));
			weapons.add(new String("stale breadstick"));
			weapons.add(new String("golf club"));
			weapons.add(new String("tennis racquet"));
			weapons.add(new String("Expo marker"));
			weapons.add(new String("gaggle of geese"));
			
			Collections.shuffle(weapons);
			
			confidentialWeapon = weapons.get(0);
			
			
				
			}
				
			public static void allTogether()
			{
				
			allTogether.add(new String("club car"));
			allTogether.add(new String("stale breadstick"));
			allTogether.add(new String("golf club"));
			allTogether.add(new String("tennis racquet"));
			allTogether.add(new String("Expo marker"));
			allTogether.add(new String("gaggle of geese"));	
			allTogether.add(new String("C-1"));
			allTogether.add(new String("Mr. Welling's office"));
			allTogether.add(new String("Spiessbach's classroom"));
			allTogether.add(new String("the baseball dugout"));
			allTogether.add(new String("the Rilko"));
			allTogether.add(new String("that shed next to the soccer fields"));
			allTogether.add(new String("the pond"));
			allTogether.add(new String("the cage"));
			allTogether.add(new String("the wrestling room"));
			allTogether.add(new String("Joseph"));
			allTogether.add(new String("Devon"));
			allTogether.add(new String("Mr. McGuire"));
			allTogether.add(new String("Mr. Welling"));
			allTogether.add(new String("Erin"));
			allTogether.add(new String("Tramy"));
			
			Collections.shuffle(allTogether);
			
			}
			
			public static void removeConfidential()
			{
				
			for(int i = allTogether.size()-1; i>=0; i--)
			{
			if (allTogether.get(i).equals(confidentialPlace) || allTogether.get(i).equals(confidentialPerson) || allTogether.get(i).equals(confidentialWeapon))
				{
				allTogether.remove(i);
				}		
			}
			}
			
			public static void confidentialFileReveal()
			{
			
			System.out.println(confidentialPerson + " committed the crime in " + confidentialPlace + " with the " + confidentialWeapon + ".");
			
			}
			
			public static void playerOptions()
				{
				System.out.println("There are 6 suspects. They are:\n");
				
				for(int i = 0; i < mullenPeople.size(); i++)
					{
					System.out.println((i+1) + ". " + mullenPeople.get(i));
					}
				System.out.println("\nThere are 9 locations. They are:\n");
				
				for(int i = 0; i < mullenLocations.size(); i++)
					{
					System.out.println((i+1) + ". " + mullenLocations.get(i));
					}
				
				System.out.println("\nThere are 6 weapons. They are:\n");
				
				for(int i = 0; i < weapons.size(); i++)
					{
					System.out.println((i+1) + ". " + weapons.get(i));
					}
				
				}
			
			public static void deal()
			{
				Collections.shuffle(allTogether);
			
				for(int i = allTogether.size()-1; i>=12; i--)
				{
					playerHand.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}	
				for(int i = allTogether.size()-1; i>=6; i--)
				{
					computerHand2.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}
				
				for(int i = allTogether.size()-1; i>=0; i--)
				{
					computerHand1.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}
			//	System.out.println(playerHand);
			//	System.out.println(computerHand1);
			//	System.out.println(computerHand2);
			}
			
			public static void getCards()
			{
				System.out.println("\nPlease press enter in order to recieve your cards.");
				Scanner userInput = new Scanner(System.in);
				String userDecision = userInput.nextLine();	
			
				for(int i = playerHand.size()-1; i>=0; i--)
				{
				System.out.println(playerHand.get(i));
				}

			}
	}
		
	











