package classtest;

public class Armstrong
{
    public static void main(String[] args)
    {
     int a=0,b,temp;
     int n=125;
     temp=n;
     while (n>0)
     {
         b=n%10;
         n=n/10;
         a=a+(b*b*b);
     }
     if (temp==a)
         System.out.println("Armstrong number");
     else
         System.out.println("Not Armstrong Number");
    }
}
