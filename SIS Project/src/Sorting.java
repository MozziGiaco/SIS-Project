import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Sorting implements Comparator<Student>
	{
		static String[] help = {"Last Name", "GPA", "period"};
		static int count = 1;
		private static void runner()
		{
			
		}
//		private static void chooseSort()
//		{
//			System.out.println("Choose which one you want to sort by: ");
//			for(String a : help)
//				{
//					System.out.println( count +") " + a);
//				}
//		}
		public static void lastName()
		{
//			
//			for(int i = 0; i < Roster.roster.size()-1; i++)
//				{
//					SortingLastName.compare(Roster.roster.get(i).lastName,Roster.roster.get(i+1).lastName);
//				}
			//Collections.sort((List<T>) Roster.roster);
			System.out.println();
		}
		public static void GPA()
		{
			
		}
		public static void period1()
		{
			
		}
		public static void period2()
		{
				
		}
		public static void period3()
		{
				
		}
		@Override
		public int compare(Student s1, Student s2)
			{
				return s1.getLastName().compareTo(s2.getLastName());
				//Compares students last name
				
			
			}
		


	}
