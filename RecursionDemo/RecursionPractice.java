package RecursionDemo;

public class RecursionPractice
{
    static int count=0;
     static void getData()
    {

        if (count<=5)
        {
            System.out.println("Codekul");
            count++;
            getData();
        }
    }

    public static void main(String[] args)
    {
     getData();
    }
}