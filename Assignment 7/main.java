public class main {
    public static void main(String[] args) {

        //create a generic enemy and call its functions
        Enemy e1 = new Enemy (5, 1);
        System.out.println ("Enemy Health: "+e1.health);
        System.out.println ("Enemy Damage: "+e1.damage);
        e1.attack();
        //create a fire and an ice wizard and call all functions
        Wizard w1 = new Wizard (20, 3, "fire");
        System.out.println ("Fire Wizard Health: "+w1.health);
        System.out.println ("Fire Wizard Damage: "+w1.damage);
        w1.damageType();
        Wizard w2 = new Wizard (20, 5, "ice");
        System.out.println ("Ice Wizard Health: "+w2.health);
        System.out.println ("Ice Wizard Damage: "+w2.damage);
        w2.damageType();
        //create a goblin and call its functions
        Goblin g1 = new Goblin (10, 2);
        System.out.println ("Goblin Health: "+g1.health);
        System.out.println ("Goblin Damage:n "+g1.damage);
        g1.attackGob();
    }
}
