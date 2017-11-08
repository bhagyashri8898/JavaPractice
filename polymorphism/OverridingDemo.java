package polymorphism;

import com.sun.org.apache.bcel.internal.generic.NEW;


    class Rbi {
        int Rateofinterest() {
            return 10;
        }
    }

    class bom extends Rbi {
        int Rateofinterest() {
            return 7;
        }
    }

    class axis extends Rbi {
        int Rateofinterest() {
            return 6;
        }
    }

    class sbi extends Rbi {
        int Rateofinterest() {
            return 9;
        }
    }

    class icici extends Rbi {
        int Rateofinterest() {
            return 8;
        }
    }

    class overrridingDemo extends Rbi

    {

        public static void main (String[]args)
        {
            Rbi r = new Rbi();
            bom b = new bom();
            axis a = new axis();
            sbi s = new sbi();
            icici i = new icici();
            System.out.println("Rateofinterest of Rbi"+r.Rateofinterest());

            System.out.println("Rateofinterest of Rbi");
            b.Rateofinterest();
            System.out.println("Rateofinterest of Rbi");
            a.Rateofinterest();
            System.out.println("Rateofinterest of Rbi");
            s.Rateofinterest();
            System.out.println("Rateofinterest of Rbi");
            i.Rateofinterest();


        }

    }
