public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Car myBicycle = new Bicycle("RX 340", 4, "leather");
    System.out.println(myBicycle.getName()); // inherited method
    System.out.println(myBicycle.getWheels()); // inherited method
    System.out.println(myBicycle.getgearCount()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.ringBell(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects

    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Car myScooter = new Bicycle("New Scooter", 4, "metal");
    System.out.println(myBicycle.getName()); // inherited method
    System.out.println(myBicycle.getWheels()); // inherited method
    System.out.println(myBicycle.getcoilCount()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.Bellrung(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects








  }
}