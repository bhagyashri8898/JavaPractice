package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Aniket");
        list.add("Pooja");
        list.add("Ravi");
        list.add("vasu");
        list.add("Manali");
        list.add("Pritam");
        list.add("Pavan");
        System.out.println("Currently the Array list:" + list);

        list.add("Bhagyashri");
        list.add(4, "Dhanu");
        System.out.println("Current Array list is:" + list);


        list.remove(3);
        list.remove("Aniket");
        System.out.println("Current Array list is:" + list);

    }
    }



