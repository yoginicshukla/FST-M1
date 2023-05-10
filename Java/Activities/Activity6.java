package activities;

public class Activity6 {


        public static void main(String[] args) throws InterruptedException {
            Plane plane = new Plane(10);

            plane.onboard("John");
            plane.onboard("Steve");
            plane.onboard("Anna");
            //Plane takes off
            System.out.println("Plane took off at: " + plane.takeOff());
            //Print list of people on board
            System.out.println("People on the plane: " + plane.getPassengers());
            //Flying.....
            Thread.sleep(5000);
            //Plane has landed
            plane.land();
            //Plane lands
            System.out.println("Plane landed at: " + plane.getLastTimeLanded());
            System.out.println("People on the plane after landing: " + plane.getPassengers());
        }
    }

