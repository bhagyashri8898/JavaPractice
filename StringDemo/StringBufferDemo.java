package StringDemo;

import jdk.internal.dynalink.beans.StaticClass;

public class StringBufferDemo
{
    static double s1;
    static long s2;
    static long s3;

  static void usingstring()
  {
      String p="Sangli";
      for(int i=0;i<=200000;i++)
      {
          p.concat("Pune");
      }
  }
  static void usingstringbuffer()
  {
      StringBuffer p=new StringBuffer("Sangli");
      for(int i=0;i<=200000;i++)
      {
          p.append("Pune");
      }
  }
  static void usingstringbuild()
  {
      StringBuilder m=new StringBuilder("Bhagyashri");
      for(int i=0;i<=200000;i++)
      {
          m.append("Bhagyashri");
      }
  }

    public static void main(String[] args)
    {
        s1=System.currentTimeMillis();
        StringBufferDemo.usingstring();
        System.out.println("time for String="+(System.currentTimeMillis()-s1)+"ms");

        s2=System.currentTimeMillis();
        StringBufferDemo.usingstringbuffer();
        System.out.println("time for StringBuffer="+(System.currentTimeMillis()-s2)+"ms");

        s3=System.currentTimeMillis();
        StringBufferDemo.usingstringbuild();
        System.out.println("time for String="+(System.currentTimeMillis()-s3)+"ms");

    }
}
