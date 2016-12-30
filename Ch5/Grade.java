package Ch5;

/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
***********************************************************************************/ 

public class Grade {
	int score;
	char grade;

	public void setScore(int s){
		score = s;
	}
	public int getScore(){
		return score;
	}
	public void setGrade(char g){
		grade = g;
	}
	public char getGrade(){
		return grade;
	}
	public void assginGrade(){
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
	}	//end of method assignGrade()
}		//end of class Grade
