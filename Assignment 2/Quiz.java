import java.util.Scanner;
public class Quiz {
 public static void main(String[] args) {
Scanner Sc = new Scanner (System.in);
//I am working towards a major in Information Technology and Systems and minors in global studies and business.
System.out.println ("Enter your major:");
String major = Sc.nextLine();
System.out.println ("Your major is " + major);
System.out.println ("Enter your minor:");
String minor = Sc.nextLine();
System.out.println ("Your major is " + minor);
//The real game starts here.
int points = 0;
System.out.println ("The quiz game about football starts now!!!");

System.out.println ("What number was the super bowl in 2026?");
int answerOne = Sc.nextInt();
if (answerOne == 60){
    System.out.println ("You answered the first question correctly.");
    points= points +1;
}else{
    System.out.println ("You are incorrect, the correct answer is 60.");
}
//clearing scanner
Sc.nextLine ();

System.out.println ("What is the name of the Marist alunmi in the super bowl in 2026?");
String answerTwo = Sc.nextLine();
if (answerTwo.equals ("Jason Myers")|| answerTwo.equals ( "Jason myers") || answerTwo.equals ("jason Myers")|| answerTwo.equals("jason myers")){
    System.out.println ("You are correct");
    points = points +1;
}else{
    System.out.println ("You are incorrect, the correct answer is Jason Myers.");
}

System.out.println ("Who sang during the half time show of the super bowl in 2026?");
String answerThree = Sc.nextLine ();

if (answerThree.equals( "Bad Bunny")|| answerThree.equals ("bad bunny")|| answerThree.equals ("Bad bunny")|| 
answerThree.equals("bad Bunny")|| answerThree.equals("benito")|| answerThree.equals("Benito")){
    System.out.println ("You are correct.");
    points = points +1;
}else {
    System.out.println ("You are incorrect, the correct answer is Bad Bunny.");
}

if (points == 3){
    System.out.println ("YOU WIN!!!!! You got a 100 on the quiz. You got 3 out of 3 points. You answered all questions correctly.");
}else if (points== 2){
    System.out.println ("YOU WIN! You got 2 out of 3 correct. You answered more than half of the questions correctly.");
}else if  (points==1){
    System.out.println("You lost. :(, you only got 1 out of 3 quesrions correct.");
}else {
    System.out.println ("You lost :(, you got 0 out of 3 questions correct.");
}

}
}

//First I asked my users what their majors and minors are using the variables called majors and minors.
//Then I printed out the information back to them.
// My quiz game is going to ask the users three questions about a niche interest. Then they are going to have 
// to answer the questions.  I will use if else to help me figure out if they answered the questions correctly.
// For each question answered correctly the user will gain a point. If they get
// all three points then they get a 100 on the quiz and win the quiz game. If they get only 2 points, they got 
// half right so they still win the game. If they get 1 to 0 points they lose the game. 
// The variables I will use for this quiz game is answerOne for the users first input, answerTwo for the users
// second input and answerThree for the users third input to the third question.
// The conditionals I will use will tell the users if they get the answer correct or not. In the end I will
//tell the users how many points they got and if they won or not.

//Through this expirence I learned that coding can be very tedious. I also learned that there are many different
//variations of correct answers that the users can input, and figuring them all out and putting them into the code 
//can take a while.
