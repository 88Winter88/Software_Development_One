import java.util.Random;

public abstract class AssignmentSix {
    //Given code by professor for this assignment
    public class student {
        String name;
        String year;
        double gpa;
        int id;
        public student(String n, String y, double g, int i){
            name = n;
            year = y;
            gpa = g;
            id = i;
        }
    //Create a method in this file that returns if they are an honor roll student or not (gpa > 3.6)
    public boolean honorRoll(){
    return this.gpa > 3.6;
    }
    //Create a method to see if they get "free lunch", this is a weird school, every day they generate
    //random student id
    public boolean freeLunch (int winningId){
        return this.id == winningId;

    }
    }
//This is now my code and becasue I have been sick I am going with the 
//figure it out method :)
//First part is to creat 5 different students in my main
      
public static void main(String[] args){
    AssignmentSix outer = new AssignmentSix() {};
    //now I am giving each student their personal info
    student kidOne = outer.new student ("Samantha Kris", "Freshman", 2.3, 1004);
    student kidTwo = outer.new student ("Freshy Freshman", "Senior", 4.0, 1000);
    student kidThree = outer.new student ("Asher Fire", "Junior", 3.9, 1001);
    student kidFour = outer.new student ("Stormy Winter", "Sophmore", 3.2, 1002);
    student kidFive = outer.new student ("Paris Fall", "Sophmore", 1.5, 1003);
   
    //This is the code to check each student and if they get Honor Roll
    //This code is going to print out the statement for each kid and say if it is true or false.
    System.out.println("The statement that " + kidOne.name + " is an honor roll student is " + kidOne.honorRoll());
    System.out.println("The statement that " + kidTwo.name + " is an honor roll student is " + kidTwo.honorRoll());
    System.out.println("The statement that " + kidThree.name + " is an honor roll student is " + kidThree.honorRoll());
    System.out.println("The statement that " + kidFour.name + " is an honor roll student is " + kidFour.honorRoll());
    System.out.println("The statement that " + kidFive.name + " is an honor roll student is " + kidFive.honorRoll());

    //Generate the random ID
    Random random = new Random ();
    int winningId = random.nextInt (5)+ 1000;
    System.out.println ("Today's winning ID is " + winningId);
    //This will show what student will get the free lunch for the day
    if (kidOne.freeLunch (winningId)){
        System.out.println (kidOne.name + " gets a free lunch.");
    }else{
        System.out.println (kidOne.name + " has to pay today.");
    }
    //I am making one of these for each student to see if they get free lunch or not.
    if (kidTwo.freeLunch (winningId)){
        System.out.println (kidTwo.name + " gets a free lunch.");
    }else{
        System.out.println (kidTwo.name + " has to pay today.");
    }

    if (kidThree.freeLunch (winningId)){
        System.out.println (kidThree.name + " gets a free lunch.");
    }else{
        System.out.println (kidThree.name + " has to pay today.");
    }

    if (kidFour.freeLunch (winningId)){
        System.out.println (kidFour.name + " gets a free lunch.");
    }else{
        System.out.println (kidFour.name + " has to pay today.");
    }

    if (kidFive.freeLunch (winningId)){
        System.out.println (kidFive.name + " gets a free lunch.");
    }else{
        System.out.println (kidFive.name + " has to pay today.");
    }
}
}
//From this assignment I learned about how public lcass works and how
//to make people and many information in that class.
//I learned how to properly document it and access it using code.
//I also learned more about randomly picking a number out of the variable numbers
//that I have already been put in.
