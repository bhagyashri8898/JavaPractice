package StringDemo;

import com.sun.javafx.image.BytePixelSetter;
import com.sun.org.apache.xpath.internal.SourceTree;

public class StringPract {
    public static void main(String[] args) {


        String s = "Bhagyashri";
        String s1 = "Bhagyashri";
        String s2 = new String("Vasu");


        if (s==(s2))
        {
            System.out.println("Same Values");
        }
        else {
            System.out.println("Different Values");
        }
    }
}
