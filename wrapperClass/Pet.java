package wrapperClass;

public class Pet {
    private String name;
    private String type;
    private int age;

    // Constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

     
    public static class PetWrapper {
        private Pet pet;

        // Constructor
        public PetWrapper(Pet pet) {
            this.pet = pet;
        }

        // Method to retrieve the values from the wrapped Pet object
        public String getName() {
            return "Pet's name is: " + pet.getName();
        }

        public String getType() {
            return "Pet's type is: " + pet.getType(); 
        }

        // format the age
        public String getFormattedAge() {
            return pet.getAge() + " years old";
        }

        // method to check if the pet is a senior or not
        public boolean isSenior() {
            return pet.getAge() > 5;
        }
    }

    // Main method
    public static void main(String[] args) {
        // Object
        Pet dog = new Pet("Wolfie", "Dog", 6);
        Pet cat = new Pet("Oyen", "Cat", 3);
        Pet rabbit = new Pet("Snowball", "Rabbit", 2);

        // PetWrapper instances
        PetWrapper dogWrapper = new PetWrapper(dog);
        PetWrapper catWrapper = new PetWrapper(cat);
        PetWrapper rabbitWrapper = new PetWrapper(rabbit);
        
        
        System.out.println(dogWrapper.getName());
        System.out.println(dogWrapper.getType());
        System.out.println("Dog's Age: " + dogWrapper.getFormattedAge());
        System.out.println("Is Dog a Senior? " + dogWrapper.isSenior());

        System.out.println(catWrapper.getName());
        System.out.println(catWrapper.getType());
        System.out.println("Cat's Age: " + catWrapper.getFormattedAge());
        System.out.println("Is Cat a Senior? " + catWrapper.isSenior());

        System.out.println(rabbitWrapper.getName());
        System.out.println(rabbitWrapper.getType());
        System.out.println("Rabbit's Age: " + rabbitWrapper.getFormattedAge());
        System.out.println("Is Rabbit a Senior? " + rabbitWrapper.isSenior());
    }
}


