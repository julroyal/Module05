import java.util.Scanner;

public class shipCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int itemPrice = 0;
        double shippingPrice = 0;
        double totalCost = 0;
        final double SHIPPING_RATE = 0.02;

        System.out.println("Enter your item price: ");
        itemPrice = in.nextInt();

        if(itemPrice >= 100) {
            itemPrice = in.nextInt();
            in.nextLine();
            shippingPrice = 0;
            System.out.println("Your shipping price is " + shippingPrice);
        }
        else if(itemPrice < 100) {
            itemPrice = in.nextInt();
            in.nextLine();
            shippingPrice = (double) (itemPrice * SHIPPING_RATE);
            System.out.println("Your shipping price is " + shippingPrice);
    }
        in.close();
        totalCost = itemPrice + shippingPrice;
        System.out.println("Your total cost is " + totalCost);
    }
}
