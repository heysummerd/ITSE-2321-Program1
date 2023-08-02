package program1;

//********************************************************************
//
//  Author:        Summer Davis
//
//  Program #:     One
//
//  File Name:     Program1.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Description:   Program computes the tax and tip on a restaurant bill
//				   for a patron with a $44.50 meal charge. 
//				   - Displays meal cost, tax amount, tip amount, and total bill on the screen
//				   - Tax is 8.25% of meal cost
//				   - Tip is 15% of the total after adding the tax
//
//********************************************************************

public class Program1 {
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************
	public static void main(String[] args) {
		
       // Declare more variables here
	   double amount = 44.50;
	   double tax = 0.0825;
	   double tip = 0.15;
	   
       developerInfo();
    
       // Enter more statements here to make
	   // the program work as expected
       
       // Calculate Tax
       double taxAmount = amount * tax;
       // Add Tax
       double totalBill = amount + taxAmount;
       // Calculate Tip
       double tipAmount = totalBill * tip;
       // Add Tip
       totalBill += tip;
       
       // Display meal cost, tax amount, tip amount, and total bill
       System.out.printf("Meal Cost:          $%6.2f%n", amount);
       System.out.printf("Tax Amount(8.25%%):  $%6.2f%n", taxAmount);
       System.out.printf("Tip Amount(15%%):    $%6.2f%n", tipAmount);
       System.out.printf("Total Bill:         $%6.2f%n", totalBill);

    } // End of the main method
	
	//***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo() {
       System.out.println("Name:    Summer Davis");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}