package innerClass;

public class Cat {
    String name;
    String breed;
    int age;

    // Constructor
    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Method in Cat class
    void catHi() {
        System.out.println( "Hello "+ name);
    }

    
    void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Breed: " + breed);
        System.out.println("Cat Age: " + age + " years");
    }

    // Inner class representing the cat's behavior
    class Behavior {
        // Inner class method
        void sleep() {
            System.out.println(name + " is sleeping.");
        }
        
        void purr() {
            System.out.println(name + " is purring.");
        }
    }

    // Main method
    public static void main(String[] args) {
    	
        Cat myCat1 = new Cat("Whiskers", "Siamese", 3);
        myCat1.catHi();
        myCat1.displayInfo();

        //inner class Behavior
        Behavior catBehavior1 = myCat1.new Behavior();
        catBehavior1.sleep();
        catBehavior1.purr();
        
        Cat myCat2 = new Cat("Oyen", "Domestic Short Hair", 1);
        myCat2.catHi();
        myCat2.displayInfo();
        
        Behavior catBehavior2 = myCat2.new Behavior();
        catBehavior2.purr();
    }
}


