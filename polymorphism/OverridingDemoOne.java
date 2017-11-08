package polymorphism;

    class Animal {
        void sound()
        {
            System.out.println(" Sound");
        }
    }

    class Cat extends Animal
    {
        void sound()
        {
            System.out.println("Cat mau");
        }
    }

    class Dog extends Animal
    {
        void sound()
        {
            System.out.println("Dog bhau");
        }
    }

    class overridingDemoOne extends Animal {


        public static void main(String[] args) {
            Animal a = new Animal();
            a.sound();
            Cat c = new Cat();
            c.sound();
            Dog d = new Dog();
            d.sound();
        }
    }

