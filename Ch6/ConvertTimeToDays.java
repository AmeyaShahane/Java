package Ch6;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: Class to convert time entered in seconds, minutes 
	and hours using constructor, method overloading, static data and static methods
***********************************************************************************/ 

public class ConvertTimeToDays { // class name
	 	int Hours, Minutes, Seconds;			// declare instance variables
		double  Days;  // declare days
		int	 	Weeks; // declare weeks
		String Result = "Converted Time is=> ";
		private static final int DaysOfWeek = 7; // STATIC DATA
		private static final int HoursOfDay = 24; // STATIC DATA
		private static final int SecondsOfDay = 86400; // STATIC DATA
		
		private static double convertMinutesToSeconds(int Minutes) // STATIC METHOD
		{
			return Minutes*60;
		}

		private static double convertHoursToSeconds(int Hours) // STATIC METHOD
		{
			return Hours*3600;
		}

		public ConvertTimeToDays(int Hrs, int Mins, int Snds) { // CONSTRUCTOR
			Hours = Hrs;
			Minutes = Mins;
			Seconds = Snds;
		}
		
		public String getResult() { // get results
			if (Days > 6) // if days > 6, show weeks as per the instructions in Question 24
			{
				Weeks = (int) (Days / DaysOfWeek); // calculate week integral
				Result = Result + " Weeks: " + Weeks + ", "; // add weeks to results text
			}
			Result = Result + " Days: "+Days; // add days to results text
			return Result; // return result
		}

		public void ComputeDaysWeeks(int Hours) {  //OVERLOADED METHOD
			Days = Hours / HoursOfDay; // calculate days
		}		   				//End of the method

		public void ComputeDaysWeeks(int Hours, int Minutes) {  //OVERLOADED METHOD
			Double HourSeconds = convertHoursToSeconds(Hours) ; // get seconds for hours
			Double MinuteSeconds = convertMinutesToSeconds(Minutes); // get seconds for minutes
			Days = ( HourSeconds + MinuteSeconds )  / SecondsOfDay; // calculate days
		}		   				//End of the method

		public void ComputeDaysWeeks(int Hours, int Minutes, int Seconds) {  //OVERLOADED METHOD
			Double HourSeconds = convertHoursToSeconds(Hours) ; // get seconds for hours
			Double MinuteSeconds = convertMinutesToSeconds(Minutes); // get seconds for minutes
			Days = ( HourSeconds + MinuteSeconds + Seconds )  / SecondsOfDay; // calculate days
		}		   				//End of the method
				
		
	}	//End of ConvertTimeToDays class
