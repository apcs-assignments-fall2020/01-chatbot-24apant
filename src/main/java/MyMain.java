import java.util.Objects;
import java.util.Scanner;



public class MyMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hello " + name + ", I am a chatbot.");

        System.out.print("How old are you? ");
        String age_str = scan.next();
        int age = Integer.parseInt(age_str);
        int AGE_THRESH = 21;
        if (age > AGE_THRESH) {
            System.out.println("Wow. You are old");
        }
        else{
            System.out.println("Bruh you're young");
        }

        System.out.print("What is your favorite vegetable? ");
        String favVeg = scan.next();
        if (Objects.equals(favVeg, "Eggplant") || Objects.equals(favVeg, "eggplant")){
            System.out.println("Yes, you are a cultured human.");
        }
        else{
            System.out.println("Yuck, Eggplants are better than " + favVeg);
        }

        System.out.print("What do you like to do for a living? ");
        String hobby = scan.next();
        System.out.println("That's great, but I really didn't ask.");

        System.out.print("Are you of the male variation or female variation? ");
        String gender = scan.next();
        if (Objects.equals(gender, "Male") || Objects.equals(gender, "male")){
            System.out.println("Cool, my creator is a male");
        }
        else{
            System.out.println("Great for you");
        }


        scan.close();
    }

}
