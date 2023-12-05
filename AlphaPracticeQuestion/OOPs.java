public class OOPs {
    public static void main(String[] args) {
    pen p = new pen();
    p.colour("Blue");
    p.tip(5);
    System.out.println(p.colour);
    System.out.println(p.tip);

        
    }

}

class pen
{
    String colour;
    int tip;

    void colour(String clr)
    {
        colour = clr;
    }

    void tip(int n)
    {
        tip = n;
    }
}