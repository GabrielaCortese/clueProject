import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

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
		static int suspectDecision;
		static int locationDecision;
		static int weaponDecision;
		static Computer computer1 = new Computer(computerHand1);
		static Computer computer2 = new Computer(computerHand2);
		static boolean stillWantsToPlay;
		
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
			confidentialFileReveal();
			getCards();
			userChoice();
			boolean isMatch = compareTo(computer1);
			askAgain();
			confidentialFileStuff();
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
			
			Collections.shuffle(mullenPeople);
					
			}
			
			public static void locations()
			{
					
			mullenLocations.add(new String("C-1"));
			mullenLocations.add(new String("Spiessbach's classroom"));
			mullenLocations.add(new String("the baseball dugout"));
			mullenLocations.add(new String("the soccer shed"));
			mullenLocations.add(new String("the pond"));
			mullenLocations.add(new String("the cage"));
			
			Collections.shuffle(mullenLocations);
			
			confidentialPlace = mullenLocations.get(0);
			
			Collections.shuffle(mullenLocations);
			
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
			
			Collections.shuffle(weapons);
				
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
			allTogether.add(new String("Spiessbach's classroom"));
			allTogether.add(new String("the baseball dugout"));
			allTogether.add(new String("the soccer shed"));
			allTogether.add(new String("the pond"));
			allTogether.add(new String("the cage"));
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
				System.out.printf("%-30s %-30s %-30s\n", "Suspects","Locations","Weapons\n");
				for (int i = 0; i<6; i++)
				{
				System.out.printf("%-30s %-30s %-30s\n", (i+1) + ". " + mullenPeople.get(i),(i+1) + ". " + mullenLocations.get(i),(i+1) + ". " + weapons.get(i));
				}
			}
			
			public static void deal()
			{
				Collections.shuffle(allTogether);
			
				for(int i = allTogether.size()-1; i>=10; i--)
				{
					playerHand.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}	
				for(int i = allTogether.size()-1; i>=5; i--)
				{
					computerHand2.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}
				
				for(int i = allTogether.size()-1; i>=0; i--)
				{
					computerHand1.add(new String(allTogether.get(0)));
					allTogether.remove(0);
				}
				System.out.println(playerHand);
				System.out.println(computerHand1);
				System.out.println(computerHand2);
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
			
			public static void userChoice()
			{
				
			System.out.println("\nPlease enter the number of the person you suspect.");
			Scanner userInput = new Scanner(System.in);
			suspectDecision = userInput.nextInt();	
			
			System.out.println("Please enter the number of the location you suspect.");
			Scanner userInput2 = new Scanner(System.in);
			locationDecision = userInput.nextInt();
			
			System.out.println("Please enter the number of the weapon you suspect.");
			Scanner userInput3 = new Scanner(System.in);
			weaponDecision = userInput.nextInt();
			
			System.out.println("You chose " + mullenPeople.get(suspectDecision-1) + " in " + mullenLocations.get(locationDecision-1) + " with the " + weapons.get(weaponDecision-1) + ".");
			
			}
			
			public static boolean compareTo(Computer computer1)
			{
			
			boolean isMatch = false;
			ArrayList checkHand = computer1.getHand();
			for(int i = 0; i<5; i++)
			{
			if (mullenPeople.get(suspectDecision-1).equals(checkHand.get(i)) || mullenLocations.get(locationDecision-1).equals(checkHand.get(i)) || weapons.get(weaponDecision-1).equals(checkHand.get(i)))
					{
					isMatch = true;
					System.out.println("Player One has " + checkHand.get(i) + ".");
					break;
					}
				
			}
			if (isMatch = false)
			{
			boolean isMatch2 = compareToTwo(computer2);
			}
			return isMatch;
			}
			
			public static boolean compareToTwo(Computer computer2)
			{
			boolean isMatch2 = false;
			
			ArrayList checkHand = computer2.getHand();
			for(int i = 0; i<5; i++)
			{
			if (mullenPeople.get(suspectDecision-1).equals(checkHand.get(i)) || mullenLocations.get(locationDecision-1).equals(checkHand.get(i)) || weapons.get(weaponDecision-1).equals(checkHand.get(i)))
					{
					isMatch2 = true;
					System.out.println("Player Two has " + checkHand.get(i) + ".");
					break;
					}
				
			}
			return isMatch2;

			}
	
			public static void askAgain()
			{
			while(stillWantsToPlay = true)
			{
			System.out.println("\nWould you like to ask again or make an accusation? Press 1 for asking again and 2 for making an accusation.");
			Scanner userInput = new Scanner(System.in);
			int userDecision = userInput.nextInt();	
			if (userDecision == 1)
			{
			userChoice();
			compareTo(computer1);
			}
			if (userDecision == 2)
			{
			System.out.println("Please make your accusation.");
			stillWantsToPlay = false;
			break;
			}
			}
			}
			
			public static void confidentialFileStuff()
			{
				System.out.println("\nPlease enter the number of the person you suspect.");
				Scanner userInput = new Scanner(System.in);
				suspectDecision = userInput.nextInt();	
				
				System.out.println("Please enter the number of the location you suspect.");
				Scanner userInput2 = new Scanner(System.in);
				locationDecision = userInput.nextInt();
				
				System.out.println("Please enter the number of the weapon you suspect.");
				Scanner userInput3 = new Scanner(System.in);
				weaponDecision = userInput.nextInt();
				
				System.out.println("You have accused " + mullenPeople.get(suspectDecision-1) + " in " + mullenLocations.get(locationDecision-1) + " with the " + weapons.get(weaponDecision-1) + ".");
				if (mullenPeople.get(suspectDecision-1).equals(confidentialPerson) && mullenLocations.get(locationDecision-1).equals(confidentialPlace) && weapons.get(weaponDecision-1).equals(confidentialWeapon))
				{
				System.out.println("You have won the game! Your guesses match the contents of the confidential file.");
				}
				else
				{
				System.out.println("You have guessed incorrectly.");
				confidentialFileReveal();
				}
			}
			}
	
	
			

		
	











