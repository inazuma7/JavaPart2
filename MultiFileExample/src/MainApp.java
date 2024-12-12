
// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        // Create instances of Person and Student
        Person person1 = new Person("Alice", 25);
        Student student1 = new Student("Charlie", 20, "S12345");

        // Display their information
        person1.displayInfo();
        student1.displayInfo();
    }
}
