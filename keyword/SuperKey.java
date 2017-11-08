package keyword;

public class SuperKey
{
    String name="Codekul";
    SuperKey()

    {
        System.out.println("in parent constructor");
    }
    void show()
    {
        System.out.println(name);
    }

}

class childSuper extends SuperKey
{
    String name = "melayer";

    childSuper()
    {
        System.out.println("in child constructor");
    }

    void show()
    {
        System.out.println(name);
        super.show();
    }

    public static void main(String[] args)
    {

        childSuper c = new childSuper();
    }
}
