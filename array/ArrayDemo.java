package array;

public class ArrayDemo
{
    void oneDArray()
    {
        int array[]={1,2,3,4,5};
        for (int i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }

    }

   public static void main(String[] args)
   {
       ArrayDemo arrayDemo=new ArrayDemo();
        System.out.println("output:");
        arrayDemo.oneDArray();

   }

}

