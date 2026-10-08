package Klasser;

public class Robot {

    public String name;
    private double battery;

    Robot(String name, double battery){
        this.name = name;
        this.battery = 5000.37;
    }

    void visaStatus(){
        System.out.println(name);
        System.out.println(battery);
    }
    
}
