import java.util.Comparator;

public class SortingLastName implements Comparator<Student>
	{
		@Override
		public int compare(Student s1, Student s2)
			{
				return s1.getLastName().toLowerCase().compareTo(s2.getLastName().toLowerCase());
				//Compares students last name
				
			
			}
	}
