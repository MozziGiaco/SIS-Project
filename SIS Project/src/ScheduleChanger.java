import java.util.Scanner;

public class ScheduleChanger
	{

		public static void changeSchedule()
			{

				// get student to modify
				System.out.println("Which student's schedule would you like to change?");

				for (int i = 1; i <= Roster.getRoster().size(); i++)
					{
						System.out.println("(" + i + ") " + Roster.getRoster().get(i - 1).getFullName());
					}

				Scanner userInt = new Scanner(System.in);

				boolean asking = true;
				int response = 0;
				while (asking)
					{

						response = userInt.nextInt();

						if (response > 0 && response <= Roster.getRoster().size())
							{
								asking = false;
							}
						else
							{
								System.out.println("Incorrect index");
							}
					}

				// now i have the student that i will modify
				Student s = Roster.getRoster().get(response - 1);

				// print out student's classes
				System.out
						.println("Here are " + s.getFirstName() + "'s classes:\nWhich class would you like to change?");
				for (int i = 0; i < s.getClasses().length; i++)
					{
						System.out.println("(" + (i + 1) + ") " + s.getClasses()[i].getName());

					}

				// find the class to switch
				asking = true;
				while (asking)
					{

						response = userInt.nextInt();

						if (response > 0 && response <= s.getClasses().length)
							{
								asking = false;
							}
						else
							{
								System.out.println("Incorrect index");
							}
					}

				Class tempClass = s.getClasses()[response - 1];
				int tempIndex = response - 1;

				System.out.println("Which period would you like to switch Period " + response + ":"
						+ s.getClasses()[response - 1].getName() + " with?");

				System.out
						.println("Here are " + s.getFirstName() + "'s classes:\nWhich class would you like to change?");

				for (int i = 0; i < s.getClasses().length; i++)
					{
						if (i != tempIndex)
							{
								System.out.println("(" + (i + 1) + ") " + s.getClasses()[i].getName());
							}

					}

				asking = true;
				while (asking)
					{

						response = userInt.nextInt();

						if (response > 0 && response <= s.getClasses().length)
							{
								asking = false;
							}
						else
							{
								System.out.println("Incorrect index");
							}
					}

				// actually switch

				s.getClasses()[tempIndex] = s.getClasses()[response - 1];
				s.getClasses()[response - 1] = tempClass;
				System.out.println("Schedule changed.");
				

			}

	}
