package classtest;


public class ConvertStringToInt
{
    public static void main(String[] args)
    {
        String s = "BHAGYASHRI";
        byte[] barr = s.getBytes();
        for (int i = 0; i < barr.length; i++)
        {
        System.out.println(barr[i]);
        }
    }

}
