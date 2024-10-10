

public class Cat {
 String name;
 String breed;
 int age;

 
 public Cat(String name, String breed, int age) {
     this.name = name;
     this.breed = breed;
     this.age = age;
 }

 
 void catEat() {
     System.out.println(name + " is eating.");
 }

 
 void displayInfo() {
     System.out.println("Cat Name: " + name);
     System.out.println("Cat Breed: " + breed);
     System.out.println("Cat Age: " + age + " years");
 }

 
 public static void main(String[] args) {
     
     Cat myCat1 = new Cat("Whiskers", "Siamese", 3);
     myCat1.catEat();
     myCat1.displayInfo(); 
     
     
     Cat  myCat2 = new Cat ("Oyen", "Tabby", 2);
     myCat2.catEat();
     myCat2.displayInfo();
     
     
 }
}