package classtest;

public class SplitTest
{
    public static void main(String[] args)
    {
     String s1="How Are You";
        {
            String[] s2=s1.split("\\s");
            for (String s3:s2)
            {
                System.out.println(s3);
            }
        }
    }
}
