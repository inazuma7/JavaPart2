package innerClass;


class OuterClass {
    private int x = 10;  // Outer class variable
    
    // Non-static inner class
    class InnerClass {
        public void display() {
            System.out.println("Outer class value x = " + x);  // Can access outer class members
        }
    }
    
    public void showInner() {
        InnerClass inner = new InnerClass();  // Instantiate inner class from outer class
        inner.display();
    }
}

public class InnerClass1 {

    public static void main(String[] args) {
        // First, instantiate the outer class
        OuterClass outer = new OuterClass();
        
        // Then, instantiate the inner class
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        // Use inner class method
        inner.display();  // Output: Outer class value x = 10
    }
}
