package polymorphism;

public class OverlodingDemo
{
    void show()
    {
        System.out.println("in default method");
    }
    void show(int i)
    {
        System.out.println("in parameterised method:"+i);
    }
    void show(int i,String name)
    {
        System.out.println("i:"+i+"\t+name:"+name);
    }

    public static void main(String[] args)
    {
     OverlodingDemo overlodingDemo=new OverlodingDemo();
     overlodingDemo.show(1,"codekul");
     overlodingDemo.show(2);
     overlodingDemo.show();

    }
}
