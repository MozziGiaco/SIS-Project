import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class FileReader
	{
		
		public static ArrayList<Student> loadRoster(){
			
			ArrayList<Student> roster = new ArrayList<Student>();
		try
			{
				
				
				Scanner file = new Scanner(new File("Roster.txt"));
				
				while(file.hasNextLine()){
					String[] name = file.nextLine().split(" ");
					String[] classNames = file.nextLine().split(" ");
					
					Class[] classes = new Class[3];
					for(int i = 0; i < classNames.length; i++){
						classes[i] = new Class(classNames[i*2], classNames[i*2+1]);
					}
					
					roster.add(new Student(name[0], name[1], classes));
					
					
					
					
				}
				
				return roster;
				
				
				
				
			} catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				System.out.println("Something went wrong while loading the roster.");
				e.printStackTrace();
			}
		return null;
		
		}
		
			
	}
