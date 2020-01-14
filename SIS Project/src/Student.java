
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
				
				double totalGP = 0.0;
				for(Class c: classes){
					String letterGrade = c.getGrade().substring(0,1);
						switch (letterGrade)
							{
							case "A":
								totalGP += 4.0;
								break;
							case "B":
								totalGP += 3.0;
								break;
							case "C":
								totalGP += 2.0;
								break;
							case "D":
								totalGP += 1.0;
								break;
							case "F":
								totalGP += 0.0;
								break;

							}
				}
				this.gpa = totalGP/classes.length;
				
				
			}

	}
