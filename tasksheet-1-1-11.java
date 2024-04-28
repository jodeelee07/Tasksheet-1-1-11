class Vehicle {
  String make;
  String model;
  int year;

  protected void display() {
    System.out.println("Car Details:");
  }
}
class Car extends Vehicle {
  int numberOfDoors;
  public void displayDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Number of Doors: "+numberOfDoors);
  }
}
class TaskSheet1_1_11 {
  public static void main(String[] args) {
    // create an object of the subclass
    Car Unit = new Car();

    // access protected field and method
    // using the object of subclass
    Unit.make = "Toyota";
    Unit.model = "Camry";
    Unit.year = 2022;
    Unit.numberOfDoors = 4;
    
    Unit.display();
    Unit.displayDetails();
  }
}
