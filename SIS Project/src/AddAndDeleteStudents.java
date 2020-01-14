import java.util.Scanner;

public class AddAndDeleteStudents {

	public static void main(String[] args) 
	{
	  //code to either add or delete students from the 'class'
		System.out.println("Add or Delete a Student");

		System.out.println("(1) Add a Student");
		System.out.println("(2) Delete a Student");
		
		Scanner intInput = new Scanner (System.in);
		int userChoice = intInput.nextInt();
		
		if(userChoice == 1)
		{
			System.out.println("You chose to add a student!");
			
			//having the user enter the first name of the student they want to add
			System.out.println("Please enter the first name of the student you want to add.");
			
			Scanner stringInput = new Scanner (System.in);
			String name1 = stringInput.nextLine();
			
			//what to do after name is entered
			
			//Ask to enter last name
			
			//Then finally ask for classes and grades
			
			//Figure out how to integrate GPA
			
		}
		
		if(userChoice == 2)
		{
			System.out.println("You chose to delete a student.");
			
			//Line to integrate the printing of the list of students
			//System.out.println();
			
			//having the user enter the *full name* of the student they wish to delete
			System.out.println("Please enter the name of the student you wish to take off the roster.");
			
			Scanner stringInput = new Scanner(System.in);
		    String name3 = stringInput.nextLine();
		    
		    //code to remove the student that the user has requested
		    //if(name )
//		    {
		    	//code to actually remove
//		    }
		    
//		    else
//		    {
//		    	System.out.println("I'm sorry, that name isn't in the database. Please try again.");
//		    }
		}
	}

}
