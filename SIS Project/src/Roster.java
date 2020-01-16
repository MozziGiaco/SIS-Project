
import java.util.ArrayList;

public class Roster
	{
		
		public static ArrayList<Student> roster;
		static boolean isLoaded = false;
		public static void load()
			{
				roster = FileReader.loadRoster();
				
			}

		public static ArrayList<Student> getRoster()
			{
			
				if (!isLoaded)
					{
						load();
						isLoaded = true;
					}
				
				return roster;
			
			}
		
		
		
		
		
	}
