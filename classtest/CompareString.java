package classtest;

public class CompareString
{
    public static void main(String[] args)
    {
     String s="Bhagyashri";
     String s1="Aniket";
     String s2=new String("Bhagyashri");
     if (s==s1)
     {
         System.out.println("Same Value");
     }
     else
     {
         System.out.println("Differen Value");
     }
    }
}
