package classtest;

public class fibonacci
{
    public static void main(String[] args)
    {
     int n=0,n1=1,n2,i,count=10;
        System.out.println(n+""+n1);
        for(int j=2;j<count;++j)
        {
            n2=n+n1;
            System.out.println(""+n2);
            n=n1;
            n1=n2;
        }
    }
}
