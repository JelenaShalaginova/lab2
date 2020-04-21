package lab2;

/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        Teams.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
        hint is in the TeamsApp.java System.out.println
*/
public class Teams{
	
    //declare data members / instance variables
	private int NumOfStudents, TeamSize, NumOfTeams, StudentsLeft;
	
    //constructor
	public Teams() {
		NumOfStudents = 0;
		TeamSize = 0;
		NumOfTeams = 0;
		StudentsLeft = 0;
		
	}
	
	//constructor taking in two parameters numOfStudents, teamSize
	public Teams (int NumOfStudents, int TeamSize) {
		this.NumOfStudents = NumOfStudents;
		this.TeamSize = TeamSize;
	
	}
	
    //setters for setNumOfStudents and setTeamSize
	
	public void setTeamSize (int TeamSize) {
	 this.TeamSize = TeamSize;
	}
	
	public void setNumOfStudents (int NumOfStudents){
		this.NumOfStudents = NumOfStudents;
		}
		
	
    //compute method
	public void compute(){
		//to compute number of teams
		NumOfTeams = NumOfStudents / TeamSize;
		StudentsLeft = NumOfStudents % TeamSize;
	}
		
		//getters for getNumOfTeams and getStudentsLeft
		public int getNumOfTeams(){
	        return NumOfTeams;
		}
		public int getStudentsLeft() {
			return StudentsLeft;
		
	}
	
   
}
