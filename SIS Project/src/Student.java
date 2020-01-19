
public class Student
	{
		
		
		protected String firstName;
		protected String lastName;
		protected String fullName;
		
		protected Class[] classes;
		protected double gpa;
		

		public Student(String firstName, String lastName, Class[] classes)
			{

				this.firstName = firstName;
				this.lastName = lastName;
				this.fullName = firstName +" "+lastName;
				this.classes = classes;
				
				double totalGP = 0.0;
				for(Class c: classes){
					String letterGrade = c.getGrade().substring(0,1);
						switch (letterGrade.toLowerCase())
							{
							case "a":
								totalGP += 4.0;
								break;
							case "b":
								totalGP += 3.0;
								break;
							case "c":
								totalGP += 2.0;
								break;
							case "d":
								totalGP += 1.0;
								break;
							case "f":
								totalGP += 0.0;
								break;

							}
				}
				double g  = totalGP/classes.length;
				g*=100;
				g=(int)g;
				g/=100.0;
				
				
				this.gpa = g;
				
				
			}


		public String getFirstName()
			{
				return firstName;
			}


		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}


		public String getLastName()
			{
				return lastName;
			}


		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}


		public String getFullName()
			{
				return fullName;
			}


		public void setFullName(String fullName)
			{
				this.fullName = fullName;
			}


		public Class[] getClasses()
			{
				return classes;
			}


		public void setClasses(Class[] classes)
			{
				this.classes = classes;
			}


		public double getGpa()
			{
				return gpa;
			}


		public void setGpa(double gpa)
			{
				this.gpa = gpa;
			}
		
		
		
		

	}
