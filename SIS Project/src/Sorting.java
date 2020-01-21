import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sorting implements Comparator<Student>
	{
		//static ArrayList<Student> list2 = new ArrayList<Student>();
		static String[] help = {"Last Name", "GPA", "period"};
		static int count = 1;
		private static void runner()
		{
			
		}

		
		public static void lastName()
		{
			
//		
			Roster.load();
			
			SortingLastName name = new SortingLastName();
			Collections.sort(Roster.roster,name);
			System.out.println("Sorting students by last name:");
			overview();
		}
		public static void GPA()
		{
			Roster.load();
			SortingGPA gpa = new SortingGPA();
			Collections.sort(Roster.roster,gpa);
			System.out.println("Sorting students by GPA:");
			overview();
			
		}
		public static void period1()
		{
			Roster.load();
			
			SortingClass1 one = new SortingClass1();
			Collections.sort(Roster.roster,one);
			System.out.println("Sorting students by Period 1's name:");
			overview();
		}
		public static void period2()
		{
			Roster.load();
			
			SortingClass2 two = new SortingClass2();
			Collections.sort(Roster.roster,two);
			System.out.println("Sorting students by Period 2's name:");
			overview();
		}
		public static void period3()
		{
			Roster.load();
			
			SortingClass3 three = new SortingClass3();
			Collections.sort(Roster.roster,three);
			System.out.println("Sorting students by Period 3's name:");
			overview();	
		}
		public static void overview()
		{
			for(int i =0; i <Roster.roster.size();i++)
				{
					System.out.println(Roster.roster.get(i).getFirstName().substring(0, 1).toUpperCase() +Roster.roster.get(i).getFirstName().substring(1, Roster.roster.get(i).firstName.length()) + " " 
				+ Roster.roster.get(i).getLastName().substring(0, 1).toUpperCase() +Roster.roster.get(i).getLastName().substring(1, Roster.roster.get(i).lastName.length())+ " "  +
				Roster.roster.get(i).classes[0].name.substring(0,1).toUpperCase()+Roster.roster.get(i).classes[0].name.substring(1,Roster.roster.get(i).classes[0].name.length())+ " "  + Roster.roster.get(i).classes[0].grade+ " " +Roster.roster.get(i).classes[1].name.substring(0,1).toUpperCase()+Roster.roster.get(i).classes[1].name.substring(1,Roster.roster.get(i).classes[1].name.length())
				+ " "  + Roster.roster.get(i).classes[1].grade+ " "  +
				Roster.roster.get(i).classes[2].name.substring(0,1).toUpperCase()+Roster.roster.get(i).classes[2].name.substring(1,Roster.roster.get(i).classes[2].name.length())+ " "  + Roster.roster.get(i).classes[2].grade+ " "  +  Roster.roster.get(i).gpa );
					
				}
		}
		@Override
		public int compare(Student s1, Student s2)
			{
				return s1.getLastName().compareTo(s2.getLastName());
				//Compares students last name
				
			
			}
//		


	}
