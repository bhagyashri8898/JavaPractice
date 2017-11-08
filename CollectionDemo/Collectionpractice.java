package CollectionDemo;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionpractice
{
    public static void main(String[] args)
    {
        System.out.println("LIST:\t");
        List<String> list=new ArrayList<>();
        list.add("Vasu");
        list.add("Pooja");
        list.add("Sonali");
        list.add("Poonam");
        list.add("Rajan");
        list.add("Bhagyashri");

        for (String s:list)
        {
            System.out.println("s");
        }
        System.out.println();

        System.out.println("SET:\n");
        Set<String> set=new TreeSet<>();
        set.add("Pooja");
        set.add("Sonali");
        set.add("Rajan");

        for(String s:list)
        {
            System.out.println("s");
        }
        System.out.println();

        System.out.println("HASHCOD:\n");


    }
}
