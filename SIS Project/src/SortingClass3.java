
import java.util.Comparator;

public class SortingClass3 implements Comparator<Student>
	{
		@Override
		public int compare(Student s1, Student s2)
			{
				if(s1.classes[2].getName().toLowerCase().equals(s2.classes[2].getName().toLowerCase()))
					{
						return s1.classes[2].getName().toLowerCase().compareTo(s2.classes[2].getName().toLowerCase()) 
								+s1.getLastName().toLowerCase().compareTo(s2.getLastName().toLowerCase());
					}
				else
					{
						return s1.classes[2].getName().toLowerCase().compareTo(s2.classes[2].getName().toLowerCase()) ;
					}
			
			}
	}
