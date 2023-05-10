package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String args[]) {
        HashMap<Integer, String> colours = new HashMap<>();
        colours.put(1,"Blue");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Red");
        colours.put(5,"Pink");
        System.out.println(colours.values());
        colours.remove(4);
        System.out.println(colours.values());
        if(colours.containsValue("Green")){
            System.out.println("Green color exists");}
            else{
                System.out.println("Green color not exist");
            }
            System.out.println("number of colors in map is "+ colours.size());
        }



    }

