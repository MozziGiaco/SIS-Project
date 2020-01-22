import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class AddAndDeleteStudents
	{
		static Scanner intInput = new Scanner(System.in);
		static Scanner strInput = new Scanner(System.in);
		static int userChoice;
		static String class1;
		static String class2;
		static String class3;
		static int i;
		static String fullName;
		static String firstName;
		static String lastName;
		static String firstName1;
		static String lastName2;

		// TODO try to implement a time delay in certain areas to enhance the program,
		// and mimic the thinking of a computer when running the program to either add
		// or delete a student

		public static void addingAndDeleting()
			{
				// Array list for the Student
				ArrayList<Student> roster = new ArrayList<Student>();

				// code to either add or delete students from the 'class'
				System.out.println("Add or Delete a Student");

				System.out.println("(1) Add a Student");
				System.out.println("(2) Delete a Student");

				userChoice = intInput.nextInt();

				if (userChoice == 1)
					{
						System.out.println("You chose to add a student!");

						// Line to integrate the printing of the list of students
						Roster.load();

						for (int i = 0; i < Roster.roster.size(); i++)
							{
								addingAndDeleting();
								System.out.println("Student: " + Roster.roster.get(i).getFullName().toUpperCase()
										+ " + GPA: " + Roster.roster.get(i).getGpa());
							}
					}
			}

		// TODO try to implement a time delay in certain areas to enhance the program,
		// and mimic the thinking of a computer when running the program to either add
		// or delete a student

		public static void addingAndDeleting2()
			{

				// having the user enter the full name of the student they want to add
				System.out.println("Please enter the FULL name of the student you want to add.");

				fullName = strInput.nextLine();

				// telling the user the choice of classes for their new student
				System.out.println("Keep in mind, there are three classes available for the new student...");
				System.out.println("Algebra");
				System.out.println("Biology");
				System.out.println("and English");
				System.out.println("These can be entered in any order you wish.");

				// having the user enter the first class and corresponding grade for their new
				// student
				System.out.println("Please enter the first class and corresponding grade for the new student.");
				System.out.println("Written as A+, D-, F, B, etc.");
				System.out.println("Ex. English A-");

				class1 = strInput.nextLine();

				// having the user enter the second class and corresponding grade for their new
				// student
				System.out.println("Please enter the second class and corresponding grade for the new student.");

				class2 = strInput.nextLine();

				// having the user enter the third and final class and corresponding grade for
				// their new student
				System.out.println("Please enter the third class and corresponding grade for the new student.");

				class3 = strInput.nextLine();

				Class[] classArray = new Class[3];

//			classArray[1] = class1;
//			classArray[2] = class2;
//			classArray[3] = class3;

				if (userChoice == 2)

					{
						System.out.println("You chose to delete a student.");

						// Line to integrate the printing of the list of students
						Roster.load();

						for (i = 0; i < Roster.roster.size(); i++)
							{
								// code to either add or delete students from the 'class'
								System.out.println("Add or Delete a Student");

								System.out.println("(1) Add a Student");
								System.out.println("(2) Delete a Student");

								userChoice = intInput.nextInt();

								if (userChoice == 1)
									{
										System.out.println("You chose to add a student!");
										// Line to integrate the printing of the list of students
										for (i = 0; i < Roster.getRoster().size(); i++)
											{
												System.out.println(Roster.getRoster().get(i).getFullName());
											}

										// having the user enter the first name of the student they want to add
										System.out
												.println("Please enter the first name of the student you want to add.");

										firstName = strInput.nextLine();

										// having the user enter the last name of the student they want to add
										System.out
												.println("Please enter the last name of the student you want to add.");

										lastName = strInput.nextLine();

										// telling the user the choice of classes for their new student
										System.out.println(
												"Keep in mind, there are three classes available for the new student...");
										System.out.println("Algebra");
										System.out.println("Biology");
										System.out.println("and English");
										System.out.println("These can be entered in any order you wish.");

										// having the user enter the first class and corresponding grade for their new
										// student
										System.out.println(
												"Please enter the first class and corresponding grade for the new student.");
										System.out.println("Written as A+, D-, F, B, etc.");
										System.out.println("Ex. English A-");

										class1 = strInput.nextLine();

										// having the user enter the second class and corresponding grade for their new
										// student
										System.out.println(
												"Please enter the second class and corresponding grade for the new student.");

										class2 = strInput.nextLine();

										// having the user enter the third and final class and corresponding grade for
										// their new student
										System.out.println(
												"Please enter the third class and corresponding grade for the new student.");

										class3 = strInput.nextLine();

										// Figure out how to integrate GPA

									}

								if (userChoice == 2)
									{
										System.out.println("You chose to delete a student.");

										// Line to integrate the printing of the list of students
										for (i = 0; i < Roster.getRoster().size(); i++)
											{
												System.out.println(Roster.getRoster().get(i).getFullName());
											}

										// having the user enter the *first name* of the student they wish to delete
										System.out.println(
												"Please enter the first name of the student you wish to take off the roster.");

										firstName1 = strInput.nextLine();

										// having the user enter the *last name* of the student they wish to delete
										System.out.println(
												"Please enter the last name of the student you wish to take off the roster.");

										lastName2 = strInput.nextLine();

										// TODO make sure the program can scan through the roster in order to ensure
										// that the name the user entered to delete is actually a 'real' name in said
										// roster

										// code to remove the student that the user has requested
										// if(name )
										System.out
												.println("Student: " + Roster.roster.get(i).getFullName().toUpperCase()
														+ " + GPA: " + Roster.roster.get(i).getGpa());
									}

								// having the user enter the full name of the student they wish to delete
								System.out.println(
										"Please enter the FULL name of the student you wish to take off the roster.");

								firstName1 = strInput.nextLine();

								// TODO make sure the program can scan through the roster in order to ensure
								// that the name the user entered to delete is actually a 'real' name in said
								// roster

								// code to remove the student that the user has requested
								// if(name )
//		    {
								// code to actually remove
//		    }

								/*
								 * else { System.out.
								 * println("I'm sorry, that name isn't in the database. Please try again."); }
								 */
							}
					}

			}
	}
