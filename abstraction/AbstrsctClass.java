package abstraction;

abstract class Mobile
{
    abstract void call();
    abstract void mesg();

    void game()
    {
        System.out.println("playing game");
    }
}
 abstract class cellphone extends Mobile
 {
     void call()
     {
         System.out.println("calling");
     }
     void mesg()
     {
         System.out.println("mesg");
     }
 }
 class Abstraction extends cellphone
 {
     public static void main(String[] args) {
         Mobile m=new Abstraction();
         m.call();
         m.mesg();
         m.game();
     }
 }

