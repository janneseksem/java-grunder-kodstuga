package week5_inheritance_interface_enum;

public interface Drivable {
    void drivabled();
}

class Car implements Drivable{
    @Override 
    public void drivabled(){
        System.out.println("Car is drivable");
    }
}

class Bicycle implements Drivable{
    @Override 
    public void drivabled(){
        System.out.println("Bicycle is drivable");
    }

}

class Scooter implements Drivable{
    @Override 
    public void drivabled(){
        System.out.println("Scooter is drivable");
    }
}
