
public class Student
	{
		
		
		protected String firstName;
		protected String lastName;
		
		protected Class[] classes;
		protected double gpa;
		

		public Student(String firstName, String lastName, Class[] classes)
			{

				this.firstName = firstName;
				this.lastName = lastName;
				this.classes = classes;
				
				//TODO make generate GPA based on the classes
				this.gpa = 0.00;
				
				
			}

	}
