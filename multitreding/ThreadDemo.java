package multitreding;

public class ThreadDemo extends Thread {

        public void run()
        {
            for (int i = 0; i < 3 ; i++)
            {
                System.out.println("Codekul");
            }
        }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
    }
}

