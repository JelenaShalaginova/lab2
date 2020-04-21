

package lab2;

import java.util.*;

public class EggsApp{
	

	public static void main(String args[]){
	
    // declare local variables
	int eggsNum, boxesNum, leftEggsCount;
	
    // declare a variable called sc and create an object of type Scanner
    Scanner sc = new Scanner(System.in);
    
    // declare a variable called eggsCalc to be able to work with an object of type Eggs and create an object of type Eggs
    Eggs eggsCalc = new Eggs();
    
    // read the input from the user
    System.out.println("Enter number of eggs: ");
    eggsNum = sc.nextInt();
    
    // call/invoke the setter method to assign the value provided by the user
    // set/update the value of the object's instance variable called eggsCount with the value provided from the keyboard
    eggsCalc.setEggsCount(eggsNum);
    
   
    // processing
    // call/invoke the method calculateMetrics() of the object eggsCalc
    eggsCalc.calculateMetrics();
    
    
    // first, retrieve each metric value using the corresponding getter method
    // second, display each result
    // call/invoke the getter method getBoxesCount() to retrieve the number of boxes,
    // and store the value in the variable boxesNum
    boxesNum = eggsCalc.getBoxesCount();
    
    // display the value stored in boxesNum local variable
    System.out.println("Number boxes required: "+ boxesNum);
    
    // call/invoke the getter method getLeftEggsCount() to retrieve the number of leftover eggs,
    // and store the value in the variable leftEggsCount
    leftEggsCount = eggsCalc.getLeftEggsCount();
    
    // display the value stored in leftEggsCount local variable
    System.out.println("Remmaining eggs: "+ leftEggsCount);

   }
}