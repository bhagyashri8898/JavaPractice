package multitreding;

public class RunnableDemo implements Runnable
{
 public void run()
 {
     System.out.println("Codekul");
 }

    public static void main(String[] args)
    {
        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();

    }
}
