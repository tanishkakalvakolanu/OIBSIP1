import java.util.*;
class Findout
{
	public void guess()
	{
		
		Scanner sc=new Scanner(System.in);
	    int value = 1 + (int)(100 * Math.random());
		System.out.println("A Random Number is Generated.");
		int ch=5;
		System.out.println("Guess the number in 5 trials");
		int c=100,i=1;
		for(i=1;i<=ch;i++)
		{
			
			System.out.println("Guess the number Enter it.Chance no"+(i));
			int number=sc.nextInt();
			if(number==value)
			{
				System.out.println("Congratulations!...You won it");
				System.out.println("Your score is "+c);
				break;
			}
			else if(number>value)
			{
				System.out.println("Your Number is less than "+number);
				
				c-=20;
			}
			else
			{
				System.out.println("Your Number is greater than "+number);
				c-=20;
			}
			
		} 
		if(i>ch)
		{
		    System.out.println("You Lost it");
			System.out.println("The number is "+value);
			System.out.println("Your score is: 0");
		}
	}
}
class NumberGame
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
    	Findout f=new Findout();
    	System.out.println("Shall we start it ? : Yes/No");
    	String str=sc.nextLine();
    	while(!str.equalsIgnoreCase("yes") && !str.equalsIgnoreCase("y"))
    	{
    		f.guess();
    		System.out.println("Do you want to play again ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game Over!!!");
    }
}