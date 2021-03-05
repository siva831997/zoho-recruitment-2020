import java.util.*;

public class PatternPrinting{

	public static void main(String[] args) 
	{
                                      //get the user input
		Scanner sc = new Scanner(System.in);
	                    String input = sc.nextLine();
		input = input.substring((input.length()/2), input.length()) + input.substring(0,(input.length()/2));
		//iterate the loop to print the output 
		for(int i = 0; i< input.length(); i++)
		{
			System.out.println((new String(new char[input.length() - 1 - i]).replace('\0', ' ')) + input.substring(0,i+1));
		}	
		sc.close();
	}
}