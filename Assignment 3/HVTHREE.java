import java.util.Scanner;
public class HWTHREE {
public static void main(String[] args) throws Exception {
//Dubug Homework Assignment
System.out.println ("Debug.java homework code:");
 Scanner input =new Scanner (System.in);
        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int X =input.nextInt();
         int factorial = 1;
        //here's a hint
        for (int i = 1; i < X+1; i++){
         factorial = factorial * i;
        }
        System.out.println (factorial);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int num = input.nextInt();
        int add = 0;
        //No hint! what do you need to complete this task?
        for (int i =0; i< num; i++){
        i=i+1;
        add= add + i;
}
        System.out.println (add);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }
 input.nextLine();
        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println ("Enter a word: ");
        String word = input.nextLine();
        //hint
        String reverse = "";
        int length = word.length ();
        for (int i = length - 1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        System.out.println (reverse);

//Loop Homework Assignment
System.out.println ("Loop.java homework code:");
//challenge file!
//this one isn't too tough but it does require a little bit of writing and some googling
//figure out how to take a string from the user
//then print back out every individual letter one letter per line
//I also am requiring a small write up: explain your discovery to me.
//how did you figure out how to do this? can you translate your code into simple terms? 
//you need to explain why you picked your for loop conditional and what's doing the work with the string
//!!!!!!
//Look into things like charAt- DO NOT NAME YOUR VARIABLE "REVERSED". If you do, automatic 0 points!!!!!!
//!!!!!!!
//if you're confused reach out!

System.out.println ("Enter a word: ");
String words = input.nextLine ();
int lengths = words.length ();
for (int i = 0; i < lengths; i++){
char letter = words.charAt (i);
System.out.println (letter);
}

 }
}

// Write up section:
//I discovered through doing this challenge that char and charAt is what you use to deal with
//specific letters in strings. Those pieces of code can help you move letters around in 
//words and seperate them entirely from the word like I did with this problem and printed
//each one out idividually. I figured this out by google the questions and putting in the 
//code I had already done into the search engine. It then helped me see what char and charAt
//is and how to add it to my code. This new piece of code based off of what I understand
//allows coders to seperate strings into peices that can be moved around and changed then
//printed out. I picked for for my loop conditional because the loop is not meant to go on 
//forever. It is meant to stop when the ever letter of the word the user inputed has been
//printed out on a seperate line. Char and charAt are doing the work for the string while
//the loop makes sure the code keeps going until every letter has been printed on its 
//seperate line.
