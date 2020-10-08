import java.util.Scanner;

/**
 * Calculate the average grade or mark from 5 grades 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Make the scanner  
    Scanner input = new Scanner(System.in); 

    //create array to store grades 
    double[] grades = new double[5]; 

    //use a for loop to get all the grades from the user  
    for(int i = 0; i < grades.length; i++){
      // ask the user for a grade 
      System.out.println("Enter mark " + (i+1)); 
      // fill the array with a value 
      grades[i] = input.nextDouble(); 
    } 

    // create variable to store the total of all grades 
    double total = 0; 
    // use the for loop to add grades to total 
    for(int i = 0; i < grades.length; i++){
      //add each grade to total 
      total = total + grades[i];
    } 

    // calculate the average 
    double average = total/grades.length; 

    //let the user know their average 
    System.out.println("Your average is " + average); 


    
  }
}
