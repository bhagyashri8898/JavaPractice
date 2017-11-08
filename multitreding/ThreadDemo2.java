package multitreding;

public class ThreadDemo2 extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Bhagyashri");
        }
    }

}
    class Abc extends Thread
    {
        public void run()
        {

            for (int i = 0; i < 5;i++)
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Torase");
            }
        }

    public static void main(String[] args)
    {
        ThreadDemo2 threaDemo2 = new ThreadDemo2();
        Abc abc=new Abc();
        threaDemo2.start();
        abc.start();
    }
}
