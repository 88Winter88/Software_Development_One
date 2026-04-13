public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        if ("fire".equals(type)){
            System.out.println ("this wizard shotts a fireball");
        }else if ("ice".equals(type)){
            System.out.println ("this wizard shoots an iceball");
        }else{
            System.out.println ("Unknown wizard type");
        }
        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"
        //if the type is 'ice', then print "this wizard shoots an iceball"

    }
}
