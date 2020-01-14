
import java.util.ArrayList;

public class Roster
	{
		
		public static ArrayList<Student> roster;

		public static void load()
			{
				roster = FileReader.loadRoster();
			}

		public static ArrayList<Student> getRoster()
			{
				return roster;
			}
		
		
		
		
		
	}
