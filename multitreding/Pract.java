package multitreding;

public class Pract extends Thread
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
class Multi extends Thread
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

    public static void main(String[] args) throws InterruptedException
    {
        Pract pract = new Pract();
        Multi multi=new Multi();
        pract.setName("Sangli");
        multi.setName("Pune");
        pract.setPriority(MIN_PRIORITY);
        multi.setPriority(MAX_PRIORITY);

        pract.join();
        multi.join();

        pract.start();
        System.out.println(pract.getName());
        multi.start();
        System.out.println(multi.getName());
    }
}


