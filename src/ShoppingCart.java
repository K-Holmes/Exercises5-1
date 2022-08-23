public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 0;
        double tax = 1.04;
        double total;
        String message = custName+" wants to purchase "+quantity+" "+itemDesc;

        // Calculating total cost
        total = (price*quantity)*tax;


        // Declare outOfStock variable and initialize it
        boolean outOfStock;


        // Test quantity and modify message if quantity > 1.
        if (quantity == 0) {
            outOfStock = true;
            itemDesc = "Shirts";
        }
        else {
            outOfStock = false;
            if (quantity > 1) {
                itemDesc = "Shirts";
            }
            else {
                itemDesc= "Shirt";
            }
        }
        message = custName+" wants to purchase "+quantity+" "+itemDesc;

        // Test outOfStock and notify user in either case.
        if (outOfStock) {

            System.out.println(message);
            System.out.println("There are none left, so they leave empty-handed");
        }
        else {
            System.out.println(message);
            System.out.println("It costs $" + total);
        }



    }

}


