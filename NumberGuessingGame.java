// Java program for the above approach
import java.util.Scanner;
import java.util.InputMismatchException;
public class NumberGuessingGame {

	// Function that implements the
	// number guessing game
	public static void guessingNumberGame()
	{
	int r=1;
	char wb='r'; //Repeat or Finish

		// Scanner Class
		Scanner sc = new Scanner(System.in);
	try {
		int s=0;
		int c=0;
		//int r=1;
		int it, K=0;
		System.out.println("\t___________________________________________________________________________________________________________");
		System.out.println("\tYou will try to guess that number. If your guess wrong, I will tell you if you guessed too high or too low.");
		System.out.println("\t___________________________________________________________________________________________________________");
		while(wb =='r' || wb =='R')
	{
		// Generate the numbers
		int number = 1 + (int)(30* Math.random());

		//System.out.println(" Gusesed Number  " +number);
	
		// Given K trials
		
		System.out.println("\t");
		System.out.println("----------------------------------------------------------");
		System.out.println("**Enter The Number of  Attempts.... You want to try !!!!! ");
		System.out.println("----------------------------------------------------------");
 		
		it=sc.nextInt();
		K = it;

		int i, guess;
		//System.out.println("___________________________________________________________________________________________________________");
		//System.out.println("You will try to guess that number. If your guess wrong, I will tell you if you guessed too high or too low.");
		
		//System.out.println("___________________________________________________________________________________________________________");
		//System.out.println("A number is chosen "+ " between 1 to 100."+ "Guess the number "+ " within " + K+" Trials.");
		System.out.println("\t");
		System.out.println("ROUND #"+r);
		System.out.println("You have "+K+" tries to get the number.");
		// Iterate over K Trials
		for (i = 0; i < K; i++) 
		{
			c=(c+1);
			//System.out.println("count  :" +c);
			
			System.out.println("-----------------------------------------------");
			System.out.println("Attempt: #"+ c+" -> Try to guess any number bewteen: (1-100) ");
			System.out.println("-----------------------------------------------");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed

			if (number == guess) 
			{
				
				System.out.println("\t");
				System.out.println("-----------------------------------------");
				System.out.println("-----------------------------------------");	
				System.out.println("Congratulations!"+ " You guessed the number.");
				//System.exit(0);
				s=s+1;
				
				System.out.println("-----------------------------------------");
				System.out.println("\tScore After ROUND #"+r);	
				System.out.println("\tTotal Number of attempts "+c);
				System.out.println("\tSuccessful Attempts  : " +  s);
				System.out.println("\tScore  : " +  s);
				System.out.println("\t----------------------------------");
				
				System.out.println("-----------------------------------------------");
				System.out.println("    Repeat ->"+"R  "+ "Finish ->" + "F  ");
				System.out.println("-----------------------------------------------");
			do{
			
				r=r+1;
			
			 wb = sc.next().charAt(0);
			} while(wb!='r' && wb != 'R'  && wb!='f' && wb !='F');
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println("The number is "+ "greater than " + guess);
					
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is"+ " less than " + guess);
				
			}
			else 
			{
			System.out.println("\t");
			System.out.println("Your Guessed not matched \nGussed Number Was: "+number+ " For Round #"+r);
			System.out.println("\t---------------------------------------------------------------");
			System.out.println("\t Your all attempts exhausted !! Select Below option to Continue");
			System.out.println("\t---------------------------------------------------------------");
			System.out.println("\t");
			System.out.println("-----------------------------------------");
			System.out.println("\tScore After ROUND #"+r);	
			System.out.println("\tTotal Number of attempts "+c);
			System.out.println("\tSuccessful Attempts  : " +  s);
			System.out.println("\tScore  : " +  s);
			System.out.println("\t----------------------------------");
			
			System.out.println("----------------------");
			System.out.println("Repeat ->"+"R  "+ "Finish ->" + "F ");
			System.out.println("----------------------");
			do{
			
				r=r+1;
			
			 wb = sc.next().charAt(0);
			} while(wb!='r' && wb != 'R'  && wb!='f' && wb !='F');

			}
	

		}

	}
} catch (InputMismatchException e)
 {
System.out.println("\t YOU  HAVE ENTERED INVALID DATA!  PLEASE ENTER INTEGER VALUE ONLY ");
System.out.println("\t \t  !!!!!!!!!!!!!!!!  GAME START AGAIN  !!!!!!!!!!!!!!!");
			
  }
	
	}

	// Driver Code
	public static void main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}
