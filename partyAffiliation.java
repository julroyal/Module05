import java.util.Scanner;

public class partyAffiliation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String partyAffiliation = "";

        System.out.println("With which political party do you identify? " +
                "(Type: D for Democrat, R for Republican, I for Independent," +
                " or O for other) ");
        partyAffiliation = in.nextLine();

        if (partyAffiliation.equalsIgnoreCase("d")) {
            System.out.println("You get a Democratic Donkey!");
        } else {
            if (partyAffiliation.equalsIgnoreCase("r")) {
                System.out.println("You get a Republican Elephant!");
            } else {
                if (partyAffiliation.equalsIgnoreCase("i")) {
                    System.out.println("You get an Independent Person!");
                } else {
                    System.out.println("You get Other!");
                }
            }
        }
    }}