package activities;

//Abstract class



public class Activity5 {

    public static void main(String []args) {
        String title = "Hover Car Racer";
        //Create object for MyBook
        Book newNovel = new MyBook();

        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}
