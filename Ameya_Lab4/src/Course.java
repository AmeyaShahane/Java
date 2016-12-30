/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 4 (Ch13 #6)
Submission Date: 10:00 pm, Wed (11/23) 
Brief Description: class to record course details. 
*********************************************************************************/ 
public class Course { // class name
		protected String Title; // title of course
		protected int Credit; // credits
		protected String Grade; // grade
		
public Course(String Title, int Credit, String Grade) {	 // constructor
		this.Title = Title;
		this.Credit = Credit;
		this.Grade = Grade;
}

public String getTitle() { // get method for title
	return Title;
}

public int getCredit() { // get method for credit
	return Credit;
}

public String getGrade() { // get method for grade
	return Grade;
}

public String toString() { // default display message
			String message =  "Title: " + Title + " Credit: " + Credit + " Grade: " + Grade;
			return message;
		}
} // end of class

