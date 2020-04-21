package lab2;
 import java.util.*;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/


public class TeamsApp{
	
    public static void main(String[] args){
    	
        // declare local variables
    	int TeamSize, NumOfStudents, NumOfTeams, StudentsLeft;
    	
        //declare a variable called input and create an object of type Scanner
    	Scanner input = new Scanner(System.in);
    	
        // declare a variable called myTeams to be able to work with an object of type Teams and create 
    	//an object of type Teams
    	Teams myTeams = new Teams();
    	
        //input
    	System.out.println("Please enter the size of the groups: ");
    	TeamSize = input.nextInt();
    	myTeams.setTeamSize(TeamSize);
    	
    	System.out.println("Please enter number of people: ");
    	NumOfStudents = input.nextInt();
    	myTeams.setNumOfStudents(NumOfStudents);

        //process
    	//call/invoke the method calculateMetrics() 
    	myTeams.compute();
        
    	
        NumOfTeams = myTeams.getNumOfTeams();
        StudentsLeft = myTeams.getStudentsLeft();
        
        System.out.println("The number of teams of " + TeamSize + " from group of " + NumOfStudents + " people will be " + NumOfTeams + " teams and " + StudentsLeft + " students will be without a group");
        
    
}

}
