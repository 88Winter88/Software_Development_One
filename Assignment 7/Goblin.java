public class Goblin extends Enemy{

    //Needs constructor
    public Goblin (int h, int d){
    super (h, d);
    }
    //needs method to overwrite attack in enemy to say "the goblin gobbles" instead of "the enemy attacks
    void attackGob(){
        System.out.println("the goblin gobbles");
    }
}
