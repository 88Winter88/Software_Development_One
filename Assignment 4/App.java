public class App {
public static void main(String[] args) {
//Don't let the size of this scare you! no matter how big an array is, it all works the same!
int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
//you cannot use the array util. Do this one by hand :(
int m = myArray.length;
for (int i = 0; i < m-1; i++){  
for (int j = 0; j< m - i -1; j++){
if (myArray[j]> myArray[j+1] ){
int temp = myArray [j];
myArray[j] = myArray[j+1];
myArray [j+1] = temp;
}
}
}

int[] multipleNums = new int[myArray.length];
int count = 0;

for (int k =0; k<myArray.length -1; k++){
if (myArray [k] == myArray[k+1]){
boolean Added = false;
for (int l = 0; l< count ; l++){
    if (multipleNums[l] == myArray[k]){
        Added = true;
        break;
    }
}
if (!Added){
multipleNums[count] = myArray[k];
count++;
}
}
}




System.out.print("These numbers are repeated in the array: ");


for (int b = 0; b < count; b++) {
   if (b<count - 1){
    System.out.print(multipleNums[b] + ", ");
   } else {
    System.out.print(multipleNums[b]);
   }
}


//So now I am going to explain the code. But first I think it is important
//to address the fact that idk what is happening but this code is working 
//in all other java compliers and just completely not working on this app thing
//you have us using. I lowkey think my laptop is glitching out as it is not regestering 
//anything and it is super frusterating. Anyway, I will ask you more about that in class
//tomorrow.
// Ignore what I wrote above after closing this page for a bit then reopening it randomly
//like 20 minutes later, the code seemed to all of a sudden work, so its all good. YAYAY!!!!!


//Now onto what is code is doing. Basically I am starting with the array given
// then I take the array and go through it and any number that is repeating is added to 
//a new array called multipleNums. I also have a count variable that keeps track of how
//many numbers are in the multipleNums array. Then I print out the numbers that are in the
//multipleNums array. Then I print out the numbers in the multipleNums array and for fun I 
//add in a check so that I add commas after every number exceot the last one.


//Now onto the debuging assignment. Which is listen in this folder but is called anotherOne.java.




}
}
