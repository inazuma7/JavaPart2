/*Static Nested Class and Non-static Methods:
Write a Java program to create an outer class called School with a static nested class Student. 
The Student class should have a non-static method displayStudentInfo() that prints the student's name and grade. 
Instantiate the Student class from the main method and call the displayStudentInfo() method*/

package innerClass;

//Outer class 
public class School {
 // Static nested class
 static class Student {
     String name;
     String grade;

     // Constructor
     Student(String name, String grade) {
         this.name = name;
         this.grade = grade;
     }

     // Non-static method
     void displayStudentInfo() {
         System.out.println("Student Name: " + name);
         System.out.println("Grade: " + grade);
     }
 }

 // Main method 
 public static void main(String[] args) {
     //instance static nested class
     School.Student student1 = new School.Student("Abu", "A");
     School.Student student2 = new School.Student("Siti", "B");

     // Calling method
     student1.displayStudentInfo();
     student2.displayStudentInfo();
 }
}

