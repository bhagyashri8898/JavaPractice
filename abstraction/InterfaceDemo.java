package abstraction;

public interface InterfaceDemo
{
    void call();
    void  mesg();
    void games();

}
class Mobiledemo implements InterfaceDemo
{
  public void call()
  {
      System.out.println("calling");
  }
  public void mesg()
  {
      System.out.println("mesg");
  }
  public void games()
  {
      System.out.println("playing game");
  }

    public static void main(String[] args)
    {
        InterfaceDemo i=new Mobiledemo();
        i.call();
        i.mesg();
        i.games();


    }
}
