import java.util.Scanner;

public class theaterKiosk {
    public static void main(String[] args) {

        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        age = in.nextInt();

        if (age >= 21) {
            age = in.nextInt();
            in.nextLine();
        System.out.println("Congrats! You get a paper wrist band!");
    }
    }}