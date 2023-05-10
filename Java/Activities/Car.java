package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car() {
        tyres=4;
        doors=4;
    }
    public void displayCharacteristics(){
System.out.println("Color of the Car:"+color);
        System.out.println("Make of the Car:"+make);
        System.out.println("Transmission of the Car:"+transmission);
        System.out.println("Number of Doors of the Car:"+doors);
        System.out.println("Number of Tyres of the Car:"+tyres);


    }
    public void accelarate(){
        System.out.println("Car is moving forword.");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
