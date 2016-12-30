package Ch13;
/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: Transcript class to create collection of Course, carry out adding,
deleting, sorting, searching, and printing operations. 
*********************************************************************************/ 
/**
 * import necessary java libraries
 */
import java.util.*; 
import java.io.*; // io library
import javax.swing.JOptionPane; // JOptionPane for user input
import java.util.Comparator; // comparator library used to sort

/**
 * class <b> Transcript </b> is used by <b> TranscriptApp </b> to create 
 * <b>collection</b> of Course, carry out <b>adding</b>, <b>deleting</b>, <b>sorting</b>,
 * <b>searching</b>, and <b>printing</b> operations. 
 * @author Ameya Shahane
 * @version 1.0.0
 */

public class Transcript { // main class
/** 
 * Declare Instance variables, map and create instances of course class
 * @param title, credit and grade 
 */
	private String title; 
	private int credit;
	private String grade;
	Map<String, Course> grades; // declaration for map
	Course course = new Course(title,credit,grade); // create instance of course class
	
/*
 * Main Method Transcript() and initialization
 */
	public Transcript() throws IOException { // main method
		title = grade = null; // initialize
		grades = new TreeMap<String, Course>(); 	//create new collection
	}
/*
 * Method to display and accept choice of selection from the user	
 * @return <b> String </b> for the choice
 */
	public String makeChoice() { // make the choice
		String choice = null,
		       message = "Welcome to transcript...\n"
			                 + "Enter 1 to add a course\n"
			                 + "Enter 2 to search a course\n"
			                 + "Enter 3 to remove a course\n"
			                 + "Enter 4 to sort the courses\n"
			                 + "Enter 5 to print the transcript\n"
			                 + "Enter 6 for exit\n";
	    boolean done = false;
	    while (!done) { // repeat until user want to continue
			choice = JOptionPane.showInputDialog(null, message);
			if (choice.matches("[1|2|3|4|5|6]")) // validate choices
			 done = true;
			else
			 JOptionPane.showMessageDialog(null, "Wrong choice.  Please try again..."); //if wrong choice given, re ask
		 }
		 return choice;
	}
/*
 * Method to sort the records
 */
	public void sortRecord() { // method to sort records
			List<Course> list = new LinkedList<Course>(); //create the linkedlist	
			Collections.sort(list, new CourseComparator()); // sort the collection
			System.out.println("Sorted by Title: " + grades); // print the sorted list
	}
	
/*
 * Method to add a record
 * @exception IOException and other exceptions as per the Validator class used to validate user input
 * the method also <b> checks and processes duplicates </b>
 */
	public void addRecord() throws IOException { // method to add records
		String message, str = null; //initialize 
		title = JOptionPane.showInputDialog(null, "Please enter the title: "); //request title

		str = JOptionPane.showInputDialog("Please enter the credit: "); // accept credit
		credit = Validator.validateCredit(Integer.parseInt(str), "Credits: ", 1, 4); // validate

		str = JOptionPane.showInputDialog("Please enter the grade: "); // accept grade
		grade = Validator.validateGrade(str, "Grade: "); // validate

		processDuplicate(); // check for duplicates

		Course course = new Course(title,credit,grade); // create new instance of course classs
		grades.put(title, course); // add details to the collection

		message = "The following record has been added to the transcript: \n" // create message 
								+ "Title: " + title + "\n" 
								+ "Credit: " + credit + "\n"
								+ "Grade: " + grade + "\n";
		JOptionPane.showMessageDialog(null, message); // show message
	}

/**
 * Method to remove a record based on user provided title
 * @throws IOException when an IO exception is arrived
 */
	public void removeRecord() throws IOException { //method to remove record
		String message = null;
		title = JOptionPane.showInputDialog(null, "Please enter the exact title to remove: ");
		grades.remove(title); // remove from collection

		message = "The following record has been removed from the transcript: \n"
								+ "Title: " + title + "\n"
								+ "Grade: " + grade + "\n";
		JOptionPane.showMessageDialog(null, message); //show message
	}	

/**
 * Method to process duplicates
 */
	public void processDuplicate() { //process duplicates
		String  message = null;
			   
		while(grades.containsKey(title)) { // check if key exist
			message = "There is a duplicated title in the transcript...\n"
					 			+ "Enter other title\n";
			title = JOptionPane.showInputDialog(null, message + "Enter the new title: "); //request new title
			
		}
	}

/** 
 * Method to search a record based on user provided title	
 * @throws IOException when an IO exception is arrived
 */
	public void searchRecord() throws IOException { //search record
	   String choice = null,
		       message = "Enter the exact title to search the grade: ",
		       title = JOptionPane.showInputDialog(null, message); // request title to be searched

	   if (grades.containsKey(title)) { // check if title exists
		   course = grades.get(title); // get the details
		   display(title, credit, grade); // show the details
	   }
	   else {
		   message = "This title is not in the transcript...\n"
		   			 + "Do you want to add into the record? (y/n): ";
		   choice = JOptionPane.showInputDialog(null, message); // if title not found, ask if to re add
		   if (choice.matches("[y|Y]"))
		     addRecord();
		 }
	 }
/**
 * Method to print a record
 * @throws IOException when an IO exception is arrived
 */
	public void printRecord() throws IOException { // print the record
		System.out.println(grades); // print grades
	}

/**
 * Method to display a record
 * @param title title of the course
 * @param credit associated with the course
 * @param grade of the course
 */
	public void display(String title, int credit, String grade) { // display details
		String message = "TitleName/Email: " + title + "\n" + "Credit: " + credit  + "Grade: " + grade;
		JOptionPane.showMessageDialog(null, message);
	}

/**
 * Method to display good bye message
 */
	public void goodBye() { // goodBye
		JOptionPane.showMessageDialog(null, "Thank you for using the transcript application.  Good bye!");
		System.exit(0);
	}

/**
 * class used to compare course titles
 *
 */
	class CourseComparator implements Comparator<Course>  {
	 	public int compare(Course Course1, Course Course2) {
	 		int compare = Course1.getTitle().compareTo(Course2.getTitle()); // compare the title strings  
			if (compare < 0)  //Sort normal way
			  return -1;
			 if (compare > 0 )
			  return 1;
	 		return 0;
	 	}
	 }

}
