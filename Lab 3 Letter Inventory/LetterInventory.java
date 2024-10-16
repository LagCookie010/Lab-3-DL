// Name: Darren Lagbao, 
// Date: 10/9/2024
// Class: CS 145, Computer Science 2, Darrell Criss
// Lab: 3, Letter Inventory
// Citation: W3 Schools, Darrell Criss's Lectures, 
// Purpose: A Program that counts and records a specific letter in a String/Word. 
// Class Purpose: Main is the class hosting main functions and is the main interface.
// Notes:

public class LetterInventory {
    
    private char letterName;
    private int letterAmount;




    public LetterInventory(int number, char letter) {
        this.letterName = letter;
        this.letterAmount = number;
    }


    public String toString(){


    return "/" + letterName + "/ = /" + letterAmount + "/";

}


    
    
}// end of LetterInventory