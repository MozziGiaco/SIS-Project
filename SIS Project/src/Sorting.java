
public class Sorting
	{
		static String[] help = {"Last Name", "GPA", "period"};
		static int count = 1;
		private static void runner()
		{
			
		}
		private static void chooseSort()
		{
			System.out.println("Choose which one you want to sort by: ");
			for(String a : help)
				{
					System.out.println( count +") " + a);
				}
		}
	}
