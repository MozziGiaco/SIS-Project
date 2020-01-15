import java.util.ArrayList;


public class FileTester
	{

		public static void main(String[] args)
			{
				Roster.load();
				
				
				for(Student s : Roster.roster){
				System.out.println(s.getFullName());
					for(int i = 0; i < s.getClasses().length; i++){
						System.out.println("Class "+(i+1)+": "+s.getClasses()[i].getName());
					}
					
					System.out.println("GPA: "+s.getGpa());
				
				
				}
				
				
			}
		
		
	}
