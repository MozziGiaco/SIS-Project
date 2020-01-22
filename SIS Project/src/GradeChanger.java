import java.util.Scanner;

public class GradeChanger
	{

		public static void changeGrade()
			{

				while (true)
					{
						// get student to modify
						System.out.println("Which student's grades would you like to change?");

						for (int i = 1; i <= Roster.getRoster().size(); i++)
							{
								System.out.println("(" + i + ") " + Roster.getRoster().get(i - 1).getFullName());
							}
						System.out.println("(" + (Roster.getRoster().size() + 1) + ") Go back to main menu.");

						Scanner userInt = new Scanner(System.in);

						boolean asking = false;
						int response = 0;
						while (true)
							{

								response = userInt.nextInt();

								if (response == Roster.getRoster().size() + 1)
									{
										asking = true;
										break;
									}

								if (response > 0 && response <= Roster.getRoster().size())
									{
										break;
									} else
									{
										System.out.println("Incorrect index");
									}
							}
						if (asking)
							{
								break;
							}

						// now i have the student that i will modify
						Student s = Roster.getRoster().get(response - 1);

						// print out student's classes
						boolean inStudent = true;
						while (inStudent)
							{

								System.out.println("Here are " + s.getFirstName()
										+ "'s classes:\nWhich class would you like to change?");
								for (int i = 0; i < s.getClasses().length; i++)
									{
										System.out.println("(" + (i + 1) + ") " + s.getClasses()[i].getName() + " : "
												+ s.getClasses()[i].getGrade());

									}
								System.out.println("(" + (s.getClasses().length + 1) + ") Go back to Student List.");

								// find the class to switch
								asking = false;
								while (true)
									{

										response = userInt.nextInt();

										if (response == s.getClasses().length + 1)
											{
												asking = true;
												break;
											}

										if (response > 0 && response <= s.getClasses().length)
											{
												break;
											} else
											{
												System.out.println("Incorrect index");
											}
									}

								if (asking)
									{
										break;
									}

								System.out.println(
										s.getFirstName() + "'s grade in " + s.getClasses()[response - 1].getName()
												+ " is currently a " + s.getClasses()[response - 1].getGrade());
								System.out.println("What would you like to change it to?");
								Scanner userString = new Scanner(System.in);
								s.getClasses()[response - 1].setGrade(userString.nextLine());
								System.out.println("Grade changed.");

							}
					}
			}

	}
