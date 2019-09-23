
/*
 * All Mice are Animals but all Animals are not Mice.
 */

public class Mouse extends Animal {
    public Mouse(){
        System.out.println("We now have a mouse");
    }
    @Override
    public String sleep(){
        return "A mouse sleeps";
    }
    @Override
    public String eat(){
        return "The mouse eats";
    }
    public String squeaks(){
        return "A mouse squeaks";
    }
}
