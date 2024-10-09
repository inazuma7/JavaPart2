package innerClass;

class Car {
    String carName;
    String carType;

    // Constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    
    private String getCarName() {
        return this.carName;
    }

    // Inner class
    class Engine {
        String engineType;

        
        void setEngine() {
            
            if (Car.this.carType.equals("4WD")) {

               
                if (Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            } else {
                this.engineType = "Bigger";
            }
        }

        
        String getEngineType() {
            return this.engineType;
        }
    }

    
    public static void main(String[] args) {
       
        Car car1 = new Car("Mazda", "8WD");
        
        Engine engine1 = car1.new Engine();
        engine1.setEngine();
        System.out.println("Engine Type for 8WD= " + engine1.getEngineType());

        // new object
        Car car2 = new Car("Crysler", "4WD");

        // object inner class
        Engine engine2 = car2.new Engine();
        engine2.setEngine();
        System.out.println("Engine Type for 4WD = " + engine2.getEngineType());
    }
}

