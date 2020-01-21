
import java.util.Comparator;

public class SortingClass3 implements Comparator<Student>
	{
		@Override
		public int compare(Student s1, Student s2)
			{
				return s1.classes[2].getName().toLowerCase().compareTo(s2.classes[2].getName().toLowerCase());
				//Compares students classes
			
			}
	}
