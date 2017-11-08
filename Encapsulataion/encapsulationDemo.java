package Encapsulataion;

public class encapsulationDemo
{
    int id;
    String name;
    String city;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
  class setData
  {
      public static void main(String[] args)
      {
          encapsulationDemo encapsulationDemo=new encapsulationDemo();
          encapsulationDemo.setId(1);
          encapsulationDemo.setName("Bhagyashri");
          encapsulationDemo.setCity("Sangli");

          System.out.println(encapsulationDemo.getId());
          System.out.println(encapsulationDemo.getName());
          System.out.println(encapsulationDemo.getCity());

       }
  }