public class Example {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
        d.eat();
        d.run(); 
        Animal.sleep(); 
    }
}

interface Animal {
    void walk();
    void eat();
    
    static void sleep() {
        System.out.println("Animal is sleep");
    }

    default void run() {
        System.out.println("this is default method Animal");
    }
}


class Dog implements Animal {
    public void walk() {
        System.out.println("Dog is walking");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}
