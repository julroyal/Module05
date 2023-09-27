import java.util.Scanner;


public class birthMonth {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Enter your birth month as a number 1-12: ");
        birthMonth = in.nextInt();

        if(birthMonth >= 1 && birthMonth <= 12 ) {
            birthMonth = in.nextInt();
            in.nextLine();
            System.out.println("Your birth month is " + birthMonth);
        }
        else {
            System.out.println("Invalid month value; please try again.");
        }
        }
    }